package com.example.pc.lastadaptertest

import android.databinding.BindingAdapter
import android.graphics.Color
import android.view.View

/**
 * Created by pc on 2017-12-19.
 */
class User(var name:String, var email:String, var Color:String){
 object CustomBindingadapter{
     @BindingAdapter("android:background")
     @JvmStatic
     fun setBackgroundCoor(layout: View?, colorCode:String){
         layout?.setBackgroundColor(Color.parseColor(colorCode))
         }
     }
 }
