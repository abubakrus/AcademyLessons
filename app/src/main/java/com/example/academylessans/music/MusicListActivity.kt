package com.example.academylessans.music

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.academylessans.databinding.ActivityMusicListBinding
import com.example.academylessans.music.models.Music

class MusicListActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMusicListBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val musicList = mutableListOf<Music>()
        musicList.addAll(generateRandomMusicObject())

        val adapter = MusicAdapter(
            navigateToPlayerListener = {
                navigateToMusicPlayerActivity()
            }
        )
        binding.recyclerView.adapter = adapter
        adapter.update(musicList)


        val musicListTwo = mutableListOf<MusicTwo>()
        musicListTwo.addAll(generateRandomMusicObjectTwo())

        val adapterTwo = MusicAdapterTwo(
            navigateToMusicPlayer = {
                navigateToMusicPlayerActivity()
            }
        )
        binding.recyclerViewTwo.adapter = adapterTwo
        adapterTwo.update(musicListTwo)
    }
    private fun navigateToMusicPlayerActivity(){
        val intent =Intent (this, MusicPlayerActivity::class.java)
        startActivity(intent)
    }
    private fun generateRandomMusicObject():List<Music>{
        val musicList= mutableListOf<Music>()
        val titles= listOf<String>(
            "Thinking Of Grid",
            "Shadows Of Ocean",
            "Not Lines",
            "Soul Of Boots",
            "Awesome Home"
        )
        val authors = listOf<String>(
            "Beach House",
            "Dua Lipa",
            "Adele",
            "Kid Cudi",
            "Daft Punk"
        )
        val postersUrl= listOf<String>(
                "https://townsquare.media/site/81/files/2022/06/attachment-RS20969_GettyImages-958364166-scr.jpg?w=1200&h=0&zc=1&s=0&a=t&q=89",
        "https://www.thegigcartel.com/images/117Small.jpg",
        "https://avatars.mds.yandex.net/i?id=53b721e6eba9f3d991b3624a4f7b69c628bbe640-9146551-images-thumbs&n=13",
        "https://avatars.mds.yandex.net/i?id=005dd8ac75e13cae6619e9f363758cc41485592a-8497423-images-thumbs&n=13"

        )

        for (i in 0..10){
            musicList.add(
                Music(
                    title = titles.random(),
                    author = authors.random(),
                    posterUrl = postersUrl.random()
                )
            )
        }
        return musicList
    }
    private fun generateRandomMusicObjectTwo(): Collection<MusicTwo> {
        val musicListTwo= mutableListOf<MusicTwo>()
        val titles= listOf<String>(
            "Thinking Of Grid",
            "Shadows Of Ocean",
            "Not Lines",
            "Soul Of Boots",
            "Awesome Home"
        )
        val authors = listOf<String>(
            "Beach House",
            "Dua Lipa",
            "Adele",
            "Kid Cudi",
            "Daft Punk"
        )
        val postersUrl= listOf<String>(
            "https://townsquare.media/site/81/files/2022/06/attachment-RS20969_GettyImages-958364166-scr.jpg?w=1200&h=0&zc=1&s=0&a=t&q=89",
            "https://www.thegigcartel.com/images/117Small.jpg",
            "https://avatars.mds.yandex.net/i?id=53b721e6eba9f3d991b3624a4f7b69c628bbe640-9146551-images-thumbs&n=13",
            "https://avatars.mds.yandex.net/i?id=005dd8ac75e13cae6619e9f363758cc41485592a-8497423-images-thumbs&n=13"
        )

        for (i in 0..10){
            musicListTwo.add(
                MusicTwo(
                    title = titles.random(),
                    author = authors.random(),
                    posterUrl = postersUrl.random()
                )
            )
        }
        return musicListTwo
    }

}