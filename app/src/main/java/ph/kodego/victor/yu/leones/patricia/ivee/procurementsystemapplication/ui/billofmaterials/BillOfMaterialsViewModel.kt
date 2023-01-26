package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.billofmaterials

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BillOfMaterialsViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Bill of Materials Fragment"
    }
    val text: LiveData<String> = _text
}