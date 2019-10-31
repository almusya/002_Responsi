package com.example.responsi_002

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Logins : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val nama = findViewById<EditText>(R.id.nama)
        val alamat = findViewById<EditText>(R.id.alamat)
        val user = findViewById<EditText>(R.id.user)
        val pass = findViewById<EditText>(R.id.pass)
        val login = findViewById<Button>(R.id.login1)

        login.setOnClickListener {

            if (nama.text.isEmpty() || alamat.text.isEmpty() || user.text.isEmpty() || pass.text.isEmpty() ) {

                toast("Data Tidak Boleh Kosong ", Toast.LENGTH_LONG)
            }else {
                val n = nama.text.toString()
                val al = alamat.text.toString()
                val us = user.text.toString()
                val pas = pass.text.toString()

                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("nama", n)
                intent.putExtra("addres", al)
                intent.putExtra("username", us)
                intent.putExtra("pswrd", pas)
                startActivity(intent)
            }


        }

    }

    private fun toast(pesan: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan, length).show()

    }
}