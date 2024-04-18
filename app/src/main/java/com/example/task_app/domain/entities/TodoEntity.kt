package com.example.task_app.domain.entities

data class TodoEntity(
    val id: Int,
    val todo: String,
    val completed: Boolean,
    val userId: Int,
){
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as TodoEntity

        if (id != other.id) return false
        if (todo != other.todo) return false
        if (completed != other.completed) return false
        if (userId != other.userId) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id.hashCode()
        result = 31 * result + todo.hashCode()
        result = 31 * result + (completed.hashCode() ?: 0)
        result = 31 * result + userId.hashCode()
        return result
    }

};
