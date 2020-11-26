package com.artemissoftware.hilttutorial.di

import com.artemissoftware.hilttutorial.repository.MainRepository
import com.artemissoftware.hilttutorial.retrofit.BlogRetrofit
import com.artemissoftware.hilttutorial.retrofit.NetworkMapper
import com.artemissoftware.hilttutorial.room.BlogDao
import com.artemissoftware.hilttutorial.room.CacheMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMainRepository(blogDao: BlogDao, retrofit: BlogRetrofit, cacheMapper: CacheMapper, networkMapper: NetworkMapper): MainRepository{
        return MainRepository(blogDao, retrofit, cacheMapper, networkMapper)
    }
}
