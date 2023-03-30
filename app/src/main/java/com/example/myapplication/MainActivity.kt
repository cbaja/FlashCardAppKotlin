package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.tvFlashCard_question)
        val flashcardAnswer = findViewById<TextView>(R.id.tvFlashCard_answer)
        flashcardQuestion.setOnClickListener {
            flashcardQuestion.visibility = View.INVISIBLE
            flashcardAnswer.visibility = View.VISIBLE
        }

       flashcardAnswer.setOnClickListener{
           flashcardQuestion.visibility = View.VISIBLE
           flashcardAnswer.visibility = View.INVISIBLE
       }

    }
}