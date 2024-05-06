package net.erickveil.fragmentnavigation.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import net.erickveil.fragmentnavigation.R

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Blue.newInstance] factory method to
 * create an instance of this fragment.
 */
class Blue : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_blue, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_to_pink).setOnClickListener {
            findNavController().navigate(R.id.action_blueFragment_to_pinkFragment)
        }

        view.findViewById<Button>(R.id.blue_to_green).setOnClickListener {
            findNavController().navigate(R.id.action_blueFragment_to_greenFragment)
        }

        view.findViewById<Button>(R.id.blue_back).setOnClickListener {
            findNavController().popBackStack()
        }
    }

}