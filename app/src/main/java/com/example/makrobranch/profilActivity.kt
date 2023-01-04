package com.example.makrobranch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.cardview.widget.CardView
import com.example.asis_mobileapp.R

class profilActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil)
        supportActionBar?.hide()

        //rectangle_2
        val rectangle_2: CardView = findViewById(R.id.rectangle_2)
        rectangle_2.setOnClickListener(this)
    }
    override fun onClick(v: View?) {
        if (v != null) {
            when(v.id){
                //rectangle_2
                R.id.rectangle_2 -> {
                    val historyProfil = Intent(this, editProfilActivity::class.java)
                    startActivity(historyProfil)
                }
            }
        }
    }
}