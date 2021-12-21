package com.rakhafatih.figureku.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.rakhafatih.figureku.DetailActivity
import com.rakhafatih.figureku.data.Figures
import com.rakhafatih.figureku.databinding.RowItemFiguresBinding

class FigureAdapter(private val listFigureku: ArrayList<Figures>) :
    RecyclerView.Adapter<FigureAdapter.myViewHolder>() {

    inner class myViewHolder(val binding: RowItemFiguresBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = myViewHolder(
        RowItemFiguresBinding.inflate(LayoutInflater.from(parent.context), parent, false)

    )

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.binding.apply {
            with(listFigureku[position]) {
                tvNameFigures.text = listFigureku[position].name
                tvCategory.text = listFigureku[position].category
                tvPrice.text = listFigureku[position].price
                Glide.with(imgFigures.context).load(photo).into(imgFigures)
            }
        }
//        holder.itemView.setOnClickListener {
//            val intent = Intent(it.context, DetailActivity::class.java)
//            intent.putExtra(DetailActivity.DATA_FIGUREKU, listFigureku[position])
//            it.context.startActivity(intent)
//        }
    }

    override fun getItemCount(): Int = listFigureku.size
}