package br.com.gustavobit.exercicio2.network.api

import br.com.gustavobit.exercicio2.model.Date
import retrofit2.http.GET
import retrofit2.http.Path

interface DateApi {
    @GET("date/{startDate}/{endDate}")
    suspend fun getDateDifferences(
        @Path("startDate") startDate: String,
        @Path("endDate") endDate: String
    ) : Date
}