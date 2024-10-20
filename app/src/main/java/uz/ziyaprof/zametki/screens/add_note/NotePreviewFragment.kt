package uz.ziyaprof.zametki.screens.add_note

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.ziyaprof.zametki.R
import uz.ziyaprof.zametki.ZametkiApplication
import uz.ziyaprof.zametki.base.BaseFragment
import uz.ziyaprof.zametki.databinding.FragmentNotesBinding
import uz.ziyaprof.zametki.model.NotesModel
import uz.ziyaprof.zametki.repository.NotesRepository

class NotePreviewFragment : BaseFragment(R.layout.fragment_note_preview) {
    private val binding by viewBinding(FragmentNotesBinding::bind)
    private val repository by lazy {
        NotesRepository(ZametkiApplication.getDatabase().notesDao())
    }
    private val viewModel: NotePreviewViewModel by viewModels {
        NotePreviewViewModelFactory(repository)
    }
    override fun setup() {
    }
}