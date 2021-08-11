package com.d.four.f.example.feature.data.datasourse

import com.d.four.f.example.feature.domain.model.LoginUser

class LoginDataStore {
    suspend fun getTrends2(username: String, password: String): LoginUser =
        LoginApiClient.getApiClient().getToken(username, password)
}