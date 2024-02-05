package asb.m08.Fragments

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment

class MainFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View?
    {
        //obtenim el layout del fragment (unió kotlin - xml)
        var view = inflater.inflate(R.layout.fragment_main, container, false)

        var txtNumber = view.findViewById<EditText>(R.id.TxtData)
        var btnOk = view.findViewById<Button>(R.id.BtnOk)

        btnOk.setOnClickListener()
        {
            var numTxt = txtNumber.text.toString()
            if (numTxt != "")
            {
                var num = numTxt.toInt()
                var intent = Intent(activity, SecondActivity::class.java)
                intent.putExtra("number",num)
                startActivity(intent)
            }
        }
        return view
    }

}