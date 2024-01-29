package asb.m08.Fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class FirstFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        //assigno el layout al fragment
        var view = inflater.inflate(R.layout.fragment_first, container, false)

        var lblRed = view.findViewById<TextView>(R.id.BtnRed)
        var lblBlue = view.findViewById<TextView>(R.id.BtnBlue)
        var lblGreen = view.findViewById<TextView>(R.id.BtnGreen)

        lblRed.setOnClickListener()
        {
            sendData(Color.RED)
        }
        lblBlue.setOnClickListener()
        {
            sendData(Color.BLUE)
        }
        lblGreen.setOnClickListener()
        {
            sendData(Color.GREEN)
        }


        return view
    }

    fun sendData(color: Int) {
        //referència al segon fragment
        var second = activity?.supportFragmentManager?.findFragmentById(R.id.FrgSecond) as SecondFragment

        if (second != null)
        {
            second.updateData(color)
        }
    }
}