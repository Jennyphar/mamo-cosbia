package com.mamo.cosbia

data class GenThreaQues (
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