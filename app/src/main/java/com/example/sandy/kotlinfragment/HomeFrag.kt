package com.example.sandy.kotlinfragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.homefrag.view.*

class HomeFrag:Fragment()
{

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        var v=inflater.inflate(R.layout.homefrag,container,false)

        v.last.setOnClickListener({

            var fManager=activity!!.supportFragmentManager

            var tx =fManager.beginTransaction()
            tx.add(R.id.frag,SkyblueFrag())
            tx.addToBackStack(null)
            tx.commit()


        })


        return v
    }


}