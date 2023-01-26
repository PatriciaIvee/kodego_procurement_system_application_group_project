package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.inventorystatistics

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.R
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentInventoryMonitoringBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentInventoryStatisticsBinding

class InventoryStatisticsFragment : Fragment() {

    private var _binding: FragmentInventoryStatisticsBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val inventoryStatisticsViewModel =
            ViewModelProvider(this).get(InventoryStatisticsViewModel::class.java)

        _binding = FragmentInventoryStatisticsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.inventoryStatisticsTextView
        inventoryStatisticsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}