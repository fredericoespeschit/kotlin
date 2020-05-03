package com.espeschit.autenticacao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login.setOnClickListener {
            loginClick()
        }
    }

    fun loginClick() {

        if (email.text.toString().equals("fespeschitt@gmail.com") &&
            password.text.toString().equals("123456")
        ) {
            var intent = Intent(this, ListaEstadosActivity::class.java)
            startActivity(intent)

            //fechando activity atual (removendo da pilha)
            finish()
        }
    }
}
