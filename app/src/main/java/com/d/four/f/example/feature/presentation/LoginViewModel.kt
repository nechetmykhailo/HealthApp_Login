package com.d.four.f.example.feature.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.d.four.f.example.core.interactor.Interactor
import com.d.four.f.example.core.platform.BaseViewModel
import com.d.four.f.example.core.utils.io
import com.d.four.f.example.core.utils.ui
import com.d.four.f.example.feature.domain.interactor.GetLoginInteractor
import com.d.four.f.example.feature.presentation.state.LoginVS
import kotlinx.coroutines.launch

class LoginViewModel(
    private val getPostsInteractor: GetLoginInteractor
) : BaseViewModel() {

    val viewState: LiveData<LoginVS> get() = mViewState
    private val mViewState = MutableLiveData<LoginVS>()



    fun getTokenUser(userName: String, password: String) {
        viewModelScope.launch {
            mViewState.value = LoginVS.ShowLoader(true)
            try {
                io {
                    mViewState.postValue(
                        LoginVS.Entities(
                            getPostsInteractor.execute(
                                userName,
                                password,
                                Interactor.None
                            )
                        )
                    )
                }
            } catch (e: Exception) {
                e.printStackTrace()
                ui { mViewState.value = LoginVS.Error(e.message) }
            }
            mViewState.value = LoginVS.ShowLoader(false)
        }
    }
}