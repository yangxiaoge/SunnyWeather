package com.yjn.sunnyweather.android.logic.model

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 将Realtime与Daily封装起来
 * </pre>
 */
data class Weather(val realtime:RealtimeResponse.RealTime,val daily: DailyResponse.Daily)