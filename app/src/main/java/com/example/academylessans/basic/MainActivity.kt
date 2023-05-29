package com.example.academylessans.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.academylessans.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //IfElseClasswork()
        //IfElseHomeWork()
        //WhenClassWork()
        //ForWhileClassWork()
        //ForWhileHomeWork()
        //ArrayClassWork()
        //ArrayHomeWork()
        //CollectionsClassWork()
        //CollectionsHomeWork()



        // val
        // var
        var zadalovok:String = "Instagram"
        val kolichestvoSoobsheniy: Int = 23
        Log.i("AndroidAcademy", zadalovok)
        zadalovok = "Telegram"
        Log.i("AndroidAcademy", zadalovok)



        val age: Int = 17
        val age2: String = "17"

        val year: Int = 5
        val sum = age + year
        Log.i("AndroidAcademy", sum.toString())

        val intNumber = 214748364
        val longNumber = 2147483648
        val shortNumber = 32767
        val byteNumber = 127

        val manya: Double = 328888.50

        val a: Int = 401
        val b: Int = 401
        val check = a == b


        val symbol: Char = '8'

        Log.i("AndroidAcademy", sum.toString())
    }
}