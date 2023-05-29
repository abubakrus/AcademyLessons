package com.example.academylessans.music

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.academylessans.R
import com.example.academylessans.databinding.ItemMusicTwoBinding

class MusicAdapterTwo(
    val navigateToMusicPlayer:()->Unit,
) :RecyclerView.Adapter<MusicAdapterTwo.MusicTwoViewHolder>(){
    private val musicListTwo = mutableListOf<MusicTwo>()
    fun update(newMusicList: List<MusicTwo>){
        musicListTwo.clear()
        musicListTwo.addAll(newMusicList)
        notifyDataSetChanged()
    }
    inner class MusicTwoViewHolder(
        private val binding: ItemMusicTwoBinding
    ):RecyclerView.ViewHolder(binding.root){
        fun bindMusic(music: MusicTwo){
            binding.titleTextView.text = music.title
            binding.authotTextView.text = music.author
            Glide.with(binding.root)
                .load(music.posterUrl)
                .into(binding.imageView3)
            binding.root.setOnClickListener{
                navigateToMusicPlayer()
            }
        }
    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): MusicTwoViewHolder {
        val binding =ItemMusicTwoBinding.bind(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_music_two,
                parent,
                false
            )
        )
        val viewHolder = MusicTwoViewHolder(binding)
        return viewHolder
    }
    override fun getItemCount(): Int = musicListTwo.size
    override fun onBindViewHolder(holder: MusicTwoViewHolder, position: Int) {
        holder.bindMusic(musicListTwo[position])
    }
}