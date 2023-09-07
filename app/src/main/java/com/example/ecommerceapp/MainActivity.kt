package com.example.ecommerceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ecommerceapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val adapter = ProductCardListAdapter();

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewProductList.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.viewProductList.adapter = adapter

        updateUI(ProductListViewState.Content((1..3).map {
            ProductCardViewState("Product $it", "Description of product", "100US$")
        }))
    }

    private fun updateUI(viewState: ProductListViewState) {
        when(viewState) {
            is ProductListViewState.Content -> {
                binding.loadingView.isVisible = false
                binding.errorView.isVisible = false
                adapter.setData(viewState.productsList)
            }
            is ProductListViewState.Loading -> {
                binding.viewProductList.isVisible = false
                binding.loadingView.isVisible = true
                binding.errorView.isVisible = false
            }
            is ProductListViewState.Error -> {
                binding.viewProductList.isVisible = false
                binding.loadingView.isVisible = false
                binding.errorView.isVisible = true
            }
        }
    }
}