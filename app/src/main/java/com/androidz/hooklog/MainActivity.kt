package com.androidz.hooklog

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.androidz.mylibrary.Lib1Feat
import com.androidz.mylibrary2.Lib2Feat
import com.androidz.wanandroid.utility.WeLog

class MainActivity : AppCompatActivity() {

    companion object {
        init {

//            LogUtils.baseLog = object : BaseLog {
//                override fun v(tag: String?, msg: String) {
//
//                }
//
//                override fun v(tag: String?, msg: String?, tr: Throwable?) {
//
//                }
//
//                override fun d(tag: String?, msg: String) {
//
//                }
//
//                override fun d(tag: String?, msg: String?, tr: Throwable?) {
//
//                }
//
//                override fun i(tag: String?, msg: String) {
//
//                }
//
//                override fun i(tag: String?, msg: String?, tr: Throwable?) {
//
//                }
//
//                override fun w(tag: String?, msg: String) {
//
//                }
//
//                override fun w(tag: String?, msg: String?, tr: Throwable?) {
//
//                }
//
//                override fun w(tag: String?, tr: Throwable?) {
//
//                }
//
//                override fun e(tag: String?, msg: String) {
//
//                }
//
//                override fun e(tag: String?, msg: String?, tr: Throwable?) {
//
//                }
//
//            }
        }
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WeLog.initLog(this)
        setContentView(R.layout.activity_main)
        LogUtils.v("xxa", "LogUtils")
        if (LogUtils.isLoggable("xxb", Log.DEBUG)) {
            LogUtils.v("xxb", "xxb 1")
        }
        //系统root,或者user_debug系统
        if (Log.isLoggable("xxa", Log.DEBUG)) {
            LogUtils.d("xxa", "isLoggable")
        }

        //打开调试模式
        LogUtils.setLoggable("xxb", Log.DEBUG)
        if (LogUtils.isLoggable("xxb", Log.DEBUG)) {
            LogUtils.v("xxb", "xxb 2")
        }
        LogUtils.setLoggable("xxb", LogUtils.NO_DEUBG)
        if (LogUtils.isLoggable("xxb", Log.DEBUG)) {
            LogUtils.v("xxb", "xxc 3")
        }
        Main.main(arrayOf("1", "2", "3"))

        Lib1Feat.initialize()
        Lib2Feat.initialize()
    }
}