package asb.m08.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment

class SecondFragment: Fragment()
{
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        //obtenim el layout del fragment (unió kotlin - xml)
        var view = inflater.inflate(R.layout.fragment_second, container, false)
        return view
    }
    fun setNumber(num: Int)
    {
        var lblText = view?.findViewById<TextView>(R.id.LblNum)
        lblText?.text = num.toString()
    }

}