package me.natedorman.quickq.ui.main

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.button_fragment.*
import me.natedorman.quickq.R

class ButtonFragment : Fragment() {

    companion object {
        fun newInstance() = ButtonFragment()
    }

    private lateinit var viewModel: ButtonViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.button_fragment, container, false)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(ButtonViewModel::class.java)
        fab.setOnClickListener{onFabPressed()}
        // TODO: Use the ViewModel
    }

    fun onFabPressed(){
        viewModel.onFabPressed()
        message.text = getString(R.string.number_counter,viewModel.counter,"Peoples")
    }


}
