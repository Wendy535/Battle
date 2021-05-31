package com.example.battle

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ActivityRules : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rules)

        findViewById<Button>(R.id.buttonRulesOk).setOnClickListener {
            finish()
        }
    }
}
