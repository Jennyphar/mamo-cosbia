package com.mamo.cosbia

// This is our Questions model. it defines the attributes of the quizz questions.
// It will be used for all the types of the questions that the app will have.
data class Question (
    val id: Int,
    val question: String,
    //val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctOption: Int,
    val inCorrectAns: String
)