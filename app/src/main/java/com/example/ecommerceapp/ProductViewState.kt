package com.example.ecommerceapp

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ProductViewState : RecyclerView.Adapter<ProductCardListAdapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val bind = ProductCardBinding.bind(itemView)
        }
    }

}