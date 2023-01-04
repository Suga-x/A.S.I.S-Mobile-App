package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class WorkoutRecomActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_recom2)
        supportActionBar?.hide()

        //yogaCard
        val yogaCard: CardView = findViewById(R.id.yogaCard)
        yogaCard.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //yogaCard
                R.id.yogaCard -> {
                    val yogaCard = Intent(this, WorkoutRecom3Activity::class.java)
                    startActivity(yogaCard)
                }
            }
        }
    }
}