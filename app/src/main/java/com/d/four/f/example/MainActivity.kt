package com.d.four.f.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.d.four.f.example.feature.presentation.LoginViewModel
import com.d.four.f.example.feature.presentation.state.LoginVS
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        observeViewModel()
        viewModel.getTokenUser("Vasya", "Vetrov")

    }

    private fun observeViewModel(){
        viewModel.viewState.observe(this@MainActivity, {
            when (it) {
                is LoginVS.Entities -> {
                    Log.e("Entities","${it.entities.token}")
                }
                is LoginVS.ShowLoader ->{
                    if(it.showLoader){
                        Log.e("showLoader","${it.showLoader}")
                    }else{
                        Log.e("showLoader","${it.showLoader}")
                    }
                }
                is LoginVS.Error -> {
                    Toast.makeText(this, it.message, Toast.LENGTH_SHORT).show()
                }
            }

        })
    }

}