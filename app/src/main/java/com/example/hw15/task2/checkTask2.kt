package com.example.hw15.task2

import com.example.hw15.task1.HourlyWorker
import java.io.*

fun main(){
    val listOfHourlyWorkers = fillingHourlyWorkers()
    val listOfFixWorkers = fillingFixWorkers()
    val listOfWorkers: ArrayList<Worker> = arrayListOf()
    listOfWorkers.addAll(listOfHourlyWorkers)
    listOfWorkers.addAll(listOfFixWorkers)
    println("До сортировки: ")
    printWorkers(listOfWorkers)
    listOfWorkers.sortWith(
        compareByDescending<Worker> { it.paymentOfMonth() }.thenBy { it.name }
    )
    println("После сортировки: ")
    printWorkers(listOfWorkers)

    println("Вывод первых 5 имён")
    for(i in 0 until 5){
        println(listOfWorkers[i])
    }
    println("Вывод последних 3 имён")
    for(i in listOfWorkers.size - 1 downTo listOfWorkers.size-3){
        println(listOfWorkers[i])
    }
    val fileWriter = FileWriter(
        "C:\\Users\\tema1\\AndroidStudioProjects\\HW15\\app\\src\\main\\java\\com\\example\\hw15\\task2\\someFile.txt")
    val bufferWriter = BufferedWriter(fileWriter)
    try {
    listOfWorkers.forEach {

            bufferWriter.write(it.name)
            bufferWriter.write(it.id)
            bufferWriter.write(it.paymentOfMonth().toInt())
    }
    bufferWriter.close()
    val fileReader = FileReader(
        "C:\\Users\\tema1\\AndroidStudioProjects\\HW15\\app\\src\\main\\java\\com\\example\\hw15\\task2\\someFile.txt")
    val bufferedReader = BufferedReader(fileReader)
    println(bufferedReader.readLine())
    }catch (e: IOException){
        e.printStackTrace()
    }
}

fun fillingHourlyWorkers() : ArrayList<HourlyWorker>{
    val listOfHourlyWorkers: ArrayList<HourlyWorker> = arrayListOf()
    val hourlyWorker1 = HourlyWorker("Иван иванов", 1, 20.5)
    val hourlyWorker2 = HourlyWorker("Конев Александр", 2, 25.5)
    val hourlyWorker3 = HourlyWorker("Чинов Алексей", 3, 15.5)
    listOfHourlyWorkers.add(hourlyWorker1)
    listOfHourlyWorkers.add(hourlyWorker2)
    listOfHourlyWorkers.add(hourlyWorker3)
    return listOfHourlyWorkers
}

fun fillingFixWorkers(): ArrayList<FixWorker>{
    val listOfFixWorkers: ArrayList<FixWorker> = arrayListOf()
    val fixWorker1 = FixWorker("Денисов Денис", 4, 825.4)
    val fixWorker2 = FixWorker("Иванит Лютиков", 5, 1027.8)
    val fixWorker3 = FixWorker("Аосолапов Михаил", 6, 825.4)
    listOfFixWorkers.add(fixWorker1)
    listOfFixWorkers.add(fixWorker2)
    listOfFixWorkers.add(fixWorker3)
    return  listOfFixWorkers
}

fun printWorkers(workers : ArrayList<Worker>){
    workers.forEach {
        println(it.toString())
    }
}

