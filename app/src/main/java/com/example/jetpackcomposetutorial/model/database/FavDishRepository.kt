package com.example.jetpackcomposetutorial.model.database

import androidx.annotation.WorkerThread
import com.example.jetpackcomposetutorial.model.entities.FavDish
import kotlinx.coroutines.flow.Flow

class FavDishRepository(
    private val favDishDao: FavDishDao
    ) {
    @WorkerThread
    suspend fun insertFaveDishData(favDish: FavDish) {
        favDishDao.insertFavDishDetails(favDish)
    }

    val allDishesList: Flow<List<FavDish>> = favDishDao.getAllDishesList()
}