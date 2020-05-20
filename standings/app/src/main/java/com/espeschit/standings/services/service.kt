package com.espeschit.standings.services

import com.espeschit.standings.models.standings
import com.espeschit.standings.models.table
import retrofit2.Call
import retrofit2.http.GET

interface service {

    @GET("standings")
    fun getStandings(): Call<table>

}