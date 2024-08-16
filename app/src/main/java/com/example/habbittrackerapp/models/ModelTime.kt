package com.example.habbittrackerapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "chooseTime")
data class ModelTime(
    @PrimaryKey(autoGenerate = true)
    val id : Int = 0,
    val morningTime : String,
    val eveningTime : String
)
