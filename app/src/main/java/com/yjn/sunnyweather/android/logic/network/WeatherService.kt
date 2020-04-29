package com.yjn.sunnyweather.android.logic.network

import com.yjn.sunnyweather.android.SunnyWeatherApplication
import com.yjn.sunnyweather.android.logic.model.DailyResponse
import com.yjn.sunnyweather.android.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 实时天气，每日天气 获取接口
 * </pre>
 */
interface WeatherService {
    @GET("v2.5/${SunnyWeatherApplication.CAIYUN_TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(
        @Path("lng") lng: String,
        @Path("lat") lat: String
    ): Call<RealtimeResponse>

    @GET("v2.5/${SunnyWeatherApplication.CAIYUN_TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String):
            Call<DailyResponse>

}