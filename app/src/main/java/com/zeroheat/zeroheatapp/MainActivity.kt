package com.zeroheat.zeroheatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : BaseBootCamp() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {

    }
}