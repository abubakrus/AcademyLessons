package com.example.academylessans.basic.collections

import android.support.v4.app.INotificationSideChannel
import android.util.Log
import kotlin.random.Random

class CollectionsHomeWork {
    init {
        //task1()
        //task2()
        //task4()
        //task5()
        task6()
        //task7()
        //task8()
    }
    //напишите программу которая создает список от 1 до 10 и выводит его на экран
    private fun task1() {
        val mutableList = mutableListOf<Int>()
        for (i in 0..4){
        }

    }
    //напишите программу которая создает списо целых чисел и выводит на экран сумму котрая делится на 3
    private fun task2(){
        val mutableList1= mutableListOf<Int>(12,15,16,9,7,1,10)
        var sum = 0
        for (i in mutableList1){
            if (i % 3 ==0){
                sum += i
                Log.i("AbuAcademy", i.toString())
            }
        }
    }
    //напишите программу которая список от 1 до 20 чисел и удалите все нечетные числа и выводите на экран
    private fun task4(){
        val mutableList2= mutableListOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
        for(i in mutableList2){
            if (i %2==0){
                Log.i("AbuAcademy", i.toString()
                )
            }
        }
    }

    //напишите программу которая создает словарь где ключами являются числа от
// 1 до 5 а их значение равна их квадратам
    private fun task5(){
        val map = mutableMapOf<Int, Int>()
        map.put(1,1)
        map.put(2,4)
        map.put(3,9)
        map.put(4,16)
        map.put(5,25)
        val one = map[1]
        val two = map[2]
        val third = map[3]
        val four = map[4]
        val five = map[5]
        Log.i("AbuAcademy", four.toString())
    }
    //напишиет программу которая создает список строк котрая удаляет все строки котрая начинается на а
    //выведите все оставшиеся строки
    private fun task6(){
        val mutableList= mutableListOf<String>()
        mutableList.add("«Чем умнее человек, тем легче он признает себя дураком». Альберт Эйнштейн")
        mutableList.remove("а")
        Log.i("AbuAcademy", mutableList.toString())

    }
    //напишите программму которая создает список целых чисел и выводит его на экран по возрастанию
    private fun task7(){
        val mutableList = mutableListOf<Int>(100,90,80,70,45,65,82,74,12,22,20,31,0)
        mutableList.sort()
        Log.i("AbuAcademy", mutableList.toString())
    }
    //напишите программу котоая создает список целых чисел и выводит максимальное и минимальное значение
    private fun task8(){
        val mutableList = mutableListOf<Int>(100,90,80,70,45,65,82,74,12,22,20,31,0)
        //Log.i("AbuAcademy",mutableList.max().toString())
        Log.i("AbuAcademy",mutableList.min().toString())
    }
}
