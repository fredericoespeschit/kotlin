package com.espeschit.jogadores

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_lista_de_jogadores.*
import java.util.ArrayList

class ListaDeJogadoresActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_de_jogadores)

        var timeSelecionado = intent.getStringExtra("timeselecionado")

        var jogador = ArrayList<String>()

        if (timeSelecionado.equals("Athletico-PR")) {
            jogador.add("Santos")
            jogador.add("Jandrei")
            jogador.add("Anderson Paixão")
            jogador.add("Caio")
            jogador.add("Léo Vieira")
            jogador.add("Lucas Halter")
            jogador.add("Felipe Aguilar")
            jogador.add("Thiago Heleno")
            jogador.add("Robson Bambu")
            jogador.add("Zé Ivaldo")
            jogador.add("Pedrão")
            jogador.add("Abner")
            jogador.add("Márcio Azevedo")
            jogador.add("Adriano")
            jogador.add("Jáderson")
            jogador.add("Khellven")
            jogador.add("Jonathan")
            jogador.add("Wellington")
            jogador.add("Léo Cittadini")
            jogador.add("Erick")
            jogador.add("Lucho González")
            jogador.add("Christian")
            jogador.add("Matheus Anjos")
            jogador.add("Léo Gomes")
            jogador.add("Vitinho")
            jogador.add("Nikão")
            jogador.add("Fernando Canesin")
            jogador.add("João Pedro")
            jogador.add("Juan Manuel Beselli")
            jogador.add("Marquinhos Gabriel")
            jogador.add("Pedrinho")
            jogador.add("Jajá")
            jogador.add("Carlos Eduardo")
            jogador.add("Yago César")
            jogador.add("Guilherme Bissoli")

        } else if (timeSelecionado.equals("Atlético-GO")) {
            jogador.add("Jean")
            jogador.add("Mauricio Kozlinski")
            jogador.add("Lucas")
            jogador.add("Gustavo")
            jogador.add("Oliveira")
            jogador.add("Gilvan")
            jogador.add("Éder")
            jogador.add("Nicolas")
            jogador.add("Moraes")
            jogador.add("Reginaldo")
            jogador.add("Dudu")
            jogador.add("Édson")
            jogador.add("Marlon Freitas")
            jogador.add("Jorginho")
            jogador.add("Matheuzinho")
            jogador.add("Matheus Vargas")
            jogador.add("Henry Vaca")
            jogador.add("Júlio César")
            jogador.add("Gustavo Ferrareis")
            jogador.add("Hyuri")
            jogador.add("Renato Kayzer")
            jogador.add("Junior Brandão")
            jogador.add("Edson Júnior")

        } else if (timeSelecionado.equals("Atlético-MG")) {
            jogador.add("Victor")
            jogador.add("Michael")
            jogador.add("Rafael")
            jogador.add("Igor Rabello")
            jogador.add("Gabriel")
            jogador.add("Réver")
            jogador.add("Guilherme Arana")
            jogador.add("Lucas Hernández")
            jogador.add("Fábio Santos")
            jogador.add("Guga")
            jogador.add("Maílton")
            jogador.add("Alex Silva")
            jogador.add("Jair")
            jogador.add("Ramón Martínez")
            jogador.add("Allan")
            jogador.add("Gustavo Blanco")
            jogador.add("Marquinhos")
            jogador.add("Juan Cazares")
            jogador.add("Hyoran")
            jogador.add("Bruno Silva")
            jogador.add("Nathan")
            jogador.add("Jefferson Savarino")
            jogador.add("Dylna Borrero")
            jogador.add("Clayton")
            jogador.add("Capixaba")
            jogador.add("Diego Tardelli")
            jogador.add("Franco Di Santo")
            jogador.add("Ricardo Oliveira")
        } else if (timeSelecionado.equals("Bahia") || timeSelecionado.equals("Botafogo")) {
            jogador.add("Nomes dos jogadores não foram \nimplementados do Time Bahia pra baixo")

        }

        //   ListViewDeTimes.adapter = ListaDeTimesAdapter(this, times)
        ListViewDeJogadores.adapter = ListaDeJogadoresAdapter(this, jogador)
    }
}


