package com.example.dalleralpha1_0_0.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.dalleralpha1_0_0.MenuActivity
import com.example.dalleralpha1_0_0.R


class HomeFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment製作出一個layout
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //第一關
        val button1 = view.findViewById<Button>(R.id.level1)
        button1.setOnClickListener {
            val menuActivity = activity as? MenuActivity
            menuActivity?.hideBottomNavigation()
            //替換成第一關的頁面
            menuActivity?.replaceFragment(StartFragment())
        }
    }

}



