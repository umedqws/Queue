package com.example.hospital.Data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [Users::class,],
    version = 1,
    exportSchema = false
)


abstract class DBase: RoomDatabase() {
    abstract fun usersDao():UserDao

    companion object{
        @Volatile
        private var INSTANCE:DBase? = null

        fun getInstance(context: Context):DBase{
            kotlin.synchronized(this) {

                if (INSTANCE == null) {
                    // мы еще ни разу не создавали БД
                    val builder = Room.databaseBuilder(
                        context.applicationContext,
                        DBase::class.java,
                        "Hos_db"
                    )

                    INSTANCE = builder.build()
                    return INSTANCE!!
                }
                // БД уже была создана
                return INSTANCE!!
            }
        }
    }
}