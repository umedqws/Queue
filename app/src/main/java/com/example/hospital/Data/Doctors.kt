package com.example.hospital.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Doctors")
data class Doctors(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val Special: String,
    val timeTable:String,
    val cabinet: Int,
)