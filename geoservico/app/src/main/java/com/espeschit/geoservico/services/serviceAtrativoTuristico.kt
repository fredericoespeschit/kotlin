package com.espeschit.geoservico.services


import com.espeschit.geoservico.models.AtrativoTuristico
import retrofit2.Call
import retrofit2.http.GET

interface serviceAtrativoTuristico {

    @GET("ATRATIVO_TURISTICO")
    fun getAtrativoTuristico() : Call<AtrativoTuristico>
}