package com.example.gridviewtwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    private lateinit var  photoAdapter: PhotoAdapter
    private var dataList = mutableListOf<DataModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //initiate the grid  view
        //in this case I make row grid in a row
        //if you want to change that change the number


        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(applicationContext,2)
        photoAdapter = PhotoAdapter(applicationContext)
        recyclerView.adapter = photoAdapter

        //add data
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))
        dataList.add(DataModel("Title","Desc",R.drawable.ic_launcher_foreground))

        photoAdapter.setDataList(dataList)





    }
}