package uz.ziyaprof.zametki.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.ziyaprof.zametki.utils.Constants

@Entity(tableName = Constants.FileName.TASKS_TABLE)
data class TaskModel(
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
    @ColumnInfo(name = "last_edited") val lastEdited: Long? = null,
    @ColumnInfo(name = "task") val task: String? = null,
    @ColumnInfo(name = "due_date") val dueDate: Long? = null,
    @ColumnInfo(name = "done") val done: Boolean? = null,
)
