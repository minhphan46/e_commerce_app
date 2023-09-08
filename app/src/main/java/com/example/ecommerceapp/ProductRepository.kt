package com.example.ecommerceapp

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import java.lang.Thread.sleep

class ProductRepository {

    suspend fun getProductList() : List<ProductCardViewState> {
        return withContext(Dispatchers.IO) {
            sleep(2000)
            (1..3).map {
                ProductCardViewState(
                    "Playstation $it",
                    "This is a nice console! Check it out",
                    "200 US$",
                    "https://dictionary.cambridge.org/vi/images/thumb/book_noun_001_01679.jpg?version=5.0.333"
                )
            }
        }
    }
}