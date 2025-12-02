package com.blue.database.di

import com.blue.database.dao.CommonDao
import com.blue.database.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {
    @Singleton
    @Provides
    fun provideCommonDao(database: AppDatabase): CommonDao =
        database.CommonDao()
}