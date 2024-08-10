package com.jetpackcompose

import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)

fun getDummyTodos(): List<Todo> {
    return listOf(
        Todo(1, "Buy groceries", Date()),
        Todo(2, "Walk the dog", Date()),
        Todo(3, "Wash the car", Date()),
        Todo(4, "Mow the lawn", Date()),
    )
}
