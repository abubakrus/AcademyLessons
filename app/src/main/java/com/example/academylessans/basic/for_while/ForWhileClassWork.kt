package com.example.academylessans.basic.for_while

import android.util.Log

class ForWhileClassWork {
    init {
        //что бы ввывести на экран все нечетные мы можем сделать
        for (i in 0..100){
            if (i % 2 ==0){
                //Log.i("AbuAcademy", i.toString())
            }
        }
        //Цикл while повторяет определенные действия пока истинно некоторое условие:
        var x = 100
        while (x > 0){
            x--
            Log.i("AbuAcademy", x.toString())
        }
    }
}