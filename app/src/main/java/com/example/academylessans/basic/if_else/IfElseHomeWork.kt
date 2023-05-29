package com.example.academylessans.basic.if_else

import android.util.Log

class IfElseHomeWork {
    init {
        //Start Home Work
        val a:Int = 10
        val b:Int = 15
        var userMessage1:String = ""
        if (b > a){
            userMessage1 = "a больше чем b"
        }else{
            userMessage1 = "a меньше чем b"
        }
        //вторая задача
        val s:Int = 10
        val d:Int = 12
        var userMessage2:String = ""
        if (s > d){
            userMessage2 = "s больше чем d"
        }else if (s == d){
            userMessage2 = "s равный вы d"
        }else{
            userMessage2 ="s меньше чем d"
        }
        Log.i("AbuAcademy", userMessage2)

        // третья задача
        val entrance: Int = 45
        var userMessage3: String = ""
        if (entrance <= 0 && entrance >= 90 ) {
            userMessage3 = "Убедитесь что вы ввели вашу квартиру правельно "
        }else if (entrance >= 1 && entrance <=20){
            userMessage3 = "вы проживете в первом подезде "
        }else if (entrance >= 21 && entrance <=48) {
            userMessage3 = "вы проживете во втором подезде"
        } else{
            userMessage3 = "вы проживаете в третьем подезде"
        }
        Log.i("AbuAcademy", userMessage3)
        //четвертая задача
        val login: String = "ivan"
        val password: String ="334455"
        var loginMessage:String =""
        if (login == "ivan" && password == "334455"){
            loginMessage = "Добро пажаловать"
        }else{
            loginMessage = "Ошибка входа !"
        }
        val login1: String = "alex"
        val password1: String ="777"
        var loginMessage1:String =""
        if (login1 == "alex" && password1 == "777"){
            loginMessage1 = "Добро пажаловать"
        }else{
            loginMessage1 = "Ошибка входа !"
        }
        val login2: String = "petr"
        val password2: String ="b5678"
        var loginMessage2:String =""
        if (login2 == "petr" && password2 == "b5678"){
            loginMessage2 = "Добро пажаловать"
        }else{
            loginMessage2 = "Ошибка входа !"
        }
        Log.i("AbuAcademy", loginMessage2)
        //пятая задача
        val experience: Int = 2
        var userMessage4: String = ""
        if (experience < 0 ){
            userMessage4 = "Пжалуйста проверьте свои стаж на наличие ошибки !"
        }else if (experience >= 0 && experience <= 3){
            userMessage4 = "0% надбавка"
        }else if (experience >= 4 && experience <= 10){
            userMessage4 = "10% надбавка"
        }else if (experience >= 11 && experience <= 20){
            userMessage4 = "20% надбавка"
        }else{
            userMessage4 = "25% надбавка"
        }
        Log.i("AbuAcademy", userMessage4)
        }
    }
