package com.jetpackcompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TodoViewModel : ViewModel() {

    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList: LiveData<List<Todo>> = _todoList

    fun getAllTodos() {
        _todoList.value = TodoManager.getAllTodos().reversed()
    }

    fun addNewTodo(title: String) {
        TodoManager.addNewTodo(title)
        getAllTodos()
    }

    fun deleteTodoById(id: Int) {
        TodoManager.deleteTodoById(id)
        getAllTodos()
    }
}