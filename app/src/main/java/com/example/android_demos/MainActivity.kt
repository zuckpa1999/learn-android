package com.example.android_demos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android_demos.model.ItemsViewModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        // standard
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // getting the recyclerview by its id
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()


        data.add(ItemsViewModel("Toyger",R.drawable.toyger,"United States","Moderate"))
        data.add(ItemsViewModel("Ukrainian Levkoy",R.drawable.ukrainian_levkoy,"Ukraine","Moderate"))
        data.add(ItemsViewModel("Somali",R.drawable.somali,"United States, Canada","Cobby"))
        data.add(ItemsViewModel("Persian",R.drawable.persian,"Greater Iran","Cobby"))
        data.add(ItemsViewModel("Russian Blue",R.drawable.russian_blue,"Russia","Moderate, Oriental"))
        data.add(ItemsViewModel("Savannah",R.drawable.savannah,"United States","Large"))
        data.add(ItemsViewModel("Siamese",R.drawable.siamese,"Thailand","Oriental"))
        data.add(ItemsViewModel("Siberian",R.drawable.siberian,"Russia, Ukraine","Semi-cobby"))



        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter



    }


}