package com.example.smartlabmobila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText


class Registration : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
    /*val email = findViewById<EditText>(R.id.email_adress)
    val button: Button = findViewById<Button>(R.id.Dallee)
        if (email.length() != 0) {
            button.isClickable = true
        }
<<<<<<< HEAD
        else {button.isClickable = false }
        */
=======
        else {button.isClickable = false }*/
>>>>>>> origin/master

}
    fun perexod(view: View){
        val monitorIntent = Intent(this@Registration, Parol:: class.java)
        startActivity(monitorIntent)}

}
