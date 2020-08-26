package com.example.bridegroomed.view.ui.vendorsfrgmnet

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.bridegroomed.model.Category
import com.example.bridegroomed.model.Vrnderlist
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class VendorsViewModel : ViewModel() {


    private val mutablePostList: MutableLiveData<ArrayList<Category>> = MutableLiveData()
    private val mutablePostListtwo: MutableLiveData<ArrayList<Vrnderlist>> = MutableLiveData()
    fun getProjectList(): LiveData<ArrayList<Category>>? {

        //TODO:  DO this in repository

        val jobs = ArrayList<Category>()

        //add dummy data to list
        jobs.add(Category("A Company", "Town A"))
        jobs.add(Category("B Company", "Town B"))
        jobs.add(Category("C Company", "Town C"))
        jobs.add(Category("D Company", "Town D"))
        jobs.add(Category("A Company", "Town A"))
        jobs.add(Category("B Company", "Town B"))
        jobs.add(Category("C Company", "Town C"))
        jobs.add(Category("D Company", "Town D"))
        jobs.add(Category("A Company", "Town A"))
        jobs.add(Category("B Company", "Town B"))
        jobs.add(Category("C Company", "Town C"))
        jobs.add(Category("D Company", "Town D"))
        jobs.add(Category("A Company", "Town A"))
        jobs.add(Category("B Company", "Town B"))
        jobs.add(Category("C Company", "Town C"))
        jobs.add(Category("D Company", "Town D"))


        mutablePostList.postValue(jobs)
        return mutablePostList


    }


    fun getProjectListtwo(): LiveData<ArrayList<Vrnderlist>>? {

        //TODO:  DO this in repository

        val jobs = ArrayList<Vrnderlist>()

        //add dummy data to list
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))
        jobs.add(Vrnderlist("C Company", "Town C"))
        jobs.add(Vrnderlist("D Company", "Town D"))
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))
        jobs.add(Vrnderlist("C Company", "Town C"))
        jobs.add(Vrnderlist("D Company", "Town D"))
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))
        jobs.add(Vrnderlist("C Company", "Town C"))
        jobs.add(Vrnderlist("D Company", "Town D"))
        jobs.add(Vrnderlist("A Company", "Town A"))
        jobs.add(Vrnderlist("B Company", "Town B"))

        mutablePostListtwo.postValue(jobs)
        return mutablePostListtwo


    }




}
