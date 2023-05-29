package com.example.academylessans.basic.for_while

import android.util.Log

class ForWhileHomeWork {
    init {
        // 1 Напишите программу, которая выводит на экран все целые числа от 1 до 10.
      for (a in 0..10) {
            //Log.i("AbuAcademy", a.toString())
        }
        // 2 Напишите программу, которая считает и выводит на экран сумму первых 10 натуральных чисел.
        var j = 0
        for (b in 0..10) {
            j += b
        }
        //Log.i("AbuAcademy", j.toString())
        // 3 Напишите программу, которая считает и выводит на экран сумму всех чисел от 1 до 1000, которые делятся на 3 или на 5.
        for (c in 0..1000) {
            if (c % 3 == 0 || c % 5 == 0) {
                //Log.i("AbuAcademy", c.toString())
            }
        }
        // 4 Напишите программу, которая выводит на экран все четные числа от 1 до 20.
        for (d in 0..20) {
           if (d % 2 == 0) {
               //Log.i("AbuAcademy", d.toString())
            }
        }
        // 5 Напишите программу, которая выводит на экран таблицу умножения на число 5 (от 1 до 10).
        var q = 0
        for (w in 1..50 step 5) {
            //Log.i("AbuAcademy","5 * $q = $w" )
            q++
        }
        //   6 Напишите программу, которая выводит на экран все числа от 1 до 100, которые являются квадратами целых чисел.
        var r = 1
        for (n in 0..100){
            if (n ==(r*r) ){
                //Log.i("AbuAcademy", n.toString())
                r++
            }
        }
        //   7 Напишите программу, которая выводит на экран первые 20 чисел Фибоначчи.
        var f1 = 0
        var f2 = 1
        var sum = 0
        for (u in 0..18){
            sum = f1 +f2
            Log.i("AbuAcademy",sum.toString())
            f1 = f2
            f2 = sum
        }
    }
}