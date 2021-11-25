package ru.vcru.feature.timeline.data.repository

interface TimeLineRepository {
    suspend fun fetchTimeLineList()
}


class TimeLineRepositoryImpl(/* private val service: ApiService */) : TimeLineRepository {

    override suspend fun fetchTimeLineList() {
        TODO("Not yet implemented")
    }
}