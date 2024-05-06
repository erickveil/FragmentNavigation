package net.erickveil.fragmentnavigation.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import net.erickveil.fragmentnavigation.R

/**
 * A simple [Fragment] subclass.
 * Use the [Pink.newInstance] factory method to
 * create an instance of this fragment.
 */
class Pink : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pink, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<Button>(R.id.button_to_green).setOnClickListener {
            findNavController().navigate(R.id.action_pinkFragment_to_greenFragment)
        }

        view.findViewById<Button>(R.id.button_to_blue).setOnClickListener {
            findNavController().navigate(R.id.action_pinkFragment_to_blueFragment)
        }

        view.findViewById<Button>(R.id.button_back).setOnClickListener {
            findNavController().popBackStack()
        }

    }

}