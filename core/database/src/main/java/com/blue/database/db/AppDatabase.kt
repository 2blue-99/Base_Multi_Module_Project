package com.blue.database.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.blue.database.dao.CommonDao
import com.blue.database.entity.CommonEntity

@Database(
    entities = [CommonEntity::class],
    version = 1
)
abstract class AppDatabase: RoomDatabase() {
    abstract fun CommonDao(): CommonDao
}