package com.mamo.cosbia

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_general_threats_questions.*

/*This is the General Internet threats questions which are linked to the main Activity class by the start button
Clicking on the Start Button from the Main Activity calls this activity
* */
class GeneralThreatsQuestions : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionsList: ArrayList<Question>? = null
    private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_general_threats_questions)

        mQuestionsList= Constants.getQuestions() // this gets a list of questions from the file Constants which is a data file
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_three.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)
        btn_submit.setOnClickListener(this)

    }
    // setting the questions function
    private fun setQuestion(){
        mCurrentPosition = 1
        val question = mQuestionsList!![mCurrentPosition -1]

        defaultOptionsView() // to make sure that all the buttons are at default stage before clicking on them

        if(mCurrentPosition == mQuestionsList!!.size){
            btn_submit.text = "FINISH"
        }else{
            btn_submit.text = "SUBMIT"
        }

        progressBar.progress = mCurrentPosition
        tv_progress.text = "$mCurrentPosition" + "/" + progressBar.max

        tv_gen_threa_ques.text = question!!.question
        //iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour

    }
    private fun defaultOptionsView(){
        val options = ArrayList<TextView>()
        options.add(0, tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_three)
        options.add(3, tv_option_four)

      //  setting the default colour and text changes when the user selects the options
        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)
        }
    }
//performing the options selections
    override fun onClick(v: View?) {
        when(v?.id ){
            R.id.tv_option_one ->{
                selectedOptionView(tv_option_one, selectedOptionNum = 1)
            }
            R.id.tv_option_two ->{
                selectedOptionView(tv_option_two, selectedOptionNum = 2)
            }
            R.id.tv_option_three ->{
                selectedOptionView(tv_option_three, selectedOptionNum = 3)
            }
            R.id.tv_option_four ->{
                selectedOptionView(tv_option_four, selectedOptionNum = 4)
            }
            R.id.btn_submit ->{
                if(mSelectedOptionPosition == 0){
                    mCurrentPosition ++ //move to the next question

                    when{
                        mCurrentPosition <= mQuestionsList!!.size ->{
                            setQuestion()
                        }else->{
                        Toast.makeText(this, "you have successfulluy completed the quiz",
                            Toast.LENGTH_SHORT).show()
                    }
                    }
                }else{
                    val question = mQuestionsList?.get(mCurrentPosition-1)
                    if(question!!.correctOption != mSelectedOptionPosition){
                        answerView(mSelectedOptionPosition, R.drawable.wrong_option_border_bg)
                        Toast.makeText(this, question.inCorrectAns, Toast.LENGTH_LONG).show()// show
                    }
                    answerView(question.correctOption, R.drawable.correct_option_border_bg)

                    if(mCurrentPosition == mQuestionsList!!.size){
                        btn_submit.text = "FINISH"

                    }else{
                        btn_submit.text = "GO TO NEXT QUESTION"
                    }
                    mSelectedOptionPosition = 0
                }
            }
        }

    }

    private fun answerView(answer: Int, drawableView: Int){
        when(answer){
            1 -> {
            tv_option_one.background = ContextCompat.getDrawable(this, drawableView)
        }
            2 -> {
                tv_option_two.background = ContextCompat.getDrawable(this, drawableView)
            }
            3 -> {
                tv_option_three.background = ContextCompat.getDrawable(this, drawableView)
            }
            4 -> {
                tv_option_four.background = ContextCompat.getDrawable(this, drawableView)
            }

        }
    }
    private fun selectedOptionView(tv: TextView,
                                  selectedOptionNum: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNum
        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg)

    }
}
