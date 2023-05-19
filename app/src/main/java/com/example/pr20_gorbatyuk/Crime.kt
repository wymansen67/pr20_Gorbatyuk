package com.example.pr20_gorbatyuk

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.Date
import java.util.UUID

/*class Crime(val id: UUID = UUID.randomUUID()) {
    var title: String = ""
    var date: Date = Date()
    var isSolved: Boolean = false
}*/

@Entity
data class Crime(@PrimaryKey val id: UUID = UUID.randomUUID(), var title: String = "", var date: Date = Date(), var isSolved: Boolean = false)