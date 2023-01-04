package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class WorkoutRecom : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_recom)
        supportActionBar?.hide()

        //belance
        val belance: CardView = findViewById(R.id.belance)
        belance.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //belance
                R.id.belance -> {
                    val workoutrecomendation = Intent(this, WorkoutRecomActivity::class.java)
                    startActivity(workoutrecomendation)
                }
            }
        }
    }
}