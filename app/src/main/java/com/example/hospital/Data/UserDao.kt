package com.example.hospital.Data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface UserDao {
    @Query("SELECT * FROM Patient")
    fun getAllUser(): LiveData<List<Users>>
}