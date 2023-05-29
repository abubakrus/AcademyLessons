package com.example.academylessans.basic.if_else

import android.util.Log

class IfElseClasswork {
    init {
        //пример первый
        val isSubscribe: Boolean = false
        var message: String = ""
        if (isSubscribe) {
            message = " вас есть патписка"
        } else {
            message = "у вас нет потписки"
        }
        Log.i("ITAcademy", message)
        //пример второй
        val age: Int = 55
        var userMessage: String = ""
        if (age >= 0 && age <= 10){
            userMessage ="дитя"
        }else if (age >= 10 && age <= 20) {
            userMessage = "подросток"
        }else if (age >= 20 && age <= 30) {
            userMessage = "молодой"
        }else if (age >= 30 && age <= 55) {
            userMessage = "средний возрааст"
        }else{
            userMessage = "старость"
        }
        Log.i("ITAcademy", userMessage)
        //пример третьй
        val  tem: Double = 19.4
        var temMessage: String = ""
        if (tem >= 0 && tem <= 20){
            temMessage = "холод"
        }else if (tem <= -21 && tem <= 0){
            temMessage = "мороз"
        }else if (tem >= 20 && tem <= 50){
            temMessage = "жара"
        }else if (tem <= -21){
            temMessage = "анамальная холод"
        }else{
            temMessage ="анамальная жара"
        }
        Log.i("ITAcademy", temMessage)
    }

}