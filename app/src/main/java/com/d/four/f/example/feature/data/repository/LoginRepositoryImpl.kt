package com.d.four.f.example.feature.data.repository

import com.d.four.f.example.feature.domain.model.LoginUser
import com.d.four.f.example.feature.data.datasourse.LoginDataStore
import com.d.four.f.example.feature.domain.reposirory.LoginApi

class LoginRepositoryImpl (
    private val LoginDataStore: LoginDataStore
) : LoginApi {

    override suspend fun getToken(username: String, password: String): LoginUser = LoginDataStore.getTrends2(username, password)
}