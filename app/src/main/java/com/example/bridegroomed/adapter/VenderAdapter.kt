package com.example.bridegroomed.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.bridegroomed.databinding.VenderItemBinding
import com.example.bridegroomed.model.Vrnderlist
import kotlinx.android.synthetic.main.app_item.view.*
import kotlinx.android.synthetic.main.vender_item.view.*

class VenderAdapter(private var listener: VenderAdapter.OnClickListener) :RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val mvderlist = ArrayList<Vrnderlist>()

    interface OnClickListener {
        fun onClick(position: Vrnderlist)
    }

    fun setAppList(categoryModel: ArrayList<Vrnderlist>) {
        mvderlist.addAll(categoryModel)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val applicationBinding = VenderItemBinding.inflate(layoutInflater, parent, false)
        return RecyclerHolderCatIcon(applicationBinding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val appInfo = mvderlist[position]
        (holder as VenderAdapter.RecyclerHolderCatIcon).bind(appInfo, listener)
    }


    override fun getItemCount(): Int {
        return mvderlist.size
    }



    inner class RecyclerHolderCatIcon(private var applicationBinding: VenderItemBinding) : RecyclerView.ViewHolder(applicationBinding.root) {

        fun bind(appInfo: Vrnderlist, listener: VenderAdapter.OnClickListener?) {
            applicationBinding.appVrnderlist  = appInfo
            itemView.list_card.setOnClickListener {

                listener!!.onClick(appInfo);
            }
        }


    }






}