package com.example.brandgridview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var mAdapter: RecyclerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2);

        val item = ArrayList<User>()

        item.add(User("One"))
        item.add(User("Two"))
        item.add(User("Three"))
        item.add(User("Four"))
        item.add(User("Five"))
        item.add(User("Six"))
        item.add(User("Seven"))
        item.add(User("Eight"))
        item.add(User("Nine"))
        item.add(User("Ten"))
        item.add(User("Eleven"))
        item.add(User("Twelve"))
        item.add(User("Thirteen"))
        item.add(User("Fourteen"))
        item.add(User("Fifteen"))
        item.add(User("Sixteen"))

        mAdapter = RecyclerViewAdapter(item)
        recyclerView.adapter = mAdapter

    }
}