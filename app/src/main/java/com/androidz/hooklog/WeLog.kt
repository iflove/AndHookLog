package com.androidz.wanandroid.utility

import android.content.Context
import android.os.Environment
import com.androidz.hooklog.BaseLog
import com.androidz.hooklog.BuildConfig
import com.androidz.hooklog.LogUtils
import com.tencent.mars.xlog.Log
import com.tencent.mars.xlog.Xlog

/**
 *
 * Created by rentianlong on 2020/6/29
 */
object WeLog {
    init {
        System.loadLibrary("c++_shared")
        System.loadLibrary("marsxlog")
    }

    fun initLog(context: Context) {
        val sd = Environment.getExternalStorageDirectory().absolutePath
        val logPath = sd + "marsxlog"
        val cachePath = context.filesDir.absolutePath + "/xlog"
        if (BuildConfig.DEBUG) {
            val xLogConfig = Xlog.XLogConfig()
            xLogConfig.level = Xlog.LEVEL_DEBUG
            xLogConfig.cachedir = cachePath
            xLogConfig.logdir = logPath
            xLogConfig.nameprefix = "MarsSample"
            Xlog.appenderOpen(xLogConfig)
            Xlog.setConsoleLogOpen(true)

        } else {
//            Xlog.appenderOpen(
//                Xlog.LEVEL_INFO,
//                Xlog.AppednerModeAsync,
//                cachePath,
//                logPath,
//                "MarsSample",
//                0,
//                ""
//            )
            Xlog.setConsoleLogOpen(false)
        }

        Log.setLogImp(Xlog())
        LogUtils.baseLog = object : BaseLog {
            override fun v(tag: String?, msg: String) {
                Log.v(tag, msg)
            }

            override fun v(tag: String?, msg: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun d(tag: String?, msg: String) {
                Log.d(tag, msg)
            }

            override fun d(tag: String?, msg: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun i(tag: String?, msg: String) {
                Log.i(tag, msg)
            }

            override fun i(tag: String?, msg: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun w(tag: String?, msg: String) {
                TODO("Not yet implemented")
            }

            override fun w(tag: String?, msg: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun w(tag: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

            override fun e(tag: String?, msg: String) {
                Log.e(tag, msg)
            }

            override fun e(tag: String?, msg: String?, tr: Throwable?) {
                TODO("Not yet implemented")
            }

        }

    }

    fun close() {
        Log.appenderClose()
    }
}