package com.espeschit.geoservico.services

import com.espeschit.geoservico.models.EscolasMunicipaisEI
import retrofit2.Call
import retrofit2.http.GET
interface serviceEscolasMunicipaisEI {
    @GET ("ESCOLAS_MUNICIPAIS_EDUCACAO_INFANTIL")
    fun getEscolasMunicipaisEI() : Call<EscolasMunicipaisEI>
}