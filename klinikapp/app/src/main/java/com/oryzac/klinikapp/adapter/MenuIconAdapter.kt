package com.oryzaac.klinikapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.oryzac.klinikapp.R
import com.oryzac.klinikapp.model.ModelMenuIcon


class MenuIconAdapter (
    val itemMenuList : List<ModelMenuIcon>
) : RecyclerView.Adapter<MenuIconAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgMenuIcon: ImageView = itemView.findViewById(R.id.imgMenuIcon)
        var txtMenuIcon: TextView = itemView.findViewById(R.id.txtNamaIcon)
        var txtSpaceDoctors : TextView = itemView.findViewById(R.id.txtSpesDoctor)
        var txtReviewDoctors : TextView = itemView.findViewById(R.id.txtReviewDoctor)
        var txtJumlahRanting : TextView = itemView.findViewById(R.id.txtJumlahRanting)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_menu_home, parent, false)
        return MyViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemMenuList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = itemMenuList[position]
        holder.txtMenuIcon.text = currentItem.NamaMenu
        holder.imgMenuIcon.setImageResource(currentItem.IconMenu)
    }
}