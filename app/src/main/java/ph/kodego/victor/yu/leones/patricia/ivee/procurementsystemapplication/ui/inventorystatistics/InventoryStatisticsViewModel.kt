package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.inventorystatistics

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class InventoryStatisticsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Inventory Statistics Fragment"
    }
    val text: LiveData<String> = _text
}