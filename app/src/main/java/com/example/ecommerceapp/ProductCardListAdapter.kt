package com.example.ecommerceapp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerceapp.databinding.ProductCardBinding

class ProductCardListAdapter : RecyclerView.Adapter<ProductCardListAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind() {
            val bind = ProductCardBinding.bind(itemView)
            bind.viewProductName.text = "Product 1"
            bind.viewProductDescription.text = "Description of product"
            bind.productPrice.text = "100US$"
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = View.inflate(parent.context, R.layout.product_card, null)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return 10
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind()
    }

}