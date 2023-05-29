package com.example.academylessans.music

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.academylessans.R
import com.example.academylessans.databinding.ActivityLoginMainBinding

class LoginMainActivity : AppCompatActivity() {
    private val binding by lazy {
        ActivityLoginMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.enterBotton.setOnClickListener {
            val loginText = binding.loginEditText.text.toString()
            val passwordText = binding.passwordEditText.text.toString()
            binding.registrationInMusicList.setOnClickListener{navigateToMusicRegistration()}
            when{
                loginText.isEmpty()->{
                    showToast(getString(R.string.fill_in_the_login_input_field))
                }
                !loginText.contains("@gmail.com")->{
                    showToast("Неправельный ввод данных в логине ")
                }
                passwordText.isEmpty()->{
                    showToast("Заполните поле ввода для password")
                }
                passwordText.length <= 8->{
                    showToast("Заполните правельно поле ввода для password")
                }
                else ->{
                    navigateToMusicListActivity()
                }
            }
        }
    }
    private fun navigateToMusicListActivity(){
        val intent = Intent(this, MusicListActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK
                or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        startActivity(intent)
    }
    private fun navigateToMusicRegistration(){
        val intent=Intent(this, RegistrationMainActivity::class.java)
        startActivity(intent)
    }
    private fun showToast(message: String){
        Toast.makeText(
            this,
            message,
            Toast.LENGTH_SHORT).show()
    }
}