package com.yjn.sunnyweather.android

import android.app.Application

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
        const val CAIYUN_TOKEN = "BNBRvBveaD2VfHVI"; //彩云天气申请到的令牌值
    }

    override fun onCreate() {
        super.onCreate()

    }
}