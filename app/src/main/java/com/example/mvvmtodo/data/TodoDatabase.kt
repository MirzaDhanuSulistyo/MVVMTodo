package com.example.mvvmtodo.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.mvvmtodo.data.Todo
import com.example.mvvmtodo.data.TodoDao

@Database(
    entities = [Todo::class],
    version = 1
)
abstract class TodoDatabase: RoomDatabase() {

    abstract val dao: TodoDao
}