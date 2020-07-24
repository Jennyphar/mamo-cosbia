package com.mamo.cosbia


// this is our Questions data file. It contains the general internet threats questions.
object Constants{
    const val USER_NAME: String  = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val  CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()
        val ques1 = Question(
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

        val ques2 = Question(
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

        val ques3 = Question(
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

        val ques4 = Question(
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

        val ques5 = Question(
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

        val ques6 = Question(
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

        val ques7 = Question(
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

        val ques8 = Question(
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
        questionsList.add(ques8)


        // Here we have Online Platform Questions. the structure of the questions is the same for all the question types.

        questionsList.add(ques7)

        val ques9 = Question(
            9,
            "What is the best way to use Facebook, Chat, TikTok, WhatApp, Instagram,Hangouts, " +
                    "Twitter and other social networking sites?",
            "A. Limit the amount of information I share about myself.",
            "B. Only talk to people I know.",
            "C. Make my page private, except to the people I have as my friends.",
            "D. All of the above",
            4,
            "D: Own Your Online Presence. When available, " +
                    "set the privacy and security settings on websites to your comfort level for information sharing. " +
                    "It is ok to limit how and with whom you share information."
        )
        questionsList.add(ques9)

        val ques10 = Question(
            10,
            "What do you do when a stranger asks you to give them a picture of yourself on social networking sites?",
            "A. Send no pictures, and tell an adult immediately",
            "B. If you think you know them, send the picture",
            "C. Send the picture, even if they’re a stranger",
            "D. Ignore them",
            1,
            "A: You should never give pictures of yourself to a stranger because you do not know who they are or what they may be doing." +
                    " When a stranger is asking for a picture, immediately deny and tell an adult.\n" +
                    "You should never give anyone a photo that you would not want someone else to see." +
                    " Even if you are comfortable with that person, it could still end up online or be shown to others"
        )
        questionsList.add(ques10)


        val ques11 = Question(
            11,
            "From online, who should you accept friend request from?",
            "A. Anyone",
            "B. A friend of a friend",
            "C. Someone you think you’ve met before",
            "D. Only people you definitely know",
            4,
            "D: Only friend requests from people you definitely know," +
                    " you should never accept friend request from strangers or anyone else you are uncertain."
        )
        questionsList.add(ques11)


        val ques12 = Question(
            12,
            "Others cannot see anything I send in my private email, Instant messenger or Chat " +
                    "(Tik Tok, Facebook, WhatsApp, Instagram, Hangouts, Twitter, Skype, Myspace, Snapchat, LinkedIn, and gaming).",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: There are people and programs that can “see” into your private correspondence online. " +
                    "NEVER send personal information unless you are positive it is a secure site"
        )
        questionsList.add(ques12)

        val ques13 = Question(
            13,
            "Jessica’s friend Sophie asks for Jessica’s password to her Facebook account. What should Jessica do?",
            "A. Give Sophie her password. Sophie is her friend and Jessica can trust her.",
            "B. Tell Sophie her password and change it as soon as she gets home.",
            "C. Don’t give her password to Sophie.",
            "D. I do not Know",
            3,
            "C: Protect your personal information. Passwords are never to be shared with anyone other than a parent or guardian." +
                    " It is a good idea for parents and guardians to keep passwords to make sure you remain safe and secure." +
                    " Just because you spend time with friends, doesn’t mean you have to follow everything they do." +
                    " If they are doing something that doesn’t seem right, you should feel"
        )
        questionsList.add(ques13)

        val ques14 = Question(
            14,
            "If I want to know something about a stranger that sends me an Instant Message, " +
                    "I can check their profile and trust that information.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: Part of the Internet’s wonder is its anonymity and sometimes the worst thing, too. " +
                    "Unlike the physical world, you cannot verify a person’s age, location, etc." +
                    " online so it is easier to lie and get away with it."
        )
        questionsList.add(ques14)

        return questionsList

    }
}