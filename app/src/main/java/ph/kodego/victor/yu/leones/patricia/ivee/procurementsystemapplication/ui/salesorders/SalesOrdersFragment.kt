package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.salesorders

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.R
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentPurchaseOrdersBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentSalesOrdersBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.inventorymonitoring.InventoryMonitoringViewModel
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.purchaseorders.PurchaseOrdersViewModel

class SalesOrdersFragment : Fragment() {

    private var _binding: FragmentSalesOrdersBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val salesOrdersViewModel =
            ViewModelProvider(this).get(SalesOrdersViewModel::class.java)

        _binding = FragmentSalesOrdersBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.salesOrderTextView
        salesOrdersViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}