package com.example.hw15

import com.example.hw15.task1.Wine
import java.time.LocalDate

fun main() {
    val barberaWine =
        Wine(
            "Barbera", "brand", "Spain",
            LocalDate.of(2010, 8, 22), "Cool"
        )
    val nowDate = LocalDate.now()
    barberaWine.wineAging(nowDate)
}