package uz.ziyaprof.zametki.preferences

import android.content.SharedPreferences

class PreferencesProvider(private val preferences: SharedPreferences) {

    var pinCode: String by preferences.string()

    fun clear() {
        preferences.edit().clear().apply()
    }
}
