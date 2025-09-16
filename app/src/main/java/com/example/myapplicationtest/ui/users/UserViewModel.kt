package com.example.myapplicationtest.ui.users

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplicationtest.data.User
import com.example.myapplicationtest.data.UserRepository
import com.example.myapplicationtest.network.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

// UI State sealed interface for more robust state handling
sealed interface UserUiState {
    data object Loading : UserUiState
    data class Success(val users: List<User>) : UserUiState
    data class Error(val message: String) : UserUiState
}

class UserViewModel : ViewModel() {

    private val userRepository = UserRepository(RetrofitInstance.api)

    private val _uiState = MutableStateFlow<UserUiState>(UserUiState.Loading)
    val uiState: StateFlow<UserUiState> = _uiState.asStateFlow()

    init {
        fetchUsers()
    }

    private fun fetchUsers() {
        viewModelScope.launch {
            _uiState.value = UserUiState.Loading
            try {
                val users = userRepository.getUsers()
                _uiState.value = UserUiState.Success(users)
            } catch (e: Exception) {
                _uiState.value = UserUiState.Error("Failed to load data: ${e.message}")
            }
        }
    }
}