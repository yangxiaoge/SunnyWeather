package com.yjn.sunnyweather.android.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.yjn.sunnyweather.android.SunnyWeatherApplication
import com.yjn.sunnyweather.android.logic.model.Place

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : 城市数据DAO
 * </pre>
 */
object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place =
        sharedPreferences().getString("place", "")
            .let { Gson().fromJson(it, Place::class.java) }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = SunnyWeatherApplication.context.getSharedPreferences(
        "sunny_weather",
        Context.MODE_PRIVATE
    )
}