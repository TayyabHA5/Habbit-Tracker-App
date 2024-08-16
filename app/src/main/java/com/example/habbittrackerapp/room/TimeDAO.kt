package com.example.habbittrackerapp.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.habbittrackerapp.models.ModelTime


@Dao
interface TimeDAO {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTime(modelTime: ModelTime)

    @Query("SELECT * FROM chooseTime WHERE id = :id")
     fun getTimeById(id: Int): LiveData<ModelTime>

     @Query("SELECT * FROM chooseTime")
     fun getAllTimes() : LiveData<List<ModelTime>>
}