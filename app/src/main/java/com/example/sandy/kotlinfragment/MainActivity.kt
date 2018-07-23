package com.example.sandy.kotlinfragment

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var fManager=supportFragmentManager

        var tx =fManager.beginTransaction()
        tx.add(R.id.frag,HomeFrag())
        tx.addToBackStack(null)
        tx.commit()

        homebtn.setOnClickListener{

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,HomeFrag())
            tx.addToBackStack(null)
            tx.commit()
        }

        purplebtn.setOnClickListener{

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,PurpleFrag())
            tx.commit()

        }

        redbtn.setOnClickListener{

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,RedFrag())
            tx.commit()
        }

        skybtn.setOnClickListener {

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,SkyblueFrag())
            tx.commit()
        }

        yellowbtn.setOnClickListener {

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,YellowFrag())
            tx.commit()
        }

        bluebtn.setOnClickListener{

            var tx =fManager.beginTransaction()
            tx.replace(R.id.frag,BlueFrag())
            tx.commit()

        }


    }
}
