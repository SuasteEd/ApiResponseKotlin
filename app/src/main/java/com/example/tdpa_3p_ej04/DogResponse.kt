package com.example.tdpa_3p_ej04

import com.google.gson.annotations.SerializedName

data class DogResponse (
    @SerializedName("status") var status:String,
    @SerializedName("message") var images:List<String>
)

