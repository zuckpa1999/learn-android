package com.example.android_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_demos.model.ItemsViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()





        // This loop will create 20 Views containing
        // the image with the count of view
//        for (i in 1..20) {
//            data.add(ItemsViewModel("dfasdsa", R.drawable.ic_baseline_folder_24))
//        }


        data.add(ItemsViewModel("Toyger",R.drawable.toyger))
        data.add(ItemsViewModel("Ukrainian Levkoy",R.drawable.ukrainian_levkoy))
        data.add(ItemsViewModel("Somali",R.drawable.somali))
        data.add(ItemsViewModel("Persian",R.drawable.persian))
        data.add(ItemsViewModel("Russian Blue",R.drawable.russian_blue))
        data.add(ItemsViewModel("Savannah",R.drawable.savannah))
        data.add(ItemsViewModel("Siamese",R.drawable.siamese))
        data.add(ItemsViewModel("Siberian",R.drawable.siberian))



        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter
    }
}