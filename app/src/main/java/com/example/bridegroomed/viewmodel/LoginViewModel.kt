package com.example.bridegroomed.viewmodel

import android.app.Application
import androidx.databinding.ObservableField
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.bridegroomed.model.User
import com.example.bridegroomed.util.Util
import mvvm.f4wzy.com.samplelogin.network.BackEndApi
import mvvm.f4wzy.com.samplelogin.network.WebServiceClient

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginViewModel(application: Application) : AndroidViewModel(application) , Callback<User> {
    var email:ObservableField<String>? = null
    var password:ObservableField<String>? = null
    var userlogin:MutableLiveData<User>? = null
    var changescreen:MutableLiveData<String>? = null


    init {
        email = ObservableField("")
        password = ObservableField("")
        userlogin = MutableLiveData<User>()
        changescreen= MutableLiveData<String>()
    }


    fun onEmailChanged(s: CharSequence, start: Int, befor: Int, count: Int) {
       if(Util.isEmailValid(s.toString()) && password?.get()!!.length >= 8){

       }
        else{

       }


    }

    fun onPasswordChanged(s: CharSequence, start: Int, befor: Int, count: Int) {
       if(Util.isEmailValid(email?.get()!!) && s.toString().length >= 4){

       }
        else{

       }
    }



    fun login() {

        WebServiceClient.client.create(BackEndApi::class.java).LOGIN(email = email?.get()!!
            , password = password?.get()!!)
            .enqueue(this)

    }

    override fun onResponse(call: Call<User>?, response: Response<User>?) {

        userlogin?.value = response?.body()

    }

    override fun onFailure(call: Call<User>?, t: Throwable?) {


    }


    fun onchangescreen() {
        changescreen?.value="change"

    }


}