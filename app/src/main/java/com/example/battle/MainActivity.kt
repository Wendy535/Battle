package com.example.battle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var buttonStartGame: Button
    private lateinit var buttonRules: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

        buttonStartGame = findViewById(R.id.buttonStartGame)
        buttonStartGame.setOnClickListener {
            val intentToSetShips = Intent(this, ActivitySetShips::class.java)
            startActivity(intentToSetShips)
        }

        buttonRules = findViewById(R.id.buttonRules)
        buttonRules.setOnClickListener {
            val intentToRules = Intent(this, ActivityRules::class.java)
            startActivity(intentToRules)
        }

    }

}

