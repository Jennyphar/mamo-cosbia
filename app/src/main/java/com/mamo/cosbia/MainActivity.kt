package com.mamo.cosbia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.SYSTEM_UI_FLAG_FULLSCREEN
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = SYSTEM_UI_FLAG_FULLSCREEN
        // Validation that a user has entered something
        btn_start.setOnClickListener {
            if(et_name.text.toString().isEmpty()){ // checking if the text is empty
                Toast.makeText(this,
                    "please enter your name",Toast.LENGTH_SHORT).show()
            }else{ // if the screenshot is not empty then we move to the activity
                val intent = Intent(this, GeneralThreatsQuestions::class.java)
                intent.putExtra(Constants.USER_NAME,et_name.text.toString())
                startActivity(intent) //this starts an intent upon clicking  the start button, which takes us to the General Threats Questions.
                finish()
            }
        }
    }
}