package ru.vcru.feature.timeline.data

import retrofit2.http.GET

interface ApiService {

    @GET("/timeline")
    suspend fun getTimeLineList()
}