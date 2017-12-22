package com.example.pc.lastadaptertest

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import com.example.pc.lastadaptertest.databinding.ItemFruitBinding
import com.example.pc.lastadaptertest.databinding.ItemUserBinding
import com.github.nitrico.lastadapter.LastAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_fruit.*
import kotlinx.android.synthetic.main.item_fruit.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var uList = arrayListOf<Any>(
                User("1번사람", "111@mail.com", "#f76363"),
                Fruit("사과", Color.RED),
                User("2번사람", "222@mail.com", "#ffbf00"),
                Fruit("수박", Color.GREEN),
                User("3번사람", "333@mail.com", "#a5d322"),
                Fruit("바나나", Color.YELLOW),
                User("4번사람", "444@mail.com", "#33b5e5"),
                Fruit("블루베리", Color.BLUE),
                User("5번사람", "555@mail.com", "#7e828e"),
                User("6번사람", "666@mail.com", "#e8cc35")
        )

        var lm = LinearLayoutManager(this).apply {
            orientation = LinearLayoutManager.HORIZONTAL
        }//orientation = LinearLayoutManger.HoRIZONTAL(가로),VERTICAL(세로)


        mainRecycler.layoutManager = GridLayoutManager(this, 2)
        //spanCount는 칸을 뜻함

        mainRecycler.layoutManager = LinearLayoutManager(this)
        val into = LastAdapter(uList, BR.item)
                .map<User, ItemUserBinding>(R.layout.item_user) {
                    onClick {
                        var positon = it.adapterPosition
                        var user = it.binding.item

                        uList.removeAt(positon)
                        mainRecycler.adapter.notifyItemRemoved(positon)//누르면 삭제가 됨
                        //notifyItemChanged()//그 아이템만 적용시킴
                        // notifyDataSetChanged()//전체를 적용시킴
                    }//눌렀을때 동작

                    onBind { }//View가 한번 생성이 될때
                    onLongClick { }//길게 눌렀을떄

                }
                .map<Fruit,ItemFruitBinding>(R.layout.item_fruit) {
                    onClick {
//                        var fruit = it.binding.item
//                        it.binding.itemFruitBg.setBackgroundColor(fruit.color)
//                        it.binding.itemFruitName.setTextColor(Color.WHITE)

                        it.binding.run {
                            item?.let { fruit ->
                                itemFruitBg.setBackgroundColor(fruit.color)
                                itemFruitName.setTextColor(Color.WHITE)
                                }
                            }
                        }
                    }
                .into(mainRecycler)
            }
        }
