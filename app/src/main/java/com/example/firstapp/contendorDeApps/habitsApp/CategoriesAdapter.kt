package com.example.firstapp.contendorDeApps.habitsApp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firstapp.R

class CategoriesAdapter(private val categories: List<TaskCategory>) :
    RecyclerView.Adapter<CategoriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesViewHolder {
        // crea el contenedor y vista de cada producto
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_task_categories, parent, false)
        return CategoriesViewHolder(view)
    }

    override fun onBindViewHolder(holder: CategoriesViewHolder, position: Int) {
        // pasa la cantidad y posicion del producto al onCreateViewHolder
        holder.render(categories[position])
    }

    override fun getItemCount(): Int {
        // devuelve la cantidad de la lista "categories"
        return categories.size
    }
}