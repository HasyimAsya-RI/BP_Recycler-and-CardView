package com.example.bp1832_recyclerandcardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductActivity : AppCompatActivity() {

    private var layoutManager:  RecyclerView.LayoutManager?=null
    private var adapter:        RecyclerView.Adapter<ProductAdapter.ViewHolder>?=null

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_product )

        //Set Layout menjadi Linear Layout
        layoutManager = LinearLayoutManager( this )

        //Instance Recycler View
        var rvProduct: RecyclerView = findViewById( R.id.recyclerView_Product )

        //Set Layout untuk Recycler View
        rvProduct.layoutManager = layoutManager

        //Memanggil Kelas Adapter dan Set Recycler View Sesuai yang Dibuat
        adapter             = ProductAdapter()
        rvProduct.adapter   = adapter
    }
}