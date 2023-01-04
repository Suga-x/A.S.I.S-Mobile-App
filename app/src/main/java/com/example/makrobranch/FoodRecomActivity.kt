package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class FoodRecomActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_recom)
        supportActionBar?.hide()

        //breakfastt
        val breakfastt: CardView = findViewById(R.id.breakfastt)
        breakfastt.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //breakfastt
                R.id.breakfastt -> {
                    val workoutIntent = Intent(this, FoodRecom2Activity::class.java)
                    startActivity(workoutIntent)
                }
            }
        }
    }
}