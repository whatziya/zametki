package uz.ziyaprof.zametki.screens.add_note

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import uz.ziyaprof.zametki.model.NotesModel
import uz.ziyaprof.zametki.repository.NotesRepository

class NotePreviewViewModel(private val repository: NotesRepository) : ViewModel() {
    private val _notes = MutableLiveData<List<NotesModel>>()
    val notes: MutableLiveData<List<NotesModel>> = _notes

    fun addNote(note: NotesModel) = viewModelScope.launch {
        repository.insertNote(note)
    }
}