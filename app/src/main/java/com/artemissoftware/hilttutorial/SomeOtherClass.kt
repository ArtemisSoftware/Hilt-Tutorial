package com.artemissoftware.hilttutorial

import javax.inject.Inject

class SomeOtherClass @Inject constructor(){

    fun doSomeOtherThing() : String{
        return "Something other was done!!"
    }

}