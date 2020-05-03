package com.espeschit.jogadores

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_lista_de_times.*
import java.util.ArrayList

class ListaDeTimesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_times)

        var times = ArrayList<String>()
        //Adicionado times da serie A do campeonado 2020

        times.add("Athletico-PR")
        times.add("Atlético-GO")
        times.add("Atlético-MG")
        times.add("Bahia")
        times.add("Botafogo")
        times.add("Bragantino")
        times.add("Ceará")
        times.add("Corinthians")
        times.add("Coritiba")
        times.add("Flamengo")
        times.add("Fluminense")
        times.add("Fortaleza")
        times.add("Goiás")
        times.add("Grêmio")
        times.add("Internacional")
        times.add("Pamleiras")
        times.add("Santos")
        times.add("São Paulo")
        times.add("Sport")
        times.add("Vasco")

        ListViewDeTimes.adapter = ListaDeTimesAdapter(this, times)

        ListViewDeTimes.setOnItemClickListener { parent, view, position, id ->

            var x = times[position]
            Log.i("Times", "O time selecionado foi: " + x)

            var intent = Intent( this, ListaDeJogadoresActivity::class.java)
            intent.putExtra("timeselecionado", x)

            startActivity(intent)
        }
    }
}
