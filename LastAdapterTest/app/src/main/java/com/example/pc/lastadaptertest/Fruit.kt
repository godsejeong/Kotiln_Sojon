package com.example.pc.lastadaptertest

import android.databinding.BindingAdapter
import android.graphics.Color
import android.view.View

/**
 * Created by pc on 2017-12-19.
 */
class Fruit(var name:String, var color:Int){
 object CustomBindingadapter{
     @BindingAdapter("android:background")
     @JvmStatic
     fun setBackgroundCoor(layout: View?, colorCode:String){
         layout?.setBackgroundColor(Color.parseColor(colorCode))
         }
     }
 }
