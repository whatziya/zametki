package uz.ziyaprof.zametki.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import uz.ziyaprof.zametki.utils.Constants

@Entity(tableName = Constants.FileName.NOTES_TABLE)
data class NotesModel(
    @PrimaryKey(autoGenerate = true) val id: Int? = 0,
    @ColumnInfo(name = "last_edited") val lastEdited: Long? = null,
    @ColumnInfo(name = "header") val header: String? = null,
    @ColumnInfo(name = "date") val date: Long? = null,
    @ColumnInfo(name = "symbol_count") val symbolCount: Int? = null,
    @ColumnInfo(name = "text") val text: String? = null,
    @ColumnInfo(name = "mention_date") val dueDate: Long? = null,
)
