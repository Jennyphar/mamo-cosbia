package com.mamo.cosbia

object Constants{
    fun getQuestions(): ArrayList<GenThreaQues>{
        val questionsList = ArrayList<GenThreaQues>()
        val ques1 = GenThreaQues(
            1,
            "One of your classmate has sent around an embarrassing photo of another classmate." +
                " What should you do with it?",
            "A. Show your teacher, and tell them what happened",
            "B. Forward the photo to others",
            "C. Save it on your phone, so that you can embarrass them later",
            "D. Laugh at the photo with your friends",
            1,
        "A: You should show the photo to your teacher and tell them what has happened." +
                " Think of how you would feel if the picture have been of you."
        )
        questionsList.add(ques1)

        val ques2 = GenThreaQues(
            2,
            "One of your friends posted a video about you on the Internet and you do not like it." +
                    " You asked them to take it off but they said no, because it is funny." +
                    " What is it that you should do?",
            "A. Keep asking your friend until they take it down",
            "B. Speak to an adult and say why you don’t like it",
            "C. Leave it – you can’t do anything else about it",
            "D. Post a video of them to get back at them",
            2,
            "B: You should talk to an adult about what happened and tell them you do not like it. " +
                    "Then, they can try to take down the video."
        )
        questionsList.add(ques2)

        val ques3 = GenThreaQues(
            3,
            "Your friend tells you she is talking to a boy/girl online and on the weekend," +
                    " she/he will meet him/her. What should you do?",
            "A. Volunteer to go with her/him",
            "B. Let her/him go on her/him own",
            "C. Tell an adult straight away",
            "D. Tell your other friends",
            3,
            "C: If someone is going to meet a person they met online, you must tell an adult right away. " +
                    "You should never meet strangers, unless you know for sure who they are."
        )
        questionsList.add(ques3)

        val ques4 = GenThreaQues(
            4,
            "A classmate tells you someone on an online game was calling him/her mean names. What should you do?",
            "A. Tell your teacher or another adult",
            "B. Tell him/her to call the person mean names back",
            "C. Tell him/her to just ignore it and let it go away",
            "D. Tell him/her to stop playing games for a while",
            1,
            "A: Calling anyone online means names is a cyberbullying act. " +
                    "You should inform an adult about this and you should not neglect it."
        )
        questionsList.add(ques4)

        val ques5 = GenThreaQues(
            5,
            "Whom are you allowed to share your passwords with?",
            "A. Your friends",
            "B. Nobody – you should keep them to yourself",
            "C. Your family",
            "D. Your teacher",
            2,
            "B: You should also keep your passwords to yourself. If your password falls in the wrong hands, it could be risky.."
        )
        questionsList.add(ques5)

        val ques6 = GenThreaQues(
            6,
            "You need to create a Website password. What should you use?",
            "A. Your full name (e.g. annamarie)",
            "B. Part of your name and a number (e.g. anna123)",
            "C. A random word, number and punctuation combination (e.g. 1vira8pm!)",
            "D. A nickname that your friends call you (e.g.annagirl)",
            3,
            "C: The strongest passwords should include letters, numbers, and punctuation combinations." +
                    " You should never use something that is connected to your name because it is very easy to guess."
        )
        questionsList.add(ques6)

        val ques7 = GenThreaQues(
            7,
            "The Internet gives us access to many resources we would otherwise not be able to get in contact with.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            1,
            "A: That is probably the best thing about the Internet." +
                    " It is giving us instant access to distant things, things locked away, that does not even exist yet. " +
                    "It is a travel agent, a guide to the museum and a play with friends from all over the world!"
        )
        questionsList.add(ques7)

        val ques8 = GenThreaQues(
            8,
            "The Internet gives us access to many resources we would otherwise not be able to get in contact with.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: The Internet is an open forum for anyone and everyone. Bias is the rule rather than the exception." +
                    " Evaluate carefully ALL information on websites, personal or public"
        )
        questionsList.add(ques7)


        return questionsList

    }
}