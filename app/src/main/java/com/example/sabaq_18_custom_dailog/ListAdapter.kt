package com.example.sabaq_18_custom_dailog

import android.accounts.AuthenticatorDescription
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val activity: MainActivity) : RecyclerView.Adapter<ListViewHolder>() {

    private var models: MutableList<User> = mutableListOf()

    fun setData(data: MutableList<User>){
        models = data
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val itemView: View = LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false)
        return ListViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return models.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.populateModel(models[position], itemCount, position, activity)
    }
}