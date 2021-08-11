package com.d.four.f.example.feature.data.datasourse

import com.d.four.f.example.core.network.BaseApiClient
import com.d.four.f.example.feature.domain.reposirory.LoginApi


object LoginApiClient : BaseApiClient<LoginApi>(LoginApi::class.java)
