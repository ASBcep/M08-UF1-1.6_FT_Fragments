package asb.m08.Fragments

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class SecondFragment: Fragment()
{
    lateinit var myView: View

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        //assigno el layout al fragment
        myView = inflater.inflate(R.layout.fragment_second, container, false)




        return myView
    }


    fun updateData(color: Int)
    {
        val lblSelected = myView.findViewById<TextView>(R.id.LblSelectedColor)
        lblSelected.setBackgroundColor(color)

        when(color)
        {
            Color.RED -> lblSelected.text = "RED"
            Color.GREEN -> lblSelected.text = "GREEN"
            Color.BLUE -> lblSelected.text = "BLUE"
        }
    }
}