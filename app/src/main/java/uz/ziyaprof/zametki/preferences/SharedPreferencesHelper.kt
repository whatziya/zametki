package uz.ziyaprof.zametki.preferences

import android.content.Context
import android.content.SharedPreferences
import uz.ziyaprof.zametki.utils.Constants

object SharedPreferencesHelper {
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(Constants.FileName.SHARED_PREFS, Context.MODE_PRIVATE)
    }
}

//class ExampleFragment : Fragment(R.layout.fragment_example) {
//
//    private lateinit var preferencesProvider: PreferencesProvider
//
//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
//        // Create PreferencesProvider by directly passing SharedPreferences
//        val sharedPreferences = SharedPreferencesUtils.provideSharedPreferences(requireContext())
//        preferencesProvider = PreferencesProvider(sharedPreferences)
//
//        // Example usage
//        val token = preferencesProvider.accessToken
//        preferencesProvider.accessToken = "newToken"
//    } way to utilize this
//}


