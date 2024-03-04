package com.example.idn

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListProvAdapter(private val listProv: List<Prov>) : RecyclerView.Adapter<ListProvAdapter.ListViewHolder>() {
    private val list: List<Prov> = listProv

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_prov, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val prov = listProv[position]

        holder.picture.setImageResource(prov.photo)
        holder.name.text = prov.name
        holder.populasi.text = prov.populasi
        holder.description.text = prov.description

        holder.itemView.setOnClickListener {
            val passItem = Intent(holder.itemView.context, DetailActivity::class.java).apply {
                putExtra(DetailActivity.EXTRA_NAME, prov.name)
                putExtra(DetailActivity.EXTRA_KOTA, prov.kota)
                putExtra(DetailActivity.EXTRA_TAHUN, prov.tahun)
                putExtra(DetailActivity.EXTRA_POPULASI, prov.populasi)
                putExtra(DetailActivity.EXTRA_LWILAYAH, prov.lWilayah)
                putExtra(DetailActivity.EXTRA_LHUTAN, prov.lHutan)
                putExtra(DetailActivity.EXTRA_DESCRIPTION, prov.description)
                putExtra(DetailActivity.EXTRA_IMAGE, prov.photo)
            }
            holder.itemView.context.startActivity(passItem)
        }
    }

    override fun getItemCount(): Int {
        return listProv.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView = itemView.findViewById(R.id.tv_item_name)
        var populasi: TextView = itemView.findViewById(R.id.tv_item_populasi)
        var description: TextView = itemView.findViewById(R.id.tv_item_description)
        var picture: ImageView = itemView.findViewById(R.id.img_item_photo)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val prov = list[position]
                    val intent = Intent(itemView.context, DetailActivity::class.java).apply {
                        putExtra(DetailActivity.EXTRA_NAME, prov.name)
                        putExtra(DetailActivity.EXTRA_KOTA, prov.kota)
                        putExtra(DetailActivity.EXTRA_TAHUN, prov.tahun)
                        putExtra(DetailActivity.EXTRA_POPULASI, prov.populasi)
                        putExtra(DetailActivity.EXTRA_LWILAYAH, prov.lWilayah)
                        putExtra(DetailActivity.EXTRA_LHUTAN, prov.lHutan)
                        putExtra(DetailActivity.EXTRA_DESCRIPTION, prov.description)
                        putExtra(DetailActivity.EXTRA_IMAGE, prov.photo)
                    }
                    itemView.context.startActivity(intent)
                }
            }
        }
    }
}