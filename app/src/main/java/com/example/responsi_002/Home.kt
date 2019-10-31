package com.example.responsi_002

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.responsi_002.model.Presiden
import com.example.responsi_002.model.PresidenData

class Home : AppCompatActivity() {
    private lateinit var rvPresiden: RecyclerView
    private var listPresiden: ArrayList<Presiden> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val intent = intent
        val nama =intent.getStringExtra("nama")
        val alamat =intent.getStringExtra("addres")
        val user =intent.getStringExtra("username")
        val pw =intent.getStringExtra("pswrd")

        val prof = findViewById<Button>(R.id.profile)

        rvPresiden = findViewById(R.id.rv_presiden)
        rvPresiden.setHasFixedSize(true)

        listPresiden.addAll(PresidenData.listDataPresiden)
        showPresidenList()

        prof.setOnClickListener{

            val intent = Intent(this,Profile::class.java)

            startActivity(intent)
        }
    }

    private fun showPresidenList() {
        rvPresiden.layoutManager = LinearLayoutManager(this)
        val listPresidenAdapter = ListPresidenAdapter(listPresiden)
        rvPresiden.adapter = listPresidenAdapter
    }
}