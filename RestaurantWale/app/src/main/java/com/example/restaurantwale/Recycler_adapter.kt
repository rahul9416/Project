package com.example.restaurantwale

import android.content.Context
import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.example.restaurantwale.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.restaurant_item.view.*

class Recycler_adapter(var RestaurantList: ArrayList<Restaurant>, ) :

        RecyclerView.Adapter<Recycler_adapter.ViewHolder>() {


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


        init{
            itemView.setOnClickListener {
                val snack : String = "Item " + adapterPosition + " clicked"
                Snackbar.make(itemView, snack, Snackbar.LENGTH_SHORT).show()
            }
        }

        fun bind(restaurant: Restaurant){
            itemView.text1.text= restaurant.text1.toString()
            itemView.text2.text= restaurant.text2.toString()
            itemView.text4.text= restaurant.text4.toString()
            itemView.text5.text= restaurant.text5.toString()


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.restaurant_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val restaurant = RestaurantList[position]
        holder.bind(restaurant)
    }

    override fun getItemCount(): Int = RestaurantList.size


}