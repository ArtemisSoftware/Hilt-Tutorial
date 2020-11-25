package com.artemissoftware.hilttutorial

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton


class SomeClass @Inject constructor(private val someInterfaceImpl: SomeInterface){

    fun doAThing(): String{
        return "Look I got: ${someInterfaceImpl.doSomeOtherThing()}"
    }

    fun doSomeOtherThing(): String{
        return someInterfaceImpl.doSomeOtherThing() + " in the someclass"
    }
}