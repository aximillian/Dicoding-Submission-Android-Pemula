package com.example.idn

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Prov(
    val name: String,
    val kota: String,
    val tahun: Int,
    val description: String,
    val populasi: String,
    val lWilayah: String,
    val lHutan: String,
    val photo: Int
) : Parcelable


