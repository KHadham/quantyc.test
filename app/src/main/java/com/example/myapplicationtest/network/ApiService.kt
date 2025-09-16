package com.example.myapplicationtest.network

import com.example.myapplicationtest.data.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}
