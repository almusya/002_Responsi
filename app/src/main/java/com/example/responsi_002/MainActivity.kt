package com.example.responsi_002

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          val intent = intent

        val userr =  findViewById<EditText>(R.id.user)
        val pass1 =  findViewById<EditText>(R.id.pass)

        val user = intent.getStringExtra("username")
        val pass = intent.getStringExtra("pswrd")

            val login = findViewById<Button>(R.id.login2)
            val login2 = findViewById<Button>(R.id.login3)


        login.setOnClickListener{

            val  user1= userr.text.toString()
            val  pss1= pass1.text.toString()
            if(user1 == user  && pss1 == pass){
                val intent = Intent(this@MainActivity,Home::class.java)
                startActivity(intent)

            }
            else if (userr.text.isEmpty() || pass1.text.isEmpty()){
                toast("Silahkan Registrasi Terlebih Dahulu",Toast.LENGTH_LONG)
            }else{

                toast("Username atau Password Anda Salah ", Toast.LENGTH_LONG)
            }
        }

        login2.setOnClickListener{

            val intent = Intent(this@MainActivity,Logins::class.java)
            startActivity(intent)
        }

    }
    private fun toast(pesan: String, length: Int = Toast.LENGTH_LONG) {
        Toast.makeText(this, pesan, length).show()

    }

}
