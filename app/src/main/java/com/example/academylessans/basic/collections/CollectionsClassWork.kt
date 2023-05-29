package com.example.academylessans.basic.collections

import android.util.Log

class CollectionsClassWork {
    init {
        //exempleFirst()
        //exemplesecond()
        //exempleThird()
        exempleFour()
    }
    private fun exempleFirst(){
        // создания типа лист
        val list = listOf<Short>()
        //создание типа мютебле
        val mutableList = mutableListOf<String>()
        //объект лист не можем дальнеейшем не сможем редактировать
        //list.add отсуствует
        //list.remove отсуствует

        //добавляем в мютебле
        mutableList.add("Bob")
        mutableList.add(0,"Tom")

        //обычное удаление
        mutableList.remove("Bob")
        mutableList.removeAt(0)
        val  secondMutableList = mutableListOf<String>()
        secondMutableList.add("Taxi")
        secondMutableList.add("Naruto")

        mutableList.addAll(secondMutableList)
        mutableList.add("passenge")
        Log.i("AbuAcademy", mutableList.toString())

        mutableList.clear()
        Log.i("AbuAcademy", mutableList.toString())

        for (element in mutableList){

        }
        mutableList.forEach{

        }
    }
    private fun exemplesecond(){
        val set = setOf<String>()
        val mutableSet = mutableSetOf<String>()

        mutableSet.add("bob")
        Log.i("AbuAcademy", mutableSet.toString())

        mutableSet.remove("bob")

        mutableSet.forEach{

        }
        mutableSet.forEachIndexed { index, s ->  }


    }
    private fun exempleThird(){
        val map = mapOf<String, Int>()
        val mutableMap = mutableMapOf<String, Int>()

        mutableMap.put(key = "1234", value = 9)

        val nine = mutableMap["1234"]
        Log.i("AbuAcademy", nine.toString())
    }
    private fun exempleFour(){
        val hashSet = hashSetOf<String>()
        hashSet.add("abu")
        Log.i("AbuAcademy", hashSet.toString())
    }
}