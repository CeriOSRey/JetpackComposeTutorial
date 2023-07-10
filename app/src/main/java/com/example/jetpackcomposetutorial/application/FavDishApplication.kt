package com.example.jetpackcomposetutorial.application

import android.app.Application
import com.example.jetpackcomposetutorial.model.database.FavDishRepository
import com.example.jetpackcomposetutorial.model.database.FavDishRoomDatabase

class FavDishApplication: Application() {
    private val database by lazy { FavDishRoomDatabase.getDatabase(this@FavDishApplication) }
    val repository by lazy { FavDishRepository(database.favDishDao()) }
}