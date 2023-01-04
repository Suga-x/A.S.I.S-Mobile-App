package com.example.makrobranch

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class NeedsActivity : AppCompatActivity(), View.OnClickListener {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_needs)
        supportActionBar?.hide()


        val rectangle_1: CardView = findViewById(R.id.rectangle_1)
        rectangle_1.setOnClickListener(this)

        val rectangle_: CardView = findViewById(R.id.rectangle_)
        rectangle_.setOnClickListener(this)

        val rectangle_4: CardView = findViewById(R.id.rectangle_4)
        rectangle_4.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //workout
                R.id.rectangle_1 -> {
                    val workoutIntent = Intent(this, WorkoutRecom::class.java)
                    startActivity(workoutIntent)
                }
                //health
                R.id.rectangle_ -> {
                    val workoutIntentDua = Intent(this, FoodRecomActivity::class.java)
                    startActivity(workoutIntentDua)
                }
                //destination
                R.id.rectangle_4 -> {
                    val workoutIntent = Intent(this, HolidayRecomActivity::class.java)
                    startActivity(workoutIntent)
                }
            }
        }
    }



}