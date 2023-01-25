package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.inventorymonitoring

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentInventoryMonitoringBinding

class InventoryMonitoringFragment : Fragment() {

    private var _binding: FragmentInventoryMonitoringBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inventoryMonitoringViewModel =
            ViewModelProvider(this).get(InventoryMonitoringViewModel::class.java)

        _binding = FragmentInventoryMonitoringBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textGallery
        inventoryMonitoringViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}