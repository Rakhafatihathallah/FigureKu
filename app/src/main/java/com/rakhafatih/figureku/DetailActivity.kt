package com.rakhafatih.figureku

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.rakhafatih.figureku.data.Figures
import com.rakhafatih.figureku.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

//    private lateinit var _binding: ActivityDetailBinding
//
//    companion object {
//        const val DATA_FIGUREKU = "data"
//    }
//
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_detail)
//
//        binding = ActivityDetailBinding.inflate(layoutInflater)
//        setContentView(binding.root)
//        setSupportActionBar(binding.toolbarDetail)
//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
//
//        val data = intent.getParcelableExtra<Figures>(DATA_FIGUREKU) as Figures
//
//        binding.apply {
//            Glide.with(applicationContext).load(data.photo).into(imgDetail)
//            tvNameDetail.text = data.name
//            tvDescription.text = data.description
//        }
//    }
//
//    override fun onSupportNavigateUp(): Boolean {
//        onBackPressed()
//        return super.onSupportNavigateUp()
//    }
}

