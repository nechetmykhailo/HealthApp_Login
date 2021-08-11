package com.d.four.f.example.di

import com.d.four.f.example.feature.data.datasourse.LoginDataStore
import com.d.four.f.example.feature.data.repository.LoginRepositoryImpl
import com.d.four.f.example.feature.domain.interactor.GetLoginInteractor
import com.d.four.f.example.feature.domain.reposirory.LoginApi
import com.d.four.f.example.feature.presentation.LoginViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

private val postModule = module {

    //region ViewModel
    viewModel {
        LoginViewModel(get())
    }
    //region Interactor
    single {
        GetLoginInteractor(
            get()
        )
    }
    //region Repository
    single<LoginApi> {
        LoginRepositoryImpl(get())
    }
    single {
        LoginDataStore()
    }
}

val modulesArr = listOf(postModule)
