package com.example.myapplication.FishingContent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.myapplication.FishingContent.model.Poster
import com.example.myapplication.databinding.ActivityFishingContentPosterBinding

class FishingContentPoster : AppCompatActivity() {
    private lateinit var binding : ActivityFishingContentPosterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFishingContentPosterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data = intent.getSerializableExtra("posterimg") as Poster
        Glide.with(this@FishingContentPoster)
            .load(data.ps)
            .into(binding.ps)
    }
}