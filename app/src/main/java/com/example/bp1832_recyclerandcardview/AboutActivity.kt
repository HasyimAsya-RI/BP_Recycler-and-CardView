package com.example.bp1832_recyclerandcardview

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class AboutActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_about )

        //Instance Image View
        val imgCall: ImageView      = findViewById( R.id.imageView_Call )
        val imgLocation: ImageView  = findViewById( R.id.imageView_Location )
        val imgBrowser: ImageView   = findViewById( R.id.imageView_Browser )
        val btnProduct: Button      = findViewById( R.id.button_Product )

        //Event di Masing-masing Image View
        //Dial Number
        imgCall.setOnClickListener {
            val intentDial: Intent = Uri.parse( "tel: 081222888123" ).let {
                Intent( Intent.ACTION_DIAL )
            }
            startActivity( intentDial )
        }
        //Location
        imgLocation.setOnClickListener {
            val intentMap: Intent = Intent( Intent.ACTION_VIEW ).apply {
                data = Uri.parse( "geo: -7.752754, 114.201473" )
            }
            startActivity( intentMap )
        }
        //Browser
        imgBrowser.setOnClickListener {
            val intentBrowser: Intent = Uri.parse( "https://amikom.ac.id/" ).let {
                Intent( Intent.ACTION_VIEW )
            }
            startActivity( intentBrowser )
        }

        //Button
        btnProduct.setOnClickListener {
            val intent = Intent( this, ProductActivity::class.java )
            startActivity( intent )
        }
    }
}