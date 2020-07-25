package br.com.gustavobit.exercicio2.ui.main.date

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.gustavobit.exercicio2.model.Date
import br.com.gustavobit.exercicio2.network.repository.DateRepository
import kotlinx.coroutines.runBlocking

class DateViewModel : ViewModel() {
    private val repository = DateRepository()

    val dateLiveData = MutableLiveData<Date>()

    fun getDateDifferences(startDate: String, endDate: String) {
        runBlocking {
            dateLiveData.postValue(repository.getDateDifferences(startDate, endDate))
        }
    }
}