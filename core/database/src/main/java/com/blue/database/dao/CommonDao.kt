package com.blue.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.blue.database.entity.CommonEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface CommonDao {
    @Query("Select * From common")
    fun getData(): Flow<List<CommonEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertData(data: CommonEntity)

    @Query("Delete From common Where id = :targetId")
    suspend fun deleteData(targetId: Int)
}