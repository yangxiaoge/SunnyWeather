package com.yjn.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName
import java.util.*

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 未来几天天气模型
{
"status": "ok",
"result": {
"daily": {
"temperature": [
{
"date": "2020-04-29T00:00+08:00",
"max": 27.16,
"min": 19,
"avg": 23.29
},
{
"date": "2020-04-30T00:00+08:00",
"max": 26,
"min": 21,
"avg": 23.58
}
],
"skycon": [
{
"date": "2020-04-29T00:00+08:00",
"value": "CLEAR_DAY"
}
],
"life_index": {
"ultraviolet": [
{
"date": "2020-04-29T00:00+08:00",
"index": "1",
"desc": "最弱"
},
{
"date": "2020-04-30T00:00+08:00",
"index": "4",
"desc": "强"
}
],
"dressing": [
{
"date": "2020-04-29T00:00+08:00",
"index": "4",
"desc": "温暖"
},
{
"date": "2020-04-30T00:00+08:00",
"index": "4",
"desc": "温暖"
}
],
"comfort": [
{
"date": "2020-04-29T00:00+08:00",
"index": "4",
"desc": "温暖"
},
{
"date": "2020-04-30T00:00+08:00",
"index": "4",
"desc": "温暖"
}
],
"coldRisk": [
{
"date": "2020-04-29T00:00+08:00",
"index": "4",
"desc": "极易发"
},
{
"date": "2020-04-30T00:00+08:00",
"index": "3",
"desc": "易发"
}
]
}
}
}
}
 * </pre>
 */
data class DailyResponse(val status: String, val result: Result) {
    data class Result(val daily: Daily)

    data class Daily(
        val temperature: List<Temperature>,
        val skycon: List<Skycon>,
        @SerializedName("life_index") val life_index: LifeIndex
    )

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(
        val coldRisk: List<LifeDescription>,
        val carWashing: List<LifeDescription>,
        val ultraviolet: List<LifeDescription>,
        val dressing: List<LifeDescription>
    )

    data class LifeDescription(val desc: String)
}
