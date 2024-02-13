package asb.m08.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class MainFragment: Fragment()
{
    private lateinit var listener: MyOnClickListener
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        //obtenim el layout del fragment (unió kotlin - xml)
        val view = inflater.inflate(R.layout.fragment_main, container, false)

        val txtNumber = view.findViewById<EditText>(R.id.TxtData)
        val btnOk = view.findViewById<Button>(R.id.BtnOk)

        btnOk.setOnClickListener()
        {
            val numTxt = txtNumber.text.toString()
            if (numTxt != "")
            {
                val num = numTxt.toInt()
                listener.onClick(num)

                /*var intent = Intent(activity, SecondActivity::class.java)
                intent.putExtra("number",num)
                startActivity(intent)*/
            }
        }
        return view
    }
    fun setListener(listen: MyOnClickListener?)
    {
        if (listen != null)
        {
            listener = listen
        }
    }
}