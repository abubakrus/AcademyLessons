package com.example.academylessans.basic.Array

import android.util.Log

class ArrayClassWork {
    init {
        ///exampleFirst()
        //exempleSecond()
        //exemlpeThird()
        //exemlpeFour()
        exemlpeFifth()
    }
    fun exampleFirst(){
        val array:Array<Int> = arrayOf(1,2,3,4)
        for (element in array){
            //Log.i("AbuAcademy", element.toString())
        }
    }
    fun exempleSecond() {
        val names: Array<String> = arrayOf(
            "Bob",
            "Kine",
            "Michel"
        )
        val bob:String = names[0]
        //Log.i("AbuAcademy", bob.toString())
    }
    fun exemlpeThird(){
        var i = 10
        val numbers:Array<Int> = Array(10, {i++ *2})
        //Log.i("AbuAcademy", numbers.size.toString())
        for (number in numbers){
            //Log.i("AbuAcademy", number.toString())
        }

    }
     fun exemlpeFour(){
         val array = mutableListOf<String>()
         //Log.i("AbuAcademy", "количество элементов в массива = ${array.size} ")
         array.add("Bob")
         array.add("Kine")
         array.add("Jack")
         array.add(0,"Tom")
         //Log.i("AbuAcademy", "количество элементов в массива = ${array.size} ")
         for (name in array){
             //Log.i("AbuAcademy", "массив пустой =${name}")
         }
     }
    fun exemlpeFifth(){
        val array = mutableListOf<Double>()
        array.add(0.0)
        array.add(0.12)
        if (array.isNotEmpty()){
            Log.i("AbuAcademy", array.first().toString() )
        }else{
            Log.i("AbuAcademy", "Массив пустой")
        }
        array.removeAt(1)
        for (element in array){
            Log.i("AbuAcademy", element.toString())
        }
    }
}