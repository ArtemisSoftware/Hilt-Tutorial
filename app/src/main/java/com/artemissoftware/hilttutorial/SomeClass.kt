package com.artemissoftware.hilttutorial

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject
import javax.inject.Singleton

@ActivityScoped
class SomeClass @Inject constructor(private val someOtherClass: SomeOtherClass){

    fun doAThing(): String{
        return "Something was done!!"
    }

    fun doSomeOtherThing(): String{
        return someOtherClass.doSomeOtherThing() + " in the someclass"
    }
}