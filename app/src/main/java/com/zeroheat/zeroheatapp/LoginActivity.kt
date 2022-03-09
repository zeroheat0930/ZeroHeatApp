package com.zeroheat.zeroheatapp

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.zeroheat.zeroheatapp.databinding.ActivityLoginBinding

class LoginActivity : BaseBootCamp() {

    lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        setupEvents()
        setValues()
    }
    override fun setupEvents() {

    }

    override fun setValues() {

    }
}
