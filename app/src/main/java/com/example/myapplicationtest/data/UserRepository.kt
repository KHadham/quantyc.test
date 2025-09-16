package com.example.myapplicationtest.data

import com.example.myapplicationtest.network.ApiService

class UserRepository(private val apiService: ApiService) {
    // In a more complex app, this function could decide whether
    // to fetch from the network or a local database.
    suspend fun getUsers(): List<User> {
        return apiService.getUsers()
    }
}