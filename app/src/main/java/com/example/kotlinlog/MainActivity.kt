package com.example.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Human = Human ( "佐藤",25,"将来")

        Human.say()
        Log.d("kotlintest", "私の名前は"+ Human.name + "です。")
        Log.d("kotlintest", "年は" + Human.age + "歳です。")

        Human.think()
        Log.d("kotlintest", "私は" + Human.hobby + "について考える。")



    }


}


