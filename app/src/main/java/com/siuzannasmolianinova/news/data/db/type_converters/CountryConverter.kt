package com.siuzannasmolianinova.news.data.db.type_converters

import androidx.room.TypeConverter
import com.siuzannasmolianinova.news.data.Country
import timber.log.Timber

class CountryConverter {
    @TypeConverter
    fun convertCountryToString(country: Country) = country.name.apply {
        Timber.d(country.name)
    }

    @TypeConverter
    fun convertStringToCountry(countryString: String) = Country.values().find {
        it.country == countryString
    } ?: Country.RU
        .apply {
            Timber.d("country = $this")
        }
}
