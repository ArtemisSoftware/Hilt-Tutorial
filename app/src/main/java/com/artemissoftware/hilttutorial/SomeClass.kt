package com.artemissoftware.hilttutorial

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton


class SomeClass @Inject constructor(@Impl1 private val someInterfaceImpl: SomeInterface, @Impl2 private val someInterfaceImpl2: SomeInterface){

    fun doAThing(): String{
        return "Look I got: ${someInterfaceImpl.doSomeOtherThing()}"
    }

    fun doAThing2(): String{
        return "Look I got: ${someInterfaceImpl2.doSomeOtherThing()}"
    }

    fun doSomeOtherThing(): String{
        return someInterfaceImpl.doSomeOtherThing() + " in the someclass"
    }
}