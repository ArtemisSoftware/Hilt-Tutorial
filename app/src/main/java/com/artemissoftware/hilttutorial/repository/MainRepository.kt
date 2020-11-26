package com.artemissoftware.hilttutorial.repository

import com.artemissoftware.hilttutorial.models.Blog
import com.artemissoftware.hilttutorial.retrofit.BlogRetrofit
import com.artemissoftware.hilttutorial.retrofit.NetworkMapper
import com.artemissoftware.hilttutorial.room.BlogDao
import com.artemissoftware.hilttutorial.room.CacheMapper
import com.artemissoftware.hilttutorial.util.DataState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainRepository constructor(
    private val blogDao: BlogDao,
    private val blogRetrofit: BlogRetrofit,
    private val cacheMapper: CacheMapper,
    private val networkMapper: NetworkMapper
){
    suspend fun getBlogs(): Flow<DataState<List<Blog>>> = flow {
        emit(DataState.Loading)
        delay(1000) //For teaching purpose. Dont do this in production there is no point
        try{
            val networkBlogs = blogRetrofit.get()
            val blogs = networkMapper.mapFromEntityList(networkBlogs)
            for(blog in blogs){
                blogDao.insert(cacheMapper.mapToEntity(blog))
            }
            val cachedBlogs = blogDao.get()
            emit(DataState.Success(cacheMapper.mapFromEntityList(cachedBlogs)))
        }catch (e: Exception){
            emit(DataState.Error(e))
        }
    }
}