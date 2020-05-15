package com.espeschit.jogadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Pegando o clica do botão
        buttonEntrar.setOnClickListener {
            buttonEntrarClick()
        }
    }

    fun buttonEntrarClick() {
        //if com a validação do login
        if (editTextEmail.text.toString().equals("campeonato@brasileiro.com")
            && editTextSenha.text.toString().equals("123456")) {

            //Chama a próxima tela
            var intent = Intent(this, ListaDeTimesActivity::class.java)
            startActivity(intent)

            //fechando activity atual (removendo da pilha)
            finish()
        }

    }
}
