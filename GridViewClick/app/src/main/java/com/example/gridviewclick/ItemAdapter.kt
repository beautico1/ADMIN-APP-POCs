package com.example.gridviewclick

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView

internal class ItemAdapter (
    private val context: Context,
    private val images: IntArray
) :
BaseAdapter() {

    private var layoutInflater: LayoutInflater? = null
    private lateinit var foodImageView: ImageView

    override fun getCount(): Int {
        //getting the count of the data items
        return images.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(
        position: Int,
        convertView: View?,
        parent: ViewGroup
    ): View? {
        //creating the view
        var foodView = convertView
        if (layoutInflater == null) {
            //creating a layout inflater
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            foodView = layoutInflater!!.inflate(R.layout.item_view, null)
        }
        //fetching each image view of the card
        foodImageView = foodView!!.findViewById(R.id.food_image_view)
        //setting the food pic in each image view
        foodImageView.setImageResource(images[position])
        return foodView

    }
}