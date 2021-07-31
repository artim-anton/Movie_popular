package com.artimanton.wiki.retrofit

import retrofit2.Call
import retrofit2.http.*

interface RetrofitServices {
        @GET("character/2")
        fun getCharacter(): Call<Character>
}