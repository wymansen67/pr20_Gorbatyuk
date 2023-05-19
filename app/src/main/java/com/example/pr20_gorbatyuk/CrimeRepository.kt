package com.example.pr20_gorbatyuk

import android.content.Context
import androidx.room.Room
import java.util.UUID

private const val DBName = "dataBase"

class CrimeRepository private
constructor(context: Context) {

    companion object {
        private var INSTANCE: CrimeRepository? =
            null

        fun initialize(context: Context) {
            if (INSTANCE == null) {
                INSTANCE = CrimeRepository(context)
            }
        }

        fun get(): CrimeRepository {
            return INSTANCE ?:
            throw
            IllegalStateException("CrimeRepository must be initialized")
        }

    }
    private val database : CrimeDatabase = Room.databaseBuilder(context.applicationContext, CrimeDatabase::class.java, DBName).build()
    private val crimeDao = database.crimeDao()
    fun getCrimes(): List<Crime> = crimeDao.getCrimes()

    fun getCrime(id: UUID): Crime? = crimeDao.getCrime(id)
}