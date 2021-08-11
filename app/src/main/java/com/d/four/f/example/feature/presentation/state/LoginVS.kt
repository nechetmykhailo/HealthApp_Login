package com.d.four.f.example.feature.presentation.state

import com.d.four.f.example.feature.domain.model.LoginUser

sealed class LoginVS {
        class Entities(val entities: LoginUser):LoginVS()
        class Error(val message:String?):LoginVS()
        class ShowLoader(val showLoader:Boolean):LoginVS()
    }