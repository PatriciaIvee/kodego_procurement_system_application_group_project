package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.salesorders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SalesOrdersViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Sales Orders Fragment"
    }
    val text: LiveData<String> = _text
}