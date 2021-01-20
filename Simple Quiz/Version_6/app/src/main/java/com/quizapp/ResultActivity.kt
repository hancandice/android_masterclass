package com.quizapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.quizapp.R

// TODO (STEP 3: Create a result activity for showing the score.)
// START
class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
    }
}
// END