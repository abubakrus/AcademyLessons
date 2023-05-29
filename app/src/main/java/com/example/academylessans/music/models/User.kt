package com.example.academylessans.music.models

data class User (
    val name: String,
    val lastName: String,
    val email: String,
    val password: String,
    val isAuth: Boolean,
){
    companion object{
        fun unknown
    }
}
