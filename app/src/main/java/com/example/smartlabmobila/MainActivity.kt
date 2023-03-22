package com.example.smartlabmobila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
    }



    fun perexod(view: View){
        val perexodIntent = Intent(this@MainActivity, uvedi::class.java)
        startActivity(perexodIntent)
    }
    fun perexod_uvedi(view: View){
        val perexodIntent = Intent(this@MainActivity, uvedi::class.java)
        startActivity(perexodIntent)
    }
    fun perexod_monitor(view: View){
        val perexodIntent = Intent(this@MainActivity, monitroing::class.java)
        startActivity(perexodIntent)
    }
}
