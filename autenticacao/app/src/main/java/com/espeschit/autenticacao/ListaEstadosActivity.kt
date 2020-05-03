package com.espeschit.autenticacao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lista_estados.*
import java.util.ArrayList

class ListaEstadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_estados)

        var estados = ArrayList<String>()

        estados.add("Acre")
        estados.add("Alagoas")
        estados.add("Amapá")
        estados.add("Amazonas")
        estados.add("Bahia")
        estados.add("Ceará")
        estados.add("Distrito Federal")
        estados.add("Espírito Santo")
        estados.add("Maranhão")
        estados.add("Mato Grosso")
        estados.add("Mato Grosso do Sul")
        estados.add("Minas Gerais")
        estados.add("Pará")
        estados.add("Paraíba")
        estados.add("Paraná")
        estados.add("Pernambuco")
        estados.add("Piauí")
        estados.add("Rio de Janeiro")
        estados.add("Rio Grande do Norte")
        estados.add("Rio Grande do Sul")
        estados.add("Rondônia")
        estados.add("Roraima")
        estados.add("Santa Catarina")
        estados.add("São Paulo")
        estados.add("Sergipe")
        estados.add("Tocantins")

        listaEstados.adapter = ListaEstadoAdapter(this, estados)
        
        listaEstados.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, estados[position], Toast.LENGTH_LONG).show()
        }
    }
}
