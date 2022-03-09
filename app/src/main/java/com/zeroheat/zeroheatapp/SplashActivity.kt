package com.zeroheat.zeroheatapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zeroheat.zeroheatapp.utils.ServerUtil

class SplashActivity : BaseBootCamp() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        var isTokenOk = false //토큰이있다면 변수를 기본적으로 false상태 설정


    }

}