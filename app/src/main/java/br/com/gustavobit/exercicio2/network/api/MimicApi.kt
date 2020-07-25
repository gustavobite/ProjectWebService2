package br.com.gustavobit.exercicio2.network.api

import br.com.gustavobit.exercicio2.model.Mimic
import retrofit2.http.Body
import retrofit2.http.POST

interface MimicApi {
    @POST("mimic/")
    suspend fun getMimicText(
        @Body text: String
    ) : Mimic
}