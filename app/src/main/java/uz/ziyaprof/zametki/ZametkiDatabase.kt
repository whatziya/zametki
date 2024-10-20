package uz.ziyaprof.zametki

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import uz.ziyaprof.zametki.dao.NotesDao
import uz.ziyaprof.zametki.dao.TasksDao
import uz.ziyaprof.zametki.model.NotesModel
import uz.ziyaprof.zametki.model.TaskModel
import androidx.room.Room
import uz.ziyaprof.zametki.utils.Constants

@Database(entities = [NotesModel::class, TaskModel::class] , version = 1, exportSchema = false)
abstract class ZametkiDatabase : RoomDatabase() {

    abstract fun notesDao() : NotesDao
    abstract fun tasksDao() : TasksDao

    companion object{
        @Volatile
        private var INSTANCE : ZametkiDatabase? = null

        fun getDatabase(context : Context) : ZametkiDatabase{
            return INSTANCE ?: synchronized(this){
                val instance =Room.databaseBuilder(
                    context.applicationContext,
                    ZametkiDatabase::class.java,
                    Constants.FileName.DATABASE_NAME
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}