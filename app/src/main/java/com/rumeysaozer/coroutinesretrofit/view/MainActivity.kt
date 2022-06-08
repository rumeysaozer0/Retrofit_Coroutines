package com.rumeysaozer.coroutinesretrofit.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rumeysaozer.coroutinesretrofit.databinding.ActivityMainBinding
import com.rumeysaozer.coroutinesretrofit.service.PostAPIService
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private val postAPIService = PostAPIService()
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        GlobalScope.launch(Dispatchers.IO) {
            val response = postAPIService.api.getPost()
            if(response.isSuccessful){
                for(post in response.body()!!.posts ){
                    println(post.title)
                }

            }
        }

    }
}