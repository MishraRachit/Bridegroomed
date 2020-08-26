package com.example.bridegroomed.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bridegroomed.databinding.AppItemBinding
import com.example.bridegroomed.model.Category
import kotlinx.android.synthetic.main.app_item.view.*

class CategoryAdapter(private var listener: OnCategoryClickListener) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val mCategoryList = ArrayList<Category>()


    fun setAppList(categoryModel: ArrayList<Category>) {
        mCategoryList.addAll(categoryModel)
        notifyDataSetChanged()
    }




    interface OnCategoryClickListener {
        fun onCategoryClick(position: Category)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {


        val layoutInflater = LayoutInflater.from(parent.context)
        val applicationBinding = AppItemBinding.inflate(layoutInflater, parent, false)
        return RecyclerHolderCatIcon(applicationBinding)

    }

    override fun getItemCount(): Int {


        return mCategoryList.size
    }


    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        val appInfo = mCategoryList[position]



        (holder as CategoryAdapter.RecyclerHolderCatIcon).bind(appInfo, listener)

    }





    inner class RecyclerHolderCatIcon(private var applicationBinding: AppItemBinding) : RecyclerView.ViewHolder(applicationBinding.root) {

        fun bind(appInfo: Category, listener: OnCategoryClickListener?) {

            applicationBinding.appModelNews  = appInfo

          itemView.card_id.setOnClickListener {

              listener!!.onCategoryClick(appInfo);
          }







        }


    }
}