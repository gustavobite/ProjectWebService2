package br.com.gustavobit.exercicio2.network.repository

import br.com.gustavobit.exercicio2.network.Retrofit
import br.com.gustavobit.exercicio2.model.Mimic

class MimicRepository {

    suspend fun getMimicText(text: String) : Mimic {
        return Retrofit.mimicApi.getMimicText(text)
    }

}