package uz.ziyaprof.zametki.repository

import kotlinx.coroutines.flow.Flow
import uz.ziyaprof.zametki.dao.NotesDao
import uz.ziyaprof.zametki.model.NotesModel

class NotesRepository(private val notesDao: NotesDao) {

    fun getAllNotes(): Flow<List<NotesModel>> {
        return notesDao.getAllNotes()
    }

    fun getNoteById(id: Int): Flow<NotesModel> {
        return notesDao.getNoteById(id)
    }

    suspend fun insertNote(note: NotesModel) {
        notesDao.insertNote(note)
    }

    suspend fun updateNote(note: NotesModel) {
        notesDao.updateNote(note)
    }

    suspend fun deleteNote(note: NotesModel) {
        notesDao.deleteNote(note)
    }

    suspend fun deleteNoteById(id: Int) {
        notesDao.deleteNoteById(id)
    }
}
