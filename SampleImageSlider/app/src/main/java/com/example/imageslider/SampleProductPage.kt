package com.example.imageslider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SampleProductPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sample_product_page)

        val bundle:Bundle? = intent.extras

        val index = bundle?.get("product")

        Toast.makeText(applicationContext, index.toString(), Toast.LENGTH_LONG).show()

    }
}