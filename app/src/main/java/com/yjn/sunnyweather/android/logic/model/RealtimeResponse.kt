package com.yjn.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 实时天气数据模型
{
"status": "ok",
"result": {
"realtime": {
"temperature": 27.16,
"skycon": "PARTLY_CLOUDY_DAY",
"air_quality": {
"aqi": {
"chn": 13
}
}
}
}
}
 * </pre>
 */
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: RealTime)
    data class RealTime(
        val skycon: String,
        val temperature: Float,
        @SerializedName("air_quality") val airQuality: AirQuality
    )
    data class AirQuality(val aqi: AQI)
    data class AQI(val chn: Float)
}

