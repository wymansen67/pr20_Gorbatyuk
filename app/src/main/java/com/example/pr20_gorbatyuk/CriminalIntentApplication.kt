package com.example.pr20_gorbatyuk

import android.app.Application
import com.example.pr20_gorbatyuk.database.CrimeRepository

class CriminalIntentApplication : Application()
{

    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}