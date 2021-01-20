package com.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity() {

    /**
     * This function is auto created by Android when the Activity Class is created.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        //This call the parent constructor
        super.onCreate(savedInstanceState)
        // This is used to align the xml view to this class
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.e("Questions Size", "${questionsList.size}")
        for (i in questionsList) {
            Log.e("Questions", i.question)
        }

        // TODO (Step 3: Setting the question in the UI from the list.)
        // START
        val currentPosition = 1 // Default and the first question position
        val question: Question? =
            questionsList[currentPosition - 1] // Getting the question from the list with the help of current position.

        progressBar.progress =
            currentPosition // Setting the current progress in the progressbar using the position of question
        tv_progress.text =
            "$currentPosition" + "/" + progressBar.getMax() // Setting up the progress text

        // Now set the current question and the options in the UI
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_three.text = question.optionThree
        tv_option_four.text = question.optionFour
        // END
    }
}