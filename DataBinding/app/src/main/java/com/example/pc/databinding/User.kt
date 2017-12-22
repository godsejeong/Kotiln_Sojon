package com.example.pc.databinding

import android.databinding.BindingAdapter
import android.graphics.Color
import android.widget.TextView

/**
 * Created by pc on 2017-12-18.
 */
class User(var name:String,var email:String,var count:String){
    object CustomBundingAdapter{
        @BindingAdapter("android:background")
        @JvmStatic
        fun setBackgroundColor(layout: TextView?,colorCode: String){
            layout?.setBackgroundColor(Color.parseColor(colorCode))
            //#dd9999 이런 코트를 컬러갑을 변환

        }//fun 이름(적용될 텍스트,변수타입){
         //들어갈 내용
         //}
    }
//var를 붙여야함
}