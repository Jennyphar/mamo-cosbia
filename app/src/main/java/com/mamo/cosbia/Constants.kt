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


        // Here we have Online Platform Specific threats Questions. the structure of the questions is the same for all the question types.


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
                    " If they are doing something that doesn’t seem right, you should feel completely comfortable standing up for what you think is right."
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

        //Questions from here are the Online activities Questions.


        val ques15 = Question(
            15,
            "You have been to a gaming/video website and it is asking you to download a link before playing " +
                    "the game/watching the video. What should you do?",
            "A. Show the link to an adult and ask them if it’s safe",
            "B. Download it anyway",
            "C. Don’t download it, it must be illegal",
            "D. Ask your friends what to doe",
            1,
            "A: If a website asks you to download something, you should always speak to an adult. " +
                    "You never know what that could be"
        )
        questionsList.add(ques15)

        val ques16 = Question(
            16,
            "I can always trust emails and attachments I get from friends.",
            "A. TRUE",
            "B. FALSE",
            "C. Maybe",
            "D. I do not know",
            2,
            "B: New programs and viruses send out emails without their knowledge or consent to everyone in your inbox." +
                    " Verify it is in fact from your friend first."
        )
        questionsList.add(ques16)


        val ques17 = Question(
            17,
            "Private browsing” is a feature in many Internet browsers that lets users access web pages without any information " +
                    "(like browsing history) being stored by the browser. Can Internet service providers see the online activities of their " +
                    "subscribers when those subscribers are using private browsing?",
            "A. YES",
            "B. NO",
            "C. Maybe",
            "D. I do not know",
            2,
            "B: If you want to hide your activity from your service provider, consider a VPN."
        )
        questionsList.add(ques17)


        val ques18 = Question(
            18,
            "When it comes to information searching online, you can safely search for information from any site.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: When searching information online, you should always search from trusted and well-known websites. " +
                    "Check to be sure the sites is security enabled. " +
                    "Look for web addresses with “https://,” which means the site takes extra measures to help secure your information. " +
                    "“Http://” is not secure."
        )
        questionsList.add(ques18)

        val ques19 = Question(
            19,
            "You and a friend are on the computer, looking to download music and movies. You should:",
            "A. Go to a site that your friend uses and download a few files onto the computer.",
            "B. Only with your parent’s permission, go to trusted websites or app stores to download music and movies.",
            "C. Not sure.",
            "D. I do not Know",
            2,
            "B: Only with your parent’s permission, go to trusted websites or app stores to download music and movies." +
                    " Your friends may not know what websites are safe or unsafe for you to download." +
                    " It is illegal to download music or movies from certain websites. " +
                    "Only purchase music and movies from established services for media distribution."
        )
        questionsList.add(ques19)

        val ques20 = Question(
            20,
            "It is okay to download FREE music/videos from music/video sharing sites, as long as no one finds out.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: This is the same as stealing from a store and you are stealing from your favorite artists as well!" +
                    " Only purchase music/videos from established services for music/video distribution." +
                    " Some file sharing sites are also well known sources of malware distribution. Remember, " +
                    "safer for me more secure for all. What you do online has the potential to affect everyone – at home, at work and " +
                    "around the world. Practicing good online habits benefits the global digital community."
        )
        questionsList.add(ques20)

        val ques21 = Question(
            21,
            "IYou are playing or watching videos, gaming, information searching, studying, social networking," +
                    " emailing on a gadget and the app asks for your current location. " +
                    "It’s okay to enable location services because all of your friends do the same thing and if they do it, it must be okay.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: Think before you app. Many apps do not need geo-location services enabled in order to " +
                    "provide the service. Make sure you decline or opt out of the location service feature on your phone. " +
                    "If you do not know how to do this, ask your parents. Protect your personal information by reading the " +
                    "privacy policy of an app before you download it to understand what information the app accesses and how " +
                    "it uses your information."
        )
        questionsList.add(ques21)


        // Here we have gadget specific threats questions. the structure of the questions is the same for all the question types.


        val ques22 = Question(
            22,
            "Turning off the GPS function of your gadgets prevents any tracking of your phone’s location.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: If it were only that easy. A 2018 Princeton study found that device’s time zone and" +
                    " information from its sensors could be combined with public information like maps to estimate your location, " +
                    "even without GPS data."
        )
        questionsList.add(ques22)

        val ques23 = Question(
            23,
            "You receive a chain email that tells you to pass it on to 10 of your closest friends. Do you:",
            "A. Send the email to your friends – it is so cool and you want them to see it too!",
            "B. Delete the email. You are never sure what viruses these types of chain emails can have.",
            "C. Not sure.",
            "D. I do not Know",
            2,
            "B: When in doubt, throw it out! Links in email, tweets, posts, and online advertising are" +
                    " often the way cybercriminals compromise your computer. If it looks suspicious, " +
                    "even if you know the source, it’s best to delete or if appropriate, mark as junk email."
        )
        questionsList.add(ques23)

        val ques24 = Question(
            24,
            "Installing a virus checker on my gadget will keep my gadget safe.",
            "A. TRUE",
            "B. FALSE",
            "C. MAYBE",
            "D. I do not Know",
            2,
            "B: Just installing the program will help for a little while, but new viruses are spawning all the time." +
                    " Update and run the software at least once each month."
        )
        questionsList.add(ques24)

        val ques25 = Question(
            25,
            "Tjipena unlocks his smartphone and notice he has 12 apps that need to be updated. What should he do?",
            "A. Ignore the prompt to update",
            "B. Update the apps.",
            "C. Not sure",
            "D. I do not Know",
            2,
            "B: It is important to keep a clean machine. Keeping machine means having the latest operating system," +
                    " software, web browser, anti-virus protection and apps on your computer and mobile devices. " +
                    "You should also only have apps on your phone that you actually use"
        )
        questionsList.add(ques25)


        // Here we have Online Behaviour Specific threats questions. the structure of the questions is the same for all the question types.

        val ques26 = Question(
            26,
            "You posted a picture online, but soon decided to take it down. You are worried your friend may see it," +
                    " but then soon remember that person DOES NOT have a computer. Your friend will never see the photo.",
            "A. TRUE",
            "B. FALSE",
            "C. Not sure",
            "D. I do not Know",
            2,
            "B: You never know who is going to see things that are posted online." +
                    " Even if your friend does not have a computer, there are many other ways he could see the photos after they " +
                    "have been shared with friends. Copies could be passed around and someone may have saved an image before you" +
                    " deleted it. Be a good online citizen. Think about images you post and whether your friends would be okay " +
                    "with them. Post only about others as you would have them post about you. Whenever possible, get " +
                    "permission before posting pictures or videos of others. Likewise, let others know they need your permission " +
                    "before posting pictures or videos of you."
        )
        questionsList.add(ques26)

        val ques27 = Question(
            27,
            "You don’t have to worry when you visit your favorite sites, like Facebook and gaming sites," +
                    "because they are safe from spyware, malware and other online threats. (True or False)",
            "A. TRUE",
            "B. FALSE",
            "C. Not sure",
            "D. I do not Know",
            2,
            "B: Trusted sites can be safer. However, what you do on those sites – such as clicking on posts with links or using " +
                    "apps – can put you at risk. The best security step you can take is to Keep a Clean Machine." +
                    " Keeping a Clean Machine means having the latest operating system, software, web browser, anti-virus protection" +
                    " and apps on your computer and mobile devices. Remember, when in doubt, throw it out! Links in email," +
                    " tweets, posts, and online advertising are often the way cybercriminals compromise your computer. " +
                    "If it looks suspicious, even if you know the source, it’s best to delete or if appropriate, mark as junk email."
        )
        questionsList.add(ques27)

        val ques28 = Question(
            28,
            "When online, you should be careful whenever approached by a new person or asked to provide information about yourself?",
            "A. TRUE",
            "B. FALSE",
            "C. Not Sure",
            "D. I do not Know",
            1,
            "A: You always need to be on the lookout for online intruders! Be careful because they may be trying to" +
                    " get information from or about you. Remember to Be Web Wise and think before you act. Be wary of communications " +
                    "that implore you to act immediately, offer something that sounds too good to be true, or ask for personal information."
        )
        questionsList.add(ques28)

        val ques29 = Question(
            29,
            "You receive an email from a person that identifies themselves as your friend John. " +
                    "They want to meet you in the park after school. Do you:",
            "A. Tell your parents about the email and ignore the request.",
            "B. Ask the person a question only John would know to make sure it is John.",
            "C.Go to the park and meet your friend John.",
            "D. I do not Know",
            1,
            "A: Some people will pretend to be other people and may be impersonating someone you know. " +
                    "It is better to be safe than sorry! Unfamiliar email addresses and posts on social network sites should " +
                    "raise a red flag. Let your parents know and let them help you make the right decision about contacting John."
        )
        questionsList.add(ques29)

        val ques30 = Question(
            30,
            "You should always know whom you are talking to online.?",
            "A. true",
            "B. false",
            "C. Not sure",
            "D. I do not Know",
            1,
            "A: The Internet can be a place to meet people and join new communities. However, just because you meet someone online, " +
                    "it does not mean you really know his or her identity. " +
                    "Use caution when interacting with new people. There is nothing wrong with being suspicious and " +
                    "extremely guarded about sharing any personal information."
        )
        questionsList.add(ques30)

        val ques31 = Question(
            31,
            "The pictures you decide to post online today can affect your future reputation?",
            "A. True",
            "B. False",
            "C. Not sure",
            "D. I do not Know",
            1,
            "A: The photos you post online may never go away! In the digital age, you need to pay attention to" +
                    " your reputation from the moment you start going online. Your online reputation can be both positive and " +
                    "negative; depending on the choices, you make and can affect the future when you apply for colleges or jobs. " +
                    "You can manage your online reputation by remembering to Own Your Online Presence and setting privacy and " +
                    "security settings to your comfort level for information sharing."
        )
        questionsList.add(ques31)


        val ques32 = Question(
            32,
            "The great thing about the cyber world is that you can say things you might not always say directly to someone’s face.?",
            "A. true",
            "B. false",
            "C. Not sure",
            "D. I do not Know",
            2,
            "B: Statements you make online about people can be just as hurtful as saying them face-to-face." +
                    " Being nice in the cyber world is equally as important as when you talk face to face. " +
                    "If you do not want it done to you, do not do it to someone else! Be a good online citizen. " +
                    "Post only about others as you have them post about you."
        )
        questionsList.add(ques32)

        val ques33 = Question(
            33,
            "Stealing other people’s work online – from sites like Wikipedia and Google – is a crime.?",
            "A. True",
            "B. False",
            "C. Not sure",
            "D. I do not Know",
            1,
            "A: Stealing other people’s work is considered theft. If you cut and paste content into your " +
                    "homework without citing the source, it is cheating and plagiarism."
        )
        questionsList.add(ques33)

        val ques34 = Question(
            34,
            "You are deciding on what personal information to post about yourself in an online profile. You decide to?",
            "A. Review the information carefully before you post it because you do " +
                    "not want to post too much information about yourself.",
            "B. In order to prevent misuse of your information, don't post too much information about yourself on " +
                    "Facebook, personal websites, your blog, or in chat rooms.",
            "C. Go ahead and post information about yourself online, because you can always choose to edit it later " +
                    "if you don’t want people viewing certain information.",
            "D. Both A & B",
            4,
            "D: Own your online presence. When available, take the time to understand and set privacy and security" +
                    " settings on websites to your comfort level for information sharing. You should know who would see the" +
                    " content before you post it."
        )
        questionsList.add(ques34)

        val ques35 = Question(
            35,
            "Post only about others as you would have them post about you.?",
            "A. True",
            "B. False",
            "C. Not sure",
            "D. I do not Know",
            1,
            "A: Stealing other people’s work is considered theft. If you cut and paste content into your " +
                    "homework without citing the source, it is cheating and plagiarism."
        )
        questionsList.add(ques35)

        val ques36 = Question(
            36,
            "After a disagreement at school, a group of kids sends Jaydon threatening messages on Facebook. What should he do?",
            "A. Block them from his page.",
            "B. Keep the emails and comments he receives.",
            "C. Tell his parents.",
            "D. All of the above",
            4,
            "D: If someone is bullying or harassing you online, you should tell your parents or a trusted adult. " +
                    "Ignore and block the person and save all messages. Many websites, including Facebook, have ways to report" +
                    " the abuse and/or help you respond to messages that make you uncomfortable."
        )
        questionsList.add(ques36)


        return questionsList

    }
}