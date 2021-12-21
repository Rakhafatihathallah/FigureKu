package com.rakhafatih.figureku.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Figures (
    val name: String,
    val category: String,
    val description: String,
    val photo: String,
    val price: String,
    ): Parcelable