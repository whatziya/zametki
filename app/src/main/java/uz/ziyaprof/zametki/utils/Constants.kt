package uz.ziyaprof.zametki.utils

object Constants {
    object FileName {
        const val SHARED_PREFS = "zametki"
        const val DATABASE_NAME = "zametki_database"
    }

    object Localization {
        const val LANGUAGE = "language"
        const val UZBEK = "uz"
        const val ENGLISH = "en"
        const val RUSSIAN = "ru"
    }

    object Firebase {
        const val FIREBASE_REAL_TIME_DATABASE_URL =
            "https://virtual-bank-20dcc-default-rtdb.firebaseio.com/"
        const val FIREBASE_NOTIFICATION = "notifications"
        const val CHANNEL_ID = "uz.androbeck.virtualbank.notifications"
        const val DEFAULT_CHANNEL_NAME = "Default Channel"
    }
}