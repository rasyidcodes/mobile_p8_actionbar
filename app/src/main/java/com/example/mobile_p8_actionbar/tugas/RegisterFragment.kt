package com.example.mobile_p8_actionbar.tugas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.mobile_p8_actionbar.HomeFragment
import com.example.mobile_p8_actionbar.R
import com.example.mobile_p8_actionbar.databinding.FragmentLoginBinding
import com.example.mobile_p8_actionbar.databinding.FragmentRegisterBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RegisterFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RegisterFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private lateinit var binding: FragmentRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment and initialize the binding
        binding = FragmentRegisterBinding.inflate(inflater, container, false)

        with(binding) {
            btRegister.setOnClickListener {
                if (etRegisterEmail.text.toString() == "" ||  etRegisterPassword.text.toString() == "" || etRegisterPhone.text.toString() == "" || etRegisterUser.text.toString() == ""){
                    Toast.makeText(requireContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show()
                }else{
                    val intentToHome = Intent(requireContext(), HomePageActivity::class.java)
                    startActivity(intentToHome)
                }

            }
        }

        return binding.root
    }

//    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
//        super.onViewCreated(view, savedInstanceState)
//
////        with(binding) {
////            btRegister.setOnClickListener {
////                val isUserAuthenticated = true
////
////                if (isUserAuthenticated) {
////                    val intentToHome = Intent(requireContext(), HomeFragment::class.java)
////                    startActivity(intentToHome)
////                } else {
////                    Toast.makeText(requireContext(), "Authentication Failed!", Toast.LENGTH_SHORT).show()
////                }
////            }
////        }
//    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment SignInFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            RegisterFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}