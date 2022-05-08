package com.example.hw15.task2

abstract class Worker(
    val name: String,
    val id: Int
) {
    override fun toString() = "name - $name || id - $id"
    abstract fun paymentOfMonth(): Double
}

