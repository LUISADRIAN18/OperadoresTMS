package com.lagn.operadorestms.data.network

import okhttp3.ResponseBody
import retrofit2.http.GET

interface ApiClient {
    @GET("/")
    suspend fun getAll():ResponseBody

}