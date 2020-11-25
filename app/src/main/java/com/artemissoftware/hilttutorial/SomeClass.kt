package com.artemissoftware.hilttutorial

import javax.inject.Inject

class SomeClass @Inject constructor(private val someOtherClass: SomeOtherClass){

    fun doAThing(): String{
        return "Something was done!!"
    }

    fun doSomeOtherThing(): String{
        return someOtherClass.doSomeOtherThing() + " in the someclass"
    }
}