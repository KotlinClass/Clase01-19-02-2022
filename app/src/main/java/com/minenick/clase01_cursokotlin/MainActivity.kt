package com.minenick.clase01_cursokotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.minenick.clase01_cursokotlin.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.get().load("https://www.smashbros.com/images/og/pikachu.jpg").into(binding.ivFoto)

    }
}