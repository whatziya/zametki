package uz.ziyaprof.zametki.screens.tasks

import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import uz.androbeck.virtualbank.utils.extentions.gone
import uz.androbeck.virtualbank.utils.extentions.visible
import uz.ziyaprof.zametki.R
import uz.ziyaprof.zametki.base.BaseFragment
import uz.ziyaprof.zametki.databinding.FragmentTasksBinding

class TasksFragment : BaseFragment(R.layout.fragment_tasks) {
    private val binding by viewBinding(FragmentTasksBinding::bind)
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

        addTaskCard.setOnClickListener {
            //should show add task dialog
        }


    }
}