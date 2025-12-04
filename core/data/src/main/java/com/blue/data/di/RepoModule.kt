package com.blue.data.di

import com.blue.data.repo.CommonRepoImpl
import com.blue.domain.repo.CommonRepo
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepoModule {
    @Binds
    abstract fun bindRepo(commonRepoImpl: CommonRepoImpl): CommonRepo
}
