package com.example.kotlin_practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun Login(v:View){
        println("All RIGHT")

        var intent = Intent(this, LoginSuccessActivity::class.java)
        intent.putExtra("이름","")
        startActivity(intent)

    }
}