package com.yjn.sunnyweather.android

import android.app.Application
import android.content.Context

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : SunnyWeatherApplication
 * </pre>
 */
class SunnyWeatherApplication : Application() {
    companion object {
        const val CAIYUN_TOKEN = "TAkhjf8d1nlSlspN"; //彩云天气申请到的令牌值

        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}