package com.example.battle

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityRules : AppCompatActivity() {

    private lateinit var buttonRulesOk: Button

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_rules)

            buttonRulesOk = findViewById(R.id.buttonRulesOk)
            buttonRulesOk.setOnClickListener {
                val intentFromRulesToMainActivity = Intent(this, MainActivity::class.java)
                startActivity(intentFromRulesToMainActivity)
            }
        }
}