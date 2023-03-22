package com.example.smartlabmobila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.Window
import android.view.WindowManager



@Suppress("DEPRECATION")
class splashscreen : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        makefullScreen()


        setContentView(R.layout.activity_splashscreen)

        Handler().postDelayed({
            startActivity(Intent(this,MainActivity:: class.java))
            overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out)
        },3000)
    }

    private fun makefullScreen(){
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN,

        )
        supportActionBar?.hide()
    }
}