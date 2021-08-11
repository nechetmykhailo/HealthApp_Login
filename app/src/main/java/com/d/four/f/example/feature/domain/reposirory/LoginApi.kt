package com.d.four.f.example.feature.domain.reposirory

import com.d.four.f.example.feature.domain.model.LoginUser
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface LoginApi {
    @POST("api/register/")
    @FormUrlEncoded
    suspend fun getToken(
        @Field("username") username: String,
        @Field("password") password: String
    ): LoginUser
}