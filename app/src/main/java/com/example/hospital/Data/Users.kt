package com.example.hospital.Data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Patient")
data class Users (
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val name: String,
    val address: String,
    val phoneNumber: String,
    val password:String,
)