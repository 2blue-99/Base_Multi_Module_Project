package com.blue.data.mapper

import com.blue.database.entity.CommonEntity
import com.blue.domain.model.Common

object CommonMapper {
    fun CommonEntity.toModel(): Common =
        Common(
            id = id,
            title = title,
        )
}