package com.yjn.sunnyweather.android.ui.weather

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.yjn.sunnyweather.android.logic.Repository
import com.yjn.sunnyweather.android.logic.model.Location

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : ViewModel
 * </pre>
 */
class WeatherViewModel : ViewModel() {
    private val locationData = MutableLiveData<Location>()

    var locationLng = ""
    var locationLat = ""
    var placeName = ""

    val weatherLiveData = Transformations.switchMap(locationData) { location ->
        Repository.refreshWeather(
            location.lng, location.lat
        )
    }

    fun refreshWeather(lng: String, lat: String) {
        locationData.value = Location(lng, lat)
    }
}