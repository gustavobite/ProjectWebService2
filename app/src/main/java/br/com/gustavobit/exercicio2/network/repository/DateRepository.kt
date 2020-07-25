package br.com.gustavobit.exercicio2.network.repository

import br.com.gustavobit.exercicio2.network.Retrofit
import br.com.gustavobit.exercicio2.model.Date

class DateRepository {

    suspend fun getDateDifferences(startDate: String, endDate: String) : Date {
        return Retrofit.dateApi.getDateDifferences(startDate, endDate)
    }

}