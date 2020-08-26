package com.example.bridegroomed.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bridegroomed.R
import kotlinx.android.synthetic.main.activity_tellusabout.*

class Tellusabout : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tellusabout)


        signup.setOnClickListener {
            startActivity(Intent(this, Home::class.java))
        }


    }
}
