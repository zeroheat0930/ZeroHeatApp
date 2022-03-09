package com.zeroheat.zeroheatapp

import androidx.appcompat.app.AppCompatActivity

abstract class BaseBootCamp : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvents(

    )
    abstract fun setValues(

    )

}