package com.blue.google_map

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.blue.domain.model.Common
import com.blue.domain.repo.CommonRepo
import kotlinx.coroutines.launch
import javax.inject.Inject

class CommonViewModel @Inject constructor(
    private val commonRepo: CommonRepo
): ViewModel() {
    init {
        insertTestData()
        insertTestData()
        insertTestData()
        insertTestData()

        viewModelScope.launch {
            getTestApi().collect {
                Log.e("TAG", "list : $it")
            }
        }
    }

    fun getTestApi() = commonRepo.getTestApi()
    fun insertTestData() {
        viewModelScope.launch {
            commonRepo.insertTestApi(Common(title = "test"))
        }
    }
}