package com.example.academylessans.basic.Array

import android.util.Log

class ArrayHomeWork {
    init {
        ezampleFirst()
        ezampleSecond()
    }
    //напишите программу которая находит  сумму всех элементов массива
    fun ezampleFirst(){
        var sum= 0
        val arraySum1: Array<Int> = arrayOf(1,1,1,1,1)
        for (i in arraySum1){
            sum + i
        }
        Log.i("AbuAcademy", sum.toString() )
    }
    //напишите программу которая нааходит среднее арифметическое элементов массива
    fun ezampleSecond(){
        var sum2 =0
        val arraySum2: Array<Int> = arrayOf(9,9,9,9,6,3)
        for (i in arraySum2){
            sum2 + i
        }
        sum2 / arraySum2.size
        Log.i("AbuAcademy", sum2.toString())
    }
    //напишите программу которая находит максимальный и минимальный элемент массива

}

