package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adapter = ProductCardListAdapter();

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root)

        binding.viewProductList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.viewProductList.adapter = adapter
    }
}