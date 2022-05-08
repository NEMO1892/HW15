package com.example.hw15.task2

class FixWorker(name: String, id: Int, private val fixPayment: Double) : Worker(name, id) {
    override fun toString() = super.toString() + " || с месячной зп = $fixPayment"
    override fun paymentOfMonth() = fixPayment
}