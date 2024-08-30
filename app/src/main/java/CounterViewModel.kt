import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private val _count:MutableState<Int> = mutableStateOf(0)
    val count : MutableState<Int> get() = _count

    fun increment(){
        _count.value+= 1
    }
    fun decrement(){
        _count.value-= 1
    }

}