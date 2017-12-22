package com.example.pc.kotlin_tutoral

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.sdk25.coroutines.textChangedListener
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //---------------------------
//
//        var sss : String = ""
//        var nullable_sss : String? = ""//?를 쓰면 null이 들어갈수 있음
//        //sss = null -> ?를 붙이지 않아 에러가 남
//        nullable_sss = null
//
//        if(sss == null){}
//
//        if(nullable_sss == null){
//            //null일 경우
//            //nullpointe
//        }else{
//            //null이 아닐 경우
//        }
//
//        nullable_sss?.let{
//            var copy = nullable_sss
//            //nullable_sss가 null이 아닐 경우 함수 안 내용이 실행됨
//        }
//        //위 아래 서로 동일한 코드
//        if(nullable_sss != null){
//            var copy = nullable_sss
//        }
//
//        var copy = nullable_sss?: "asdf"//null이 아닌경우에 adsf란 값을 입력함
//
//        fun sum(x : Int,y : Int = 0) = x+y
//
//
//        var i : Int = 0
//        var ni : Int? = null
//        sum(i)
//        sum(ni?:0)
//        sum(ni!!)
        //기본형
        mainTv.setOnClickListener(object : View.OnClickListener {
            override fun onClick(p0: View?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }
        })
        //Kotlin
        mainTv.setOnClickListener {

        }
        //anko
        mainTv.onClick {
            //def
            Toast.makeText(applicationContext,"asdf",Toast.LENGTH_SHORT).show()

            //kotlin
            toast("asdf")
        }
//        //def
//        mainEdt.addTextChangedListener(object : TextWatcher {
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//
//            override fun afterTextChanged(p0: Editable?) {
//                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//            }
//        }
            //anko
        mainEdt.textChangedListener {
            afterTextChanged {
                Log.e("adsf",it.toString())
            }
        }

        mainTv.onClick{
            startActivity<Main2Activity>()
        }

    }
}
