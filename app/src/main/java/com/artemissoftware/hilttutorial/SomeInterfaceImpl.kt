package com.artemissoftware.hilttutorial

import javax.inject.Inject

class SomeInterfaceImpl @Inject constructor(private val someString: String) : SomeInterface {
    override fun doSomeOtherThing(): String {
        return " a thing from the interface + ${someString}"
    }
}