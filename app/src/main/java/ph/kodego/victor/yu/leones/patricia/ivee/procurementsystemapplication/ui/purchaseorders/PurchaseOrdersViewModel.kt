package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.purchaseorders

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class PurchaseOrdersViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Purchase Orders Fragment"
    }
    val text: LiveData<String> = _text
}