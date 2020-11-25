package com.artemissoftware.hilttutorial

import javax.inject.Inject

class SomeInterfaceImpl2 @Inject constructor() : SomeInterface {
    override fun doSomeOtherThing(): String {
        return " a thing from the interface 2"
    }
}