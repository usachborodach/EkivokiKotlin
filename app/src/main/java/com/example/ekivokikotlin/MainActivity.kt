package com.example.ekivokikotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var pOutput: TextView
    private lateinit var pInput: EditText

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pOutput = findViewById(R.id.oOutput)
        pInput = findViewById(R.id.oInput)

        val pKnopka: Button = findViewById(R.id.oKnopka)

        pKnopka.setOnClickListener {
            if (pInput.text.isEmpty()) {
                pOutput.text = "Вы ничего не ввели!"
            } else {
                pOutput.text = "Привет, " + pInput.text
            }
        }
    }
}