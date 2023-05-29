package com.example.academylessans.basic

import android.util.Log

class WhenClassWork {
    init {
        val temperature:Int = 255
        var temperatureMessage:String=""

        when (temperature){

            in 0..20 -> {
                temperatureMessage = "холодная"
            }
            in -20..0 -> {
                temperatureMessage ="мороз"
            }
            in 20..40 -> {
                temperatureMessage = "жара"
            }
            in -100..-20 -> {
                temperatureMessage = "анамальная холод"
            }
            in 40..100 -> {
                temperatureMessage = "анамальная жара"
            }
            //если нужно будет некоректное число можно сделать так
            else ->{
                temperatureMessage = "некоректное число"
            }
        }
        Log.i("AbuAcademy", temperatureMessage)
    }
}