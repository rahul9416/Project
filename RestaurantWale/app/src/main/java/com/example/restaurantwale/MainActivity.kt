package com.example.restaurantwale

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var restaurant: Restaurant = Restaurant( "Hotel Picaddly", "Janak Puri, Delhi", "4.3")
        var restaurantlist: ArrayList<Restaurant> = ArrayList()
        restaurantlist.add(Restaurant("Sagar Ratna", "Janak Puri, Delhi", "Speciality: Masal Dosa", "Cost for two : Rs.700"))
        restaurantlist.add(Restaurant("Barbeque-Nation", "Connought Place, Delhi", "Speciality: Barbeque","Cost for two : Rs.1800"))
        restaurantlist.add(Restaurant("Berco's", "Dwarka Sec - 8, Delhi", "Speciality: Chilli-Potato", "Cost for two : Rs.950"))
        restaurantlist.add(Restaurant("Dominos", "Najafgarh, Delhi", "Speciality: Cheese Burst Pizza","Cost for two : Rs.500"))
        restaurantlist.add(Restaurant("Hotel Picadly", "Janak Puri, Delhi", "Speciality: Lasagnia","Cost for two : Rs.3500"))
        restaurantlist.add(Restaurant("Moti-Mahal Deluxe", "Najafgarh, Delhi", "Speciality: Shahi Paneer","Cost for two : Rs.500"))
        restaurantlist.add(Restaurant("Kingodom of Momos", "Najafgarh, Delhi", "Speciality: Gravy Momos","Cost for two : Rs.250"))
        restaurantlist.add(Restaurant("Giani", "Uttam  Nagar, Delhi", "Speciality: Blueberry Icecream","Cost for two : Rs.150"))
        restaurantlist.add(Restaurant("Farzi Cafe", "Cyber Hub, Delhi", "Speciality: Chocolate Dome","Cost for two : Rs.2750"))

        val recyclerAdapter: Recycler_adapter = Recycler_adapter(restaurantlist)
        recycler_view.adapter = recyclerAdapter
    }
}