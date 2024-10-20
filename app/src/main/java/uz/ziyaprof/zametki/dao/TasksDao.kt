package uz.ziyaprof.zametki.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.ziyaprof.zametki.model.TaskModel
import uz.ziyaprof.zametki.utils.Constants

@Dao
interface TasksDao {
    @Query("SELECT * FROM ${Constants.FileName.TASKS_TABLE}")
    fun getAllTasks(): Flow<List<TaskModel>>

    @Query("SELECT * FROM ${Constants.FileName.TASKS_TABLE} WHERE id = :id")
    fun getTaskById(id: Int): Flow<TaskModel>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(task: TaskModel)

    @Update
    suspend fun updateTask(task: TaskModel)

    @Query("DELETE FROM ${Constants.FileName.TASKS_TABLE}")
    suspend fun deleteAll()

    @Query("DELETE FROM ${Constants.FileName.TASKS_TABLE} WHERE id = :id")
    suspend fun deleteTaskById(id: Int)
}
