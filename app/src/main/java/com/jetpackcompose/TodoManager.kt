package com.jetpackcompose

import java.util.Date

object TodoManager {

    private val todoList = mutableListOf<Todo>()

    fun getAllTodos() : List<Todo> {
        return todoList
    }

    fun addNewTodo(title: String) {
        todoList.add(Todo(
            id = System.currentTimeMillis().toInt(),
            title = title,
            createdAt = Date()
        ))
    }

    fun deleteTodoById(id: Int) {
        todoList.removeIf { it.id == id }
    }
}