package com.example.bridegroomed.view.ui.vendorsfrgmnet
import android.content.Intent
import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.bridegroomed.R
import com.example.bridegroomed.adapter.CategoryAdapter
import com.example.bridegroomed.adapter.VenderAdapter
import com.example.bridegroomed.databinding.VendorsFragmentBinding
import com.example.bridegroomed.model.Category
import com.example.bridegroomed.model.Vrnderlist
import com.example.bridegroomed.view.CreateAccount
import com.example.bridegroomed.view.ui.vendorprofile.Vendorsprofile


class Vendors : Fragment(), CategoryAdapter.OnCategoryClickListener ,VenderAdapter.OnClickListener{

    override fun onCategoryClick(position: Category) {
        Log.d("TAG@123","Clicked"+position.name)
        startActivity(Intent(activity, Vendorsprofile::class.java))
    }

    override fun onClick(position: Vrnderlist) {
        startActivity(Intent(activity, Vendorsprofile::class.java))
    }
    var dataList: ArrayList<Category> = ArrayList()
    var dataListtwo: ArrayList<Vrnderlist> = ArrayList()
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var venderlistadapter: VenderAdapter
    lateinit var binding: VendorsFragmentBinding
    var viewt: View? = null


    companion object {
        fun newInstance() = Vendors()
    }

    private lateinit var viewModel: VendorsViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProviders.of(this).get(VendorsViewModel::class.java)
        val root = inflater.inflate(R.layout.vendors_fragment, container, false)

        categoryAdapter = CategoryAdapter(this)
        venderlistadapter= VenderAdapter(this)

        val recyclerView = root.findViewById<RecyclerView>(R.id.recycler_news)
        val all_vender = root.findViewById<RecyclerView>(R.id.all_vender)


        recyclerView.layoutManager = LinearLayoutManager(activity, RecyclerView.HORIZONTAL, false)
        recyclerView.adapter = categoryAdapter
        setRecyclerView(dataList)


        all_vender.layoutManager = LinearLayoutManager(activity, RecyclerView.VERTICAL, false)
        all_vender.adapter = venderlistadapter
        setRecyclerViewtwo(dataListtwo)




        subscribeDataCallBack()
        subscribeDataCallBacktwo()

        return root


    }


    private fun setRecyclerView(dataList: ArrayList<Category>) {
        categoryAdapter.setAppList(dataList)


    }

    private fun setRecyclerViewtwo(dataList: ArrayList<Vrnderlist>) {
        venderlistadapter.setAppList(dataList)


    }
    private fun subscribeDataCallBack() {

        viewModel.getProjectList()?.observe(this, Observer<ArrayList<Category>> {

            if (it != null) {
                categoryAdapter.setAppList(it)


            }

        })

    }




    private fun subscribeDataCallBacktwo() {

        viewModel.getProjectListtwo()?.observe(this, Observer<ArrayList<Vrnderlist>> {

            if (it != null) {
                venderlistadapter.setAppList(it)


            }

        })

    }






}
