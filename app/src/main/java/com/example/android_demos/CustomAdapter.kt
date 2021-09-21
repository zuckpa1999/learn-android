package com.example.android_demos

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android_demos.model.ItemsViewModel
import android.content.Intent
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import java.lang.Override as Override1


class CustomAdapter(private val list: List<ItemsViewModel>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.iv_cat)
        val textView: TextView = itemView.findViewById(R.id.tv_cat)
    }
    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design .xml view
        // used to hold list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_design,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int = list.size
    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val ItemsViewModel = list[position]
        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(ItemsViewModel.catImage)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = "Breed: "+ItemsViewModel.catBreed

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
             val intent =  Intent(context, CatDetail::class.java);
            intent.putExtra("letter", ItemsViewModel.catBreed)
            intent.putExtra("image",ItemsViewModel.catImage)
                context.startActivity(intent);

        }
    }

}