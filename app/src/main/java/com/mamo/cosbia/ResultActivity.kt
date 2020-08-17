package com.mamo.cosbia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
//creating an intent that gets the users details and their score
        val username = intent.getStringExtra(ConstantsGeneral.USER_NAME)
        val totalQuestions = intent.getIntExtra(ConstantsGeneral.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(ConstantsGeneral.CORRECT_ANSWERS, 0)

        tv_score.text = "Your Score is $correctAnswers out of $totalQuestions"
        if(correctAnswers <=3){
            tv_congratulations.text= "Sorry " + username +" You did not perform well please setake the the Quizz"
            btn_retake.setOnClickListener {
                startActivity(Intent(this, GeneralThreatsQuestions::class.java))
                finish()
            }
        }
        else{
            tv_congratulations.text= "Congradulations " + username + " You Passed"
            btn_finish.setOnClickListener {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
            }
        }
    }
}