package com.example.responsi_002

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Profile : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val intent = intent

        val nama =intent.getStringExtra("nama")
        val alamat =intent.getStringExtra("addres")
        val user =intent.getStringExtra("username")
        val pw =intent.getStringExtra("pswrd")

        val profiles = findViewById<TextView>(R.id.profile)
        profiles.text ="Nama Pengguna :"+nama+"\nNama Alamat :"+alamat+"\nUsername :"+user+"\nPassword :"+pw


    }

}