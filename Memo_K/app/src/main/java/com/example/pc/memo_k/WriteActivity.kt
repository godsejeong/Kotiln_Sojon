package com.example.pc.memo_k

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vicpin.krealmextensions.queryLast
import com.vicpin.krealmextensions.save
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_write.*
import org.jetbrains.anko.sdk25.coroutines.onClick
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by pc on 2017-12-21.
 */
class WriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_write)
        Realm.init(this)    // realm 사용을 위한 초기화
        saveBtn.onClick {
            // 저장 버튼에 이벤트 추가
            //  현재 시각을 아래 포맷으로 받는다
            val dayTime = SimpleDateFormat("yyyy년 MM월 dd일 hh:mm:ss")
            val date = dayTime.format(Date(System.currentTimeMillis()))
            var id = Memo().queryLast()?.id.let{
                if(it==null) 0 else it+1
            }
            Memo(id,titleEdt.text.toString(),textEdt.text.toString(),date).save()
            setResult(Activity.RESULT_OK)
            finish()
        }
    }
}