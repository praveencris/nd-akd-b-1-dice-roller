package com.sabkayar.praveen.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener() {
            rollDice()
        }

    }

    private fun rollDice() {
        val number: Int = Random.nextInt(6) + 1
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = number.toString()
    }
}