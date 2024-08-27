package uz.ziyaprof.zametki.screens.notes

import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.androbeck.virtualbank.utils.extentions.gone
import uz.androbeck.virtualbank.utils.extentions.visible
import uz.ziyaprof.zametki.R
import uz.ziyaprof.zametki.base.BaseFragment
import uz.ziyaprof.zametki.databinding.FragmentNotesBinding

class NotesFragment : BaseFragment(R.layout.fragment_notes) {
    private val binding by viewBinding(FragmentNotesBinding::bind)
    override fun setup() {

    }

    override fun clicks() = with(binding){
        searchEt.setOnFocusChangeListener { _, _ ->
            textCancel.visible()
        }
        textCancel.setOnClickListener{
            searchEt.text.clear()
            searchEt.clearFocus()
            textCancel.gone()
        }
        addNoteCard.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_notePreviewFragment)
        }
        categoryCard.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_categoryFragment)
        }
    }
}