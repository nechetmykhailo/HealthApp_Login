package com.d.four.f.example.core.interactor

interface Interactor<in Params, out Type> {
    suspend fun execute(username: String, password: String, params: Params): Type

    object None
}