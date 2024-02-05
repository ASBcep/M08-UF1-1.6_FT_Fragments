package asb.m08.Fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //rebo int de l'intent que obre l'activity
        var num = intent.getIntExtra("number", 0)
        var manager = supportFragmentManager
        var fragment = manager.findFragmentById(R.id.FrgSecond) as SecondFragment
        fragment.setNumber(num)
    }
}