package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.asis_mobileapp.R

class HolidayRecomActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_holiday_recom)
        supportActionBar?.hide()

        //indonesiaCard
        val indonesiaCard: CardView = findViewById(R.id.indonesiaCard)
        indonesiaCard.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //indonesiaCard
                R.id.indonesiaCard -> {
                    val holidayRecom2 = Intent(this, HolidayRecom2Activity::class.java)
                    startActivity(holidayRecom2)
                }
            }
        }
    }
}