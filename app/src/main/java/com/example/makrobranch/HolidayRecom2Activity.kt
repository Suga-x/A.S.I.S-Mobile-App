package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView

class HolidayRecom2Activity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holiday_recom2)
        supportActionBar?.hide()

        //bromo
        val bromo: CardView = findViewById(R.id.bromo)
        bromo.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //bromo
                R.id.bromo -> {
                    val holidayBromo = Intent(this, HolidayRecom3Activity::class.java)
                    startActivity(holidayBromo)
                }
            }
        }
    }
}