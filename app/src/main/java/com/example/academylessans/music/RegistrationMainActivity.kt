package com.example.academylessans.music

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.academylessans.databinding.ActivityRegistrationMainBinding

class RegistrationMainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityRegistrationMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.createAccountBotton.setOnClickListener(){
            val firtsName = binding.firstNameEdit.text.toString()
            val lastName = binding.lastNameEdit.text.toString()
            val email = binding.emailEdit.text.toString()
            val registrationPassword = binding.resgistrationPasswordEdit.text.toString()
            when{
                firtsName.isEmpty()->{
                    showToast("Вы не заполнили поле для ввода First name")
                }
                lastName.isEmpty()->{
                    showToast("Вы не заполнили поле для ввода Last name")
                }
                email.isEmpty()->{
                    showToast("Вы не заполнили поле для ввода Email")
                }
                !email.contains("@gmail.com")->{
                    showToast("Вы неправильно заполнили поле для ввода Email")
                }
                registrationPassword.isEmpty()->{
                    showToast("Вы не заполнили поле для ввода Password")
                }
                registrationPassword.length <= 7->{
                    showToast("Вы неправильно заполнили поле для ввода Password")
                }
                else->{
                    navigateToMusicRegistrtion()
                }
            }
        }
    }
    private fun navigateToMusicRegistrtion(){
        val intent = Intent(this, MusicListActivity::class.java)
        startActivity(intent)
    }
    private fun showToast(message: String) {
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT).show()
    }
}