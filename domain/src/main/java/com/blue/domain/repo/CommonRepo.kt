package com.blue.domain.repo

import com.blue.domain.model.Common
import kotlinx.coroutines.flow.Flow

interface CommonRepo {
    fun getTestApi(): Flow<List<Common>>
    suspend fun insertTestApi(common: Common)
}