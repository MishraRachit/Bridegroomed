package com.example.bridegroomed.view.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bridegroomed.R
import com.example.bridegroomed.adapter.CategoryAdapter
import com.example.bridegroomed.model.Category

class HomeFragment : Fragment(){



    private lateinit var homeViewModel: HomeViewModel





    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        homeViewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
      /*  val textView: TextView = root.findViewById(R.id.text_home)
        homeViewModel.text.observe(this, Observer {
            textView.text = it
        })*/
        return root
    }



   /* private fun setRecyclerView(dataList: ArrayList<Category>) {
        categoryAdapter = CategoryAdapter(activity)
        val categoryLinearLayoutManager = LinearLayoutManager(activity)
        categoryLinearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        binding.root.recycler_news.layoutManager = categoryLinearLayoutManager
        categoryAdapter.setAppList(dataList)
        binding.root.recycler_news.adapter = categoryAdapter
    }*/






}