package com.example.smartlabmobila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class monitroing : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_monitroing)
    }
    fun perexod_activity(view: View){
        val perexodIntent = Intent(this@monitroing, MainActivity::class.java)
        startActivity(perexodIntent)
    }
    fun perexod_uvedi(view: View){
        val perexodIntent = Intent(this@monitroing, Registration::class.java)
        startActivity(perexodIntent)
    }
    fun perexod_registration(view: View){
        val perexodIntent = Intent(this@monitroing, Registration::class.java)
        startActivity(perexodIntent)}
}