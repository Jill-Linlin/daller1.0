package com.example.dalleralpha1_0_0.home

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.DialogFragment
import com.example.dalleralpha1_0_0.MenuActivity
import com.example.dalleralpha1_0_0.R

class BadFragment : DialogFragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_bad, container, false)
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.apply {
            setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            setGravity(Gravity.BOTTOM) // 從底部彈出
            setBackgroundDrawable(ColorDrawable(Color.RED)) //背景設為紅色
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //點繼續按紐，跳到結算頁
        val next = view.findViewById<Button>(R.id.next)
        next.setOnClickListener {
            val menuActivity = activity as? MenuActivity
            menuActivity?.replaceFragment(HomeFragment())
            menuActivity?.showBottomNavigation()
        }
    }

    companion object {
        fun newInstance(): BadFragment {
            return BadFragment()
        }
    }
}