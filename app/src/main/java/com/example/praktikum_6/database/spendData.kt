package com.example.praktikum_6.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.Database

@Entity
data class spendData(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama: String,
    val value: String
)
