package asb.m08.Fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(), MyOnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainFragment = supportFragmentManager.findFragmentById(R.id.FrgFirst) as MainFragment
        mainFragment.setListener(this)
    }

    override fun onClick(num: Int) {
        val secondFragment = supportFragmentManager.findFragmentById(R.id.FrgSecond) as SecondFragment?
        if(secondFragment == null)//mòbil en comptes de tablet
        {
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("number",num)
            startActivity(intent)
        } else //tablet en comptes de mòbil
        {
            secondFragment.setNumber(num)
        }

    }

}