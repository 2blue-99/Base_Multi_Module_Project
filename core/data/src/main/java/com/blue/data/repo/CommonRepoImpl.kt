package com.blue.data.repo

import com.blue.data.mapper.CommonMapper.toModel
import com.blue.database.dao.CommonDao
import com.blue.database.entity.toEntity
import com.blue.domain.model.Common
import com.blue.domain.repo.CommonRepo
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class CommonRepoImpl @Inject constructor(
    private val commonDao: CommonDao
): CommonRepo {
    override fun getTestApi(): Flow<List<Common>> {
        return commonDao.getData().map {
            it.map { it.toModel() }
        }
    }

    override suspend fun insertTestApi(common: Common) {
        commonDao.upsertData(common.toEntity())
    }
}