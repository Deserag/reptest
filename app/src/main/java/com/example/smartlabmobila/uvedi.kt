package com.example.smartlabmobila

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class uvedi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_uvedi)
    }
    fun monitor(view:View){
        val monitorIntent = Intent(this@uvedi, monitroing:: class.java)
        startActivity(monitorIntent)
    }
    fun govna1(view:View){
        val monitorIntent = Intent(this@uvedi, MainActivity:: class.java)
        startActivity(monitorIntent)
    }
    fun govna2(view:View){
        val monitorIntent = Intent(this@uvedi, monitroing:: class.java)
        startActivity(monitorIntent)
    }
}
