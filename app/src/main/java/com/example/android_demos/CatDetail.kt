package com.example.android_demos

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class CatDetail : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cat_detail)

        // receive data from CustomAdapter
        val intent = intent
        val receivedCatBreed = intent.getStringExtra("cat_breed")
        val receivedCatOrigin = intent.getStringExtra("cat_origin")
        val receivedCatBodyType = intent.getStringExtra("cat_body_type")
        val imageId = intent.extras!!.getInt("cat_image")
        val cat_age = 4
        // get the ref for their view
        val catBreed = findViewById<TextView>(R.id.cat_breed)
        val catOrigin = findViewById<TextView>(R.id.cat_origin)
        val catBodyType = findViewById<TextView>(R.id.cat_body_type)
        val catAge = findViewById<TextView>(R.id.cat_age)
        val imageView = findViewById<ImageView>(R.id.image)
        val btn = findViewById<Button>(R.id.button)


        // hook them up
        imageView.setImageResource(imageId)
        catBreed.text = "Breed: ${receivedCatBreed}"
        catOrigin.text = "Origin: ${receivedCatOrigin}"
        catBodyType.text = "Body type: ${receivedCatBodyType}"
        catAge.text = "Age: ${cat_age}"

        btn.setOnClickListener {
            catAge.text = "Age: ${(0..10).random() }"
        }


    }
}