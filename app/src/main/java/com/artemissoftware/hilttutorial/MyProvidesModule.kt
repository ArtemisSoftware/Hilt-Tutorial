package com.artemissoftware.hilttutorial

import com.google.gson.Gson
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@InstallIn(ApplicationComponent::class)
@Module
class MyProvidesModule {

    @Singleton
    @Provides
    fun provideSomeString(): String{
        return "some string"
    }


    @Singleton
    @Provides
    fun provideSomeInterface(someString: String): SomeInterface{
        return SomeInterfaceImpl(someString);
    }

    @Singleton
    @Provides
    fun provideGson(): Gson{
        return Gson()
    }
}