package com.artemissoftware.hilttutorial

import javax.inject.Inject

class SomeInterfaceImpl @Inject constructor() : SomeInterface {
    override fun doSomeOtherThing(): String {
        return " a thing from the interface"
    }
}