package com.example.android_demos

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CatDetail : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_detail)


        val intent = intent
//        val text = intent.getStringExtra("letter").toString()
        val name = intent.getStringExtra("letter")
//        val image = intent.getStringExtra("image")
val imageId = intent.extras!!.getInt("image")
        val tv = findViewById<TextView>(R.id.image_description)
        val im = findViewById<ImageView>(R.id.image)
        im.setImageResource(imageId)
        tv.text = name

//        textt.text = "fsfsdfsd"
    }
}