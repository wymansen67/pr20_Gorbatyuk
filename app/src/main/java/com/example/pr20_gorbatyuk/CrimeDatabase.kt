package com.example.pr20_gorbatyuk

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ Crime::class ], version=1)
abstract class CrimeDatabase : RoomDatabase() {
}