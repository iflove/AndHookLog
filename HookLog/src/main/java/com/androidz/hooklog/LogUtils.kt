package com.androidz.hooklog

import android.util.Log

/**
 *
 * Created by rentianlong on 2020/8/18
 */
class LogUtils {

    companion object {
        @JvmStatic
        var baseLog: BaseLog = RawLog()

        @JvmStatic
        fun v(tag: String?, msg: String) {
            baseLog.v(tag, msg)
        }

        @JvmStatic
        fun v(tag: String?, msg: String?, tr: Throwable?) {
            baseLog.v(tag, msg, tr)
        }

        @JvmStatic
        fun d(tag: String?, msg: String) {
            baseLog.d(tag, msg)
        }

        @JvmStatic
        fun d(tag: String?, msg: String?, tr: Throwable?) {
            baseLog.d(tag, msg, tr)
        }

        @JvmStatic
        fun i(tag: String?, msg: String) {
            baseLog.i(tag, msg)
        }

        @JvmStatic
        fun i(tag: String?, msg: String?, tr: Throwable?) {
            baseLog.i(tag, msg, tr)
        }

        @JvmStatic
        fun w(tag: String?, msg: String) {
            baseLog.w(tag, msg)
        }

        @JvmStatic
        fun w(tag: String?, msg: String?, tr: Throwable?) {
            baseLog.w(tag, msg, tr)
        }

        @JvmStatic
        fun w(tag: String?, tr: Throwable?) {
            baseLog.w(tag, tr)
        }

        @JvmStatic
        fun e(tag: String?, msg: String) {
            baseLog.e(tag, msg)
        }

        @JvmStatic
        fun e(tag: String?, msg: String?, tr: Throwable?) {
            baseLog.e(tag, msg, tr)
        }
    }

    private class RawLog : BaseLog {
        override fun v(tag: String?, msg: String) {
            Log.v(tag, msg)
        }

        override fun v(tag: String?, msg: String?, tr: Throwable?) {
            Log.v(tag, msg, tr)
        }

        override fun d(tag: String?, msg: String) {
            Log.d(tag, msg)
        }

        override fun d(tag: String?, msg: String?, tr: Throwable?) {
            Log.d(tag, msg, tr)
        }

        override fun i(tag: String?, msg: String) {
            Log.i(tag, msg)
        }

        override fun i(tag: String?, msg: String?, tr: Throwable?) {
        }

        override fun w(tag: String?, msg: String) {
        }

        override fun w(tag: String?, msg: String?, tr: Throwable?) {
        }

        override fun w(tag: String?, tr: Throwable?) {
        }

        override fun e(tag: String?, msg: String) {
        }

        override fun e(tag: String?, msg: String?, tr: Throwable?) {
        }
    }

}

interface BaseLog {
    fun v(tag: String?, msg: String)

    fun v(tag: String?, msg: String?, tr: Throwable?)

    fun d(tag: String?, msg: String)

    fun d(tag: String?, msg: String?, tr: Throwable?)

    fun i(tag: String?, msg: String)

    fun i(tag: String?, msg: String?, tr: Throwable?)

    fun w(tag: String?, msg: String)

    fun w(tag: String?, msg: String?, tr: Throwable?)

    fun w(tag: String?, tr: Throwable?)

    fun e(tag: String?, msg: String)

    fun e(tag: String?, msg: String?, tr: Throwable?)
}