package com.example.habbittrackerapp.repositories

import androidx.lifecycle.LiveData
import com.example.habbittrackerapp.models.ModelTime
import com.example.habbittrackerapp.room.TimeDAO

class TimeRepository(val timeDAO: TimeDAO) {

    suspend fun insertTime(modelTime: ModelTime) {
       timeDAO.insertTime(modelTime)
    }

    fun getTimeById(id : Int) : LiveData<ModelTime>{
        return timeDAO.getTimeById(id)
    }
}