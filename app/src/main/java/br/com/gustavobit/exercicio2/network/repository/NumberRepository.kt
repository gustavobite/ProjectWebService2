package br.com.gustavobit.exercicio2.network.repository

import br.com.gustavobit.exercicio2.network.Retrofit
import br.com.gustavobit.exercicio2.model.Numbers

class NumberRepository {

    suspend fun getClassifiedNumbers(numbers: String) : Numbers {
        return Retrofit.numberApi.getClassifiedNumbers(numbers)
    }

}