package com.mamo.cosbia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_general_threats_questions.*

class GeneralThreatsQuestions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_threats_questions)

        val questionList = Constants.getQuestions()
        Log.i("Questions Size", "${questionList.size}")

        val currentPositon = 1
        val question: GenThreaQues? = questionList[currentPositon -1]
        progressBar.progress = currentPositon
        tv_progress.text = "$currentPositon" + "/" + progressBar.max

        tv_gen_threa_ques.text = question!!.question
        //iv_image.setImageResource(question.image)
        option_one.text = question.optionOne
        option_two.text = question.optionTwo
        option_three.text = question.optionThree
        option_four.text = question.optionFour
    }
}
