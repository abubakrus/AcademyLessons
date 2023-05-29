package com.example.academylessans.music.spalsh_activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylessans.R
import com.example.academylessans.music.MusicListActivity
import com.example.academylessans.music.RegistrationMainActivity
import com.example.academylessans.music.models.User

class SplashActivity : AppCompatActivity() {
    private val userCache: UserCacheManager by lazy {
        UserCacheManager(this)
    }
    private val user:User by lazy {
        userCache.getUser() as User
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val intent = if (user.isAuth){
            Intent(this, MusicListActivity::class.java)
        }else{
            Intent(this, RegistrationMainActivity::class.java)
        }
        startActivity(intent)
    }
}