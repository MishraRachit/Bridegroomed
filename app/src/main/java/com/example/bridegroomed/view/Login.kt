package com.example.bridegroomed.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.bridegroomed.R
import com.example.bridegroomed.viewmodel.LoginViewModel
import com.example.bridegroomed.databinding.ActivityLoginBinding
import com.example.bridegroomed.model.User

class Login : AppCompatActivity() {


    var bindview:ActivityLoginBinding?=null
    var viewmodel: LoginViewModel? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        bindview=DataBindingUtil.setContentView(this,R.layout.activity_login)
        viewmodel=ViewModelProviders.of(this).get(LoginViewModel::class.java)
        bindview?.viewmodel = viewmodel
        initObservables()


    }







    private fun initObservables() {



        viewmodel?.userlogin?.observe(this, Observer<User> { user ->
            Toast.makeText(this, "welcome, ${user?.message}", Toast.LENGTH_LONG).show()

        })


        viewmodel?.changescreen?.observe(this, Observer {

            startActivity(Intent(this, CreateAccount::class.java))

        }
        )


    }





}
