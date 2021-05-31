package com.example.battle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

//HW:
//-присвоить квалификаторы для battle_logo
//-почитать про разницу между Serializable и Parcelable

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.buttonStartGame).setOnClickListener {
            val intentToSetShips = Intent(this, ActivitySetShips::class.java)
            startActivity(intentToSetShips)
        }

        findViewById<Button>(R.id.buttonRules).setOnClickListener {
            startActivity(Intent(this, ActivityRules::class.java))
        }
    }
}

