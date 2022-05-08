package com.example.hw15.task1

import java.time.LocalDate
import java.time.Period

class Wine(
    val name: String,
    val brand: String,
    val country: String,
    private val date: LocalDate,
    val note: String
) {
    fun wineAging(someData: LocalDate) = println(
        "Текущая дата: $someData\n " +
                "Выдержка вина составляет = ${Period.between(someData, date)}"
    )
}