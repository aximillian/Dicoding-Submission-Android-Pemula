package com.example.idn

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_KOTA = "extra_kota"
        const val EXTRA_TAHUN = "extra_tahun"
        const val EXTRA_POPULASI = "extra_populasi"
        const val EXTRA_LWILAYAH = "extra_lWilayah"
        const val EXTRA_LHUTAN = "extra_lHutan"
        const val EXTRA_DESCRIPTION = "extra_description"
        const val EXTRA_IMAGE = "extra_image"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Detail Provinsi"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val tvProvName: TextView = findViewById(R.id.tv_prov_name)
        val tvProvKota: TextView = findViewById(R.id.tv_prov_kota)
        val tvProvTahun: TextView = findViewById(R.id.tv_prov_tahun)
        val tvProvPopulasi: TextView = findViewById(R.id.tv_prov_populasi)
        val tvProvLWilayah: TextView = findViewById(R.id.tv_prov_lWilayah)
        val tvProvLHutan: TextView = findViewById(R.id.tv_prov_lHutan)
        val tvProvDescription: TextView = findViewById(R.id.tv_prov_description)
        val imgProv: ImageView = findViewById(R.id.img_prov)

        val favButton: ImageView = findViewById(R.id.fav_button)
        var fav = false

        val provNama = intent.getStringExtra(EXTRA_NAME)
        val provKota = intent.getStringExtra(EXTRA_KOTA)
        val provTahun = intent.getIntExtra(EXTRA_TAHUN, 0).toString()
        val provPopulasi = intent.getStringExtra(EXTRA_POPULASI)
        val provLWilayah = intent.getStringExtra(EXTRA_LWILAYAH)
        val provLHutan = intent.getStringExtra(EXTRA_LHUTAN)
        val provDescription = intent.getStringExtra(EXTRA_DESCRIPTION)
        val provImage = intent.getIntExtra(EXTRA_IMAGE, R.drawable.aceh)
        imgProv.setImageResource(provImage)

        tvProvName.text = provNama
        tvProvKota.text = provKota
        tvProvTahun.text = provTahun
        tvProvPopulasi.text = provPopulasi
        tvProvLWilayah.text = provLWilayah
        tvProvLHutan.text = provLHutan
        tvProvDescription.text = provDescription
        imgProv.setImageResource(provImage)

        favButton.setOnClickListener {
            fav = if (!fav) {
                Toast.makeText(this, "Follow", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.vector_favorite)
                true
            } else {
                Toast.makeText(this, "Unfollow", Toast.LENGTH_SHORT).show()
                favButton.setImageResource(R.drawable.vector_favorite_border)
                false
            }
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
