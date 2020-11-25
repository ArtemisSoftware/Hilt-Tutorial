package com.artemissoftware.hilttutorial

import androidx.fragment.app.Fragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MyFragment : Fragment(){

    @Inject
    lateinit var someClass: SomeClass

}