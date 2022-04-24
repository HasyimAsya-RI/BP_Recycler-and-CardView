package com.example.bp_5recyclerandcardview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// Kelas ProcuctAdapter adalah kelas turunan dari RecyclerView.Adapter
class ProductAdapter:RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    //Deklarasi Data (Array)
    private var photo   = intArrayOf(
        R.drawable.american_beef,
        R.drawable.american_chicken,
        R.drawable.american_sausage,
        R.drawable.american_trufle,
        R.drawable.cheesy_chicken,
        R.drawable.chicken_spicy_mozzarella,
        R.drawable.extravaganzza_delight,
        R.drawable.tuna_delight
    )
    private var name    = arrayOf(
        "American Beef", "American Chicken", "American Sausage", "American Trufle",
        "Cheesy Chicken", "Chicken Spicy Mozza", "Extravaganzza Delight", "Tuna Delight"
    )
    private var price   = arrayOf(
        "Rp75.000", "Rp75.000", "Rp75.000", "Rp75.000",
        "Rp75.000", "Rp75.000", "Rp75.000", "Rp75.000"
    )

    //Inner Class
    inner class ViewHolder( itemView: View ): RecyclerView.ViewHolder( itemView ) {
        //Instance Palette Card View
        var itemPhoto: ImageView
        var itemName: TextView
        var itemPrice: TextView

        init {
            itemPhoto   = itemView.findViewById( R.id.item_Photo )
            itemName    = itemView.findViewById( R.id.item_Name )
            itemPrice   = itemView.findViewById( R.id.item_Price )
        }
    }

    //Menghubungkan Palette yang Telah Dideklasikan
    override fun onCreateViewHolder( parent: ViewGroup, viewType: Int ): ViewHolder {
        val view = LayoutInflater.from( parent.context ).
                   inflate( R.layout.cardview_product, parent, false )
        return ViewHolder( view )
    }
    //Menampilkan Palette
    override fun onBindViewHolder( holder: ViewHolder, position: Int ) {
        holder.itemPhoto.setImageResource   ( photo[position] )
        holder.itemName.text                = name[position]
        holder.itemPrice.text               = price[position]
    }
    //Menghitung Jumlah Data (Menampilkan Card View yang Ingin Ditampilkan)
    override fun getItemCount(): Int {
        //Dicontohkan menggunakan variabel name, karena semua nilai Array-nya sama.
        return name.size
    }

}