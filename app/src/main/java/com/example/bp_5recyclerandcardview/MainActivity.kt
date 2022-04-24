package com.example.bp_5recyclerandcardview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        setContentView( R.layout.activity_main )

        //Instance Button
        val button: Button = findViewById( R.id.button_About )

        //Pada saat si button SELANJUTNYA diklik,
        button.setOnClickListener {
            //maka akan memanfaatkan Explicit Intent
            //dengan memanggil halaman AboutActivity.
            val intent = Intent( this, AboutActivity::class.java )
            // Dan jangan lupa di-start!
            startActivity( intent )
        }
    }
}