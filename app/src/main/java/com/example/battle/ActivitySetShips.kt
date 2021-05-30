package com.example.battle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.View.TEXT_ALIGNMENT_CENTER
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class ActivitySetShips : AppCompatActivity() {

    private lateinit var setPlayerBattleField: TableLayout
    private lateinit var buttonSetShipsOk: Button
    private lateinit var textviewSetShips: TextView
    private val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    private var shipCounter = 0
    //private var playerCoordinates: ArrayList<Pair<String, Int>>
    private var playerShips = 0

            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setships)

        setPlayerBattleField = findViewById(R.id.setPlayerBattleField)
        buttonSetShipsOk = findViewById(R.id.buttonFinishedShipsSetting)
        textviewSetShips = findViewById(R.id.textCheckSetShips)

        setShips()

        buttonSetShipsOk.setOnClickListener{
            if (shipCounter == 20) {
                val intentFromSettingToGame = Intent(this, ActivityGame::class.java)
                startActivity(intentFromSettingToGame)
            } else {
                textviewSetShips.text = getString(R.string.text_check_your_ships_ok)
            }
        }


    }

    private fun setShips() {
        for (x in 0..9)  {
            val playerFieldRow = setPlayerBattleField.getChildAt(x) as TableRow
            val playerFieldNumbers = TextView(this)
            val textviewParams = TableRow.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
            )
            textviewParams.weight = 1F
            playerFieldNumbers.textAlignment = TEXT_ALIGNMENT_CENTER
            playerFieldNumbers.text = (numbers[x]).toString()
            playerFieldRow.addView(playerFieldNumbers, 0, textviewParams)
            for (y in 1..10) {
                val playerFieldButton = Button(this)
                playerFieldButton.id = View.generateViewId()
                val playerbuttonParams = TableRow.LayoutParams(
                        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                playerbuttonParams.weight = 1F
                playerFieldButton.isClickable = true
                playerFieldButton.isAllCaps = true
                playerFieldButton.textAlignment = TEXT_ALIGNMENT_CENTER
                playerFieldRow.addView(playerFieldButton, y, playerbuttonParams)

                playerFieldButton.setOnClickListener {
                    playerFieldButton.setBackgroundColor(this.getResources().getColor(R.color.chathams_blue))
                    shipCounter ++
                    //playerCoordinates.add(Pair(playerFieldButton.id.toString(), y))

                }
            }
        }
    }
}