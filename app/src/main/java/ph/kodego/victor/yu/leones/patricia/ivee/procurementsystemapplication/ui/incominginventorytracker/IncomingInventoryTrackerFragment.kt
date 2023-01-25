package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.ui.incominginventorytracker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.FragmentIncomingInventoryTrackerBinding

class IncomingInventoryTrackerFragment : Fragment() {

    private var _binding: FragmentIncomingInventoryTrackerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val incomingInventoryTrackerViewModel =
            ViewModelProvider(this).get(IncomingInventoryTrackerViewModel::class.java)

        _binding = FragmentIncomingInventoryTrackerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textSlideshow
        incomingInventoryTrackerViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}