sealed class ScreenState {
    object Loading : ScreenState()
    data class Success(val data: String) : ScreenState()
}
