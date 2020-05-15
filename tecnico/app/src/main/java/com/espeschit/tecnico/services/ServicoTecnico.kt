package com.espeschit.tecnico.services

import com.espeschit.tecnico.models.listaDeTecnicos
import retrofit2.Call
import retrofit2.http.GET

interface ServicoTecnico {

    @GET ("tecnico")
    fun getTecnicos() : Call<listaDeTecnicos>
}