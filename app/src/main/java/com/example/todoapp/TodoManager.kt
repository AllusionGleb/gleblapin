package com.example.todoapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import java.time.Instant
import java.util.Date

object TodoManager {

    private var todoList = mutableListOf<Todo>()


    fun getAllTodo(): List<Todo>{
        return todoList
    }

    fun addTodo (title : String){
        todoList.add(Todo(System.currentTimeMillis().toInt(),title, Date.from(Instant.now())))
    }

    fun deleteTodo(id : Int){
        todoList.removeIf{
            it.id==id
        }
    }

}
