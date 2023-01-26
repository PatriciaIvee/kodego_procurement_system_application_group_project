package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.purchaseorders

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
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentPurchaseOrdersBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.inventorymonitoring.InventoryMonitoringViewModel

class PurchaseOrdersFragment : Fragment() {

    private var _binding: FragmentPurchaseOrdersBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val purchaseOrdersViewModel =
            ViewModelProvider(this).get(PurchaseOrdersViewModel::class.java)

        _binding = FragmentPurchaseOrdersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.purchaseOrderTextView
        purchaseOrdersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }



}