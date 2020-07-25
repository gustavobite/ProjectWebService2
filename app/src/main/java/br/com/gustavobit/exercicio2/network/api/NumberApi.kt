package br.com.gustavobit.exercicio2.network.api

import br.com.gustavobit.exercicio2.model.Numbers
import retrofit2.http.Body
import retrofit2.http.POST

interface NumberApi {
    @POST("number/")
    suspend fun getClassifiedNumbers(
        @Body numbers: String
    ) : Numbers
}