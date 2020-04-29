package com.yjn.sunnyweather.android.logic.network

import com.yjn.sunnyweather.android.SunnyWeatherApplication
import com.yjn.sunnyweather.android.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 城市网络数据获取接口
 * </pre>
 */
interface PlaceService {
    @GET("v2/place?token=${SunnyWeatherApplication.CAIYUN_TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}