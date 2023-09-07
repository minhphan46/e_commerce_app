package com.example.ecommerceapp

sealed class ProductListViewState {
    object Loading : ProductListViewState()
    data class Content(val productsList: List<ProductCardViewState>) : ProductListViewState()
    object Error : ProductListViewState()
}