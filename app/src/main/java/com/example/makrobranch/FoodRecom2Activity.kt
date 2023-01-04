package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class FoodRecom2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_food_recom2)
        supportActionBar?.hide()

        //jenis
        val jenis: CardView = findViewById(R.id.jenis)
        jenis.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //jenis
                R.id.jenis -> {
                    val foodRecomIntent = Intent(this, FoodRecom3Activity::class.java)
                    startActivity(foodRecomIntent)
                }
            }
        }
    }
}