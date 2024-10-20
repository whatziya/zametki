package uz.ziyaprof.zametki.dao

import androidx.room.*
import kotlinx.coroutines.flow.Flow
import uz.ziyaprof.zametki.model.NotesModel
import uz.ziyaprof.zametki.utils.Constants

@Dao
interface NotesDao {
    @Query("SELECT * FROM ${Constants.FileName.NOTES_TABLE}")
    fun getAllNotes(): Flow<List<NotesModel>>

    @Query("SELECT * FROM ${Constants.FileName.NOTES_TABLE} WHERE id = :id")
    fun getNoteById(id: Int): Flow<NotesModel>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNote(note: NotesModel)

    @Update
    suspend fun updateNote(note: NotesModel)

    @Delete
    suspend fun deleteNote(note: NotesModel)

    @Query("DELETE FROM ${Constants.FileName.NOTES_TABLE} WHERE id = :id")
    suspend fun deleteNoteById(id: Int)
}
