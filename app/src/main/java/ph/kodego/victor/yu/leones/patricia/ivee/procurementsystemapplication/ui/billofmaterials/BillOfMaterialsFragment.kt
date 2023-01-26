package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.billofmaterials

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.R
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentBillOfMaterialsBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentSalesOrdersBinding

class BillOfMaterialsFragment : Fragment() {

    private var _binding: FragmentBillOfMaterialsBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val billOfMaterialsViewModel =
            ViewModelProvider(this).get(BillOfMaterialsViewModel::class.java)

        _binding = FragmentBillOfMaterialsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.billOfMaterialsTextView
        billOfMaterialsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}