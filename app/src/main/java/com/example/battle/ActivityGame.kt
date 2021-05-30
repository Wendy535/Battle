package com.example.battle

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout


class ActivityGame : AppCompatActivity() {

    private lateinit var enemyBattleField: TableLayout
    private lateinit var playerBattleField: TableLayout
    private lateinit var commentsBeforeEnemyField: TextView
    private lateinit var commentsBeforePlayerField: TextView
    private lateinit var buttonStart: Button
    private val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    private val positiveWords = arrayOf(
            "Попал!",
            "Точно в цель!",
            "Супер!",
            "Снайпер!",
            "Глаз-алмаз!",
            "Мастерски!",
            "Отлично!",
            "Победа близко!",
            "Круто!",
            "Так его!")

    private val missWords = arrayOf(
            "Целься лучше!",
            "Повезет в другой раз!",
            "Пробуем еще!",
            "Соберись!",
            "Он хорошо маскируется!",
            "Проверь прицел!",
            "Сконцентрируйся",
            "Думай как компьютер!", "Оступать некуда!")

    private val aiShot = arrayOf(
            "Ай!",
            "Ох!",
            "Бдыщ!",
            "Это было больно!",
            "Капитан, у нас проблемы!",
            "Уф!",
            "Тысяча чертей!",
            "Нам досталось!",
            "Ааааа!",
            "Да что ж такое!",
            "Опять!",
            "А он хорош!")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        enemyBattleField = findViewById(R.id.setPlayerBattleField)
        playerBattleField = findViewById(R.id.player_battle_field)
        commentsBeforeEnemyField = findViewById(R.id.commentsBeforeEnemyField)
        commentsBeforePlayerField = findViewById(R.id.commentsBeforePlayerField)
        buttonStart = findViewById(R.id.buttonStart)

        battleshipsGame()
    }

    private fun battleshipsGame() {
        initEnemyBattlefield()
        initPlayerBattleField()


    }

    private fun initEnemyBattlefield() {
        for (x in 0..9) {
            val ll = enemyBattleField.getChildAt(x) as TableRow
            val enemyFieldNumbers = TextView(this)
            val textviewParams = TableRow.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
            )
            textviewParams.weight = 1F
            enemyFieldNumbers.textAlignment = View.TEXT_ALIGNMENT_CENTER
            enemyFieldNumbers.text = (numbers[x]).toString()
            ll.addView(enemyFieldNumbers, 0, textviewParams)
            for (y in 1..10) {
                val enemyFieldButton = Button(this)
                enemyFieldButton.id = View.generateViewId()
                val buttonParams = TableRow.LayoutParams(
                        ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                        ConstraintLayout.LayoutParams.WRAP_CONTENT
                )
                buttonParams.weight = 1F
                enemyFieldButton.isClickable = true
                enemyFieldButton.isAllCaps = true
                enemyFieldButton.textAlignment = View.TEXT_ALIGNMENT_CENTER
                ll.addView(enemyFieldButton, y, buttonParams)
            }
        }
    }


    private fun initPlayerBattleField() {
        for (x in 0..9)  {
            val ll2 = playerBattleField.getChildAt(x) as TableRow
            val playerFieldNumbers = TextView(this)
            val textviewParams = TableRow.LayoutParams(
                    ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
                    ConstraintLayout.LayoutParams.WRAP_CONTENT,
            )
            textviewParams.weight = 1F
            playerFieldNumbers.textAlignment = View.TEXT_ALIGNMENT_CENTER
            playerFieldNumbers.text = (numbers[x]).toString()
            ll2.addView(playerFieldNumbers, 0, textviewParams)
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
                playerFieldButton.textAlignment = View.TEXT_ALIGNMENT_CENTER
                ll2.addView(playerFieldButton, y, playerbuttonParams)

            }
        }
    }
}