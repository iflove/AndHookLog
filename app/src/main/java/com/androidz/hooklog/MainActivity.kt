package com.androidz.hooklog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        LogUtils.v("xxa", "LogUtils")
        Main.main(arrayOf("1", "2", "3"))
    }
}