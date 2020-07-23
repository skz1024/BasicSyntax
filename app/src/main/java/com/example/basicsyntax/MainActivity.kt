package com.example.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.i("BasicSyntax", "로그를 출력합니다. 메소드: Log.d")
        var myName = "폭탄킹"
        var myAge: Int = 9999
        myAge = myAge + 1
        Log.i("BasicSyntax", "myName = $myName, myAge = $myAge")
    }
}
