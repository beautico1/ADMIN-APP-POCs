package com.example.gridviewclick

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast

class SubActivity : AppCompatActivity()
{
    //declaring imageView variable
    lateinit var foodFullImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
        //fetching the data from the MainActivity Intent
        val mIntent = intent
        val food_value = mIntent.getIntExtra("imageInt", 0)
        //binding the image view with the variable
        foodFullImage = findViewById(R.id.food_full_image)
        //setting up the image on the image view using its resource id
        foodFullImage.setImageResource(food_value)

        val productId = mIntent.getStringExtra("productId")

        Toast.makeText(applicationContext, productId, Toast.LENGTH_LONG).show()

    }
}