package com.example.asis_mobileapp.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.cardview.widget.CardView
import com.example.asis_mobileapp.Home.ScheduleActivity
import com.example.asis_mobileapp.R
import com.example.makrobranch.editProfilActivity

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_profil, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnEditProfile: CardView = view.findViewById(R.id.rectangle_2)
        btnEditProfile.setOnClickListener {
            val editProfileBtn =
                Intent(this@ProfileFragment.activity, editProfilActivity::class.java)
            startActivity(editProfileBtn)

        }
    }
}