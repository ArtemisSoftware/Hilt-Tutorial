package com.artemissoftware.hilttutorial

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Qualifier
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class MyProvidesModule {



    @Impl1
    @Singleton
    @Provides
    fun provideSomeInterface1(): SomeInterface{
        return SomeInterfaceImpl();
    }

    @Impl2
    @Singleton
    @Provides
    fun provideSomeInterface2(): SomeInterface{
        return SomeInterfaceImpl2();
    }

}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Impl1

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Impl2