package uz.ziyaprof.zametki.repository

import kotlinx.coroutines.flow.Flow
import uz.ziyaprof.zametki.dao.TasksDao
import uz.ziyaprof.zametki.model.TaskModel

class TasksRepository(private val tasksDao: TasksDao) {

    fun getAllTasks(): Flow<List<TaskModel>> {
        return tasksDao.getAllTasks()
    }

    fun getTaskByID(id: Int): Flow<TaskModel> {
        return tasksDao.getTaskById(id)
    }

    suspend fun insert(task: TaskModel) {
        tasksDao.insert(task)
    }

    suspend fun updateTask(task: TaskModel) {
        tasksDao.updateTask(task)
    }

    suspend fun deleteAll(task: TaskModel) {
        tasksDao.deleteAll()
    }

    suspend fun deleteTaskById(id: Int) {
        tasksDao.deleteTaskById(id)
    }
}