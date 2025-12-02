package com.blue.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.blue.domain.model.Common

// 로또 추첨 화면 > 선택 저장 로또 DB
@Entity(tableName = "common")
data class CommonEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val title: String,
)

fun Common.toEntity(): CommonEntity =
    CommonEntity(
        id = id,
        title = title,
    )
