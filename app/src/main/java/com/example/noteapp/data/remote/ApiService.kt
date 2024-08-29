package com.example.noteapp.data.remote

import com.example.noteapp.data.remote.dto.LoginRequest
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("login")
    suspend fun login(@Body request: LoginRequest): Response<LoginResponse>

    @POST("signup")
    suspend fun signUp(@Body request: SignUpRequest): Response<SignUpResponse>

    @GET("tasks")
    suspend fun getTasks(@Header("Authorization") token: String): Response<List<Task>>

}