package com.example.hw15.task1

import com.example.hw15.task2.Worker

class HourlyWorker(name: String, id: Int, private val hourlyPayment: Double) : Worker(name, id) {
    override fun toString() = super.toString() + " || с месячной зп = ${paymentOfMonth()}"
    override fun paymentOfMonth(): Double = 20.8 * 8 * hourlyPayment
}