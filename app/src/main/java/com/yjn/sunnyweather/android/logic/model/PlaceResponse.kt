package com.yjn.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 城市数据模型
{
"status": "ok",
"query": "北京",
"places": [
{
"id": "6e8861ded5d03c5fdfe7a56526af08ecb433a575",
"location": {
"lat": 39.9041999,
"lng": 116.4073963
},
"place_id": "g-6e8861ded5d03c5fdfe7a56526af08ecb433a575",
"name": "北京市",
"formatted_address": "中国北京市"
},
{
"id": "B000A83C36",
"name": "北京站",
"formatted_address": "中国 北京市 东城区 毛家湾胡同甲13号",
"location": {
"lat": 39.902779,
"lng": 116.427694
},
"place_id": "a-B000A83C36"
}
]
}
 * </pre>
 */

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(
    val name: String, val location: Location,
    @SerializedName("formatted_address") val address: String
)

data class Location(val lng: String, val lat: String)
