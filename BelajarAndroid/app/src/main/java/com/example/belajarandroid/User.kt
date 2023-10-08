package com.example.belajarandroid

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val Username:String,
    val Password:String
):Parcelable
