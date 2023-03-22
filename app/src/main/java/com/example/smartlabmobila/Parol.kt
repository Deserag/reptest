package com.example.smartlabmobila

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.widget.Button
import android.widget.EditText

class Parol : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parol)

        var countDownTimer: CountDownTimer
        countDownTimer = object : CountDownTimer(60000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
                // Выполняется каждую секунду до завершения таймера
                // Здесь можно обновлять UI, например, отображать оставшееся время
            }

            override fun onFinish() {
                // Выполняется по завершении таймера
            }
        }
    }
    fun perexod(view: View){
        val monitorIntent = Intent(this@Parol, Acrivnosti:: class.java)
        startActivity(monitorIntent)}
}