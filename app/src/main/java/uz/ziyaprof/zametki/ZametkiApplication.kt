package uz.ziyaprof.zametki

import android.app.Application

class ZametkiApplication : Application() {
    private lateinit var database: ZametkiDatabase

    override fun onCreate() {
        super.onCreate()
        database = ZametkiDatabase.getDatabase(this)
    }

    companion object {
        private lateinit var instance: ZametkiApplication

        fun getDatabase(): ZametkiDatabase {
            return instance.database
        }

        fun getInstance(): ZametkiApplication {
            return instance
        }
    }

    init {
        instance = this
    }
}
