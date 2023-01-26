package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.R
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentAddPictureBinding
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentInventoryStockBinding

class InventoryStockFragment : Fragment() {

    private var _binding: FragmentInventoryStockBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentInventoryStockBinding.inflate(inflater,container,false)
        return binding.root
    }

}