package com.example.imageslider

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageSlider = findViewById<ImageSlider>(R.id.imageSlider)
        val imageList = ArrayList<SlideModel>()

        val image1 = SlideModel("https://d2kektcjb0ajja.cloudfront.net/images/posts/feature_images/000/000/072/large-1466557422-feature.jpg?1466557422", "OBLIVION")
        val image2 = SlideModel("https://www.teahub.io/photos/full/67-670663_hollywood-movie-poster-hd.jpg", "DRACULA")
        val image3 = SlideModel("https://c4.wallpaperflare.com/wallpaper/726/46/535/movies-hollywood-movies-wallpaper-preview.jpg", "THE MAZE RUNNER")
        val image4 = SlideModel("https://5.imimg.com/data5/BM/XS/SO/SELLER-30220222/hollywood-movies-wall-posters-500x500.jpg", "DOCTOR STRANGE")
        val image5 = SlideModel("https://swall.teahub.io/photos/small/25-250333_exists-horror-movie-data-src-horror-movie-background.jpg", "EXISTS")

        imageList.add(image1)
        imageList.add(image5)
        imageList.add(image2)
        imageList.add(image3)
        imageList.add(image4)

        imageSlider.setImageList(imageList, ScaleTypes.FIT)

        imageSlider.setItemClickListener(object : ItemClickListener {
            override fun onItemSelected(position : Int) {

                proceed("" + position)

            }
        })

    }

    fun proceed(name : String) {

        val intent = Intent(this, SampleProductPage::class.java)

        intent.putExtra("product", "" + name)

        startActivity(intent)

    }

}