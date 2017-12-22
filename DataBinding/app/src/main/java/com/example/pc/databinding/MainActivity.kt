package com.example.pc.databinding

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.pc.databinding.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = DataBindingUtil.setContentView<ActivityMainBinding>(
                this,R.layout.activity_main)
        binding.setVariable(BR.user,User("나재민","dbdnpxm@naver.com","#ffffff"))

        main_btn1.setOnClickListener{

            binding.setVariable(BR.user,User("버튼1","dbdnpxm@naver.com","#ff0000"))

        }

        main_btn2.setOnClickListener{

            binding.setVariable(BR.user,User("버튼2","dbdnpxm@naver.com","#00ff00"))

        }

        main_btn3.setOnClickListener{

            binding.setVariable(BR.user,User("버튼3","dbdnpxm@naver.com","#000000"))
        }
    }
}
