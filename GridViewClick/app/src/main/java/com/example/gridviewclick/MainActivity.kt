package com.example.gridviewclick

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.GridView

class MainActivity : AppCompatActivity()
{
    //declaring the GridView variable
    lateinit var foodGridView: GridView
    //declaring a list containing images of food items
    private var foodImages = intArrayOf(R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground
    )
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //binding the gridView with our created variable
        foodGridView = findViewById(R.id.food_grid_view)
        //creating the object of the FoodAdapter
        val foodAdapter = ItemAdapter(this@MainActivity, foodImages)
        //setting the adapter to our GridView
        foodGridView.adapter = foodAdapter
        //Adding On Click Event Listener to each of the food item pic
        foodGridView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            //creating intent object to sub activity
            val myIntent = Intent(this@MainActivity, SubActivity::class.java)
            //passing the image resource id to the sub activity
            myIntent.putExtra("imageInt", foodImages[position])
            myIntent.putExtra("productId", "" + position)
            //starting the sub activity
            startActivity(myIntent)
        }
    }
}