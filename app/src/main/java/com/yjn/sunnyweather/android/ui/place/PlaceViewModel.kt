package com.yjn.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.yjn.sunnyweather.android.logic.Repository
import com.yjn.sunnyweather.android.logic.model.Place

/**
 * <pre>
 *     author: Bruce_Yang
 *     email : yangjianan@seuic.com
 *     time  : 2020/4/29
 *     desc  : ViewModel:逻辑层与UI层的桥梁
 * </pre>
 */
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()
    val placeList = ArrayList<Place>()

    //switchMap观察searchLiveData是否发生变化
    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    //改变searchLiveData
    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)
    fun getSavedPlace() = Repository.getSavedPlace()
    fun isPlaceSaved() = Repository.isPlaceSaved()
}