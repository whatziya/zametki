package uz.ziyaprof.zametki.screens.main

import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import by.kirich1409.viewbindingdelegate.viewBinding
import com.google.android.material.tabs.TabLayout
import uz.ziyaprof.zametki.R
import uz.ziyaprof.zametki.base.BaseFragment
import uz.ziyaprof.zametki.databinding.FragmentMainBinding

class MainFragment : BaseFragment(R.layout.fragment_main) {
    private val binding by viewBinding(FragmentMainBinding::bind)
    private lateinit var adapter: FragmentMainPageAdapter
    override fun setup() = with(binding){
        adapter = FragmentMainPageAdapter(childFragmentManager, lifecycle)
        viewPager.adapter = adapter
        setTabMargin()
        listeners()
    }

    override fun clicks() = with(binding) {
        btnSettings.setOnClickListener {
            findNavController().navigate(R.id.action_mainFragment_to_settingsFragment)
        }
    }

    private fun listeners() = with(binding){
        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                tab?.let {
                    viewPager.currentItem = it.position
                    it.icon = when (it.position) {
                        0 -> ContextCompat.getDrawable(requireContext(), R.drawable.notebook_filled)
                        1 -> ContextCompat.getDrawable(requireContext(), R.drawable.checkbox_filled)
                        else -> null
                    }
                }
            }

            override fun onTabUnselected(tab: TabLayout.Tab?) {
                tab?.icon = when (tab?.position) {
                    0 -> ContextCompat.getDrawable(requireContext(), R.drawable.notebook_outlined)
                    1 -> ContextCompat.getDrawable(requireContext(), R.drawable.checkbox_outlined)
                    else -> null
                }
            }

            override fun onTabReselected(tab: TabLayout.Tab?) {}
        })

        viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
            override fun onPageSelected(position: Int) {
                tabLayout.selectTab(tabLayout.getTabAt(position))
            }
        })
    }

    private fun setTabMargin() = with(binding) {
        for (i in 0 until tabLayout.tabCount) {
            val tab = (tabLayout.getChildAt(0) as ViewGroup).getChildAt(i)
            val layoutParams = tab.layoutParams as ViewGroup.MarginLayoutParams
            layoutParams.setMargins(60, 0, 60, 0)
            tab.requestLayout()
        }
    }
}