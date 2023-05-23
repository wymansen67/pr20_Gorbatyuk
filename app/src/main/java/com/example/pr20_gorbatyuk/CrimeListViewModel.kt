package com.example.pr20_gorbatyuk

import androidx.lifecycle.ViewModel
import com.example.pr20_gorbatyuk.database.CrimeRepository

class CrimeListViewModel : ViewModel() {
    private val crimeRepository = CrimeRepository.get()
    val crimeListLiveData = crimeRepository.getCrimes()

}