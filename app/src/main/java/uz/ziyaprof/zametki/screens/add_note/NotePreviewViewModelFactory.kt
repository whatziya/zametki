package uz.ziyaprof.zametki.screens.add_note

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import uz.ziyaprof.zametki.repository.NotesRepository

class NotePreviewViewModelFactory(private val repository: NotesRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NotePreviewViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return NotePreviewViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
