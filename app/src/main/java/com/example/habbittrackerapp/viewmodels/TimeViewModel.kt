package com.example.habbittrackerapp.viewmodels

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.habbittrackerapp.models.ModelTime
import com.example.habbittrackerapp.repositories.TimeRepository
import com.example.habbittrackerapp.room.AppDataBase
import kotlinx.coroutines.launch

class TimeViewModel(application: Application) : AndroidViewModel(application) {
    private val repository: TimeRepository

    init {
        val timeDAO = AppDataBase.getDataBase(application).timeDAO()
        repository = TimeRepository(timeDAO)
    }

    fun insertTime(modelTime: ModelTime) = viewModelScope.launch {
       repository.insertTime(modelTime)
    }

    fun getTimeById(id: Int): LiveData<ModelTime> {
        return repository.getTimeById(id)
    }
}
