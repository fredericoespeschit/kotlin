package com.espeschit.tutorialrecyclerview.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import com.espeschit.tutorialrecyclerview.R
import com.espeschit.tutorialrecyclerview.model.tutorial
import com.espeschit.tutorialrecyclerview.ui.adapters.adapter
import kotlinx.android.synthetic.main.activity_tutorial.*
import java.util.ArrayList

class tutorial : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tutorial)


        var list = ArrayList<tutorial>()
        list.add(
            tutorial(
                "Get product at your door",
                "Contrary to popular belief, Lorem Ipsum is not simply random text",
                R.drawable.image3
            )
        )

        list.add(
            tutorial(
                "Complete your shopping",
                "Contrary to popular belief, Lorem Ipsum is not simply random text",
                R.drawable.image2
            )
        )

        list.add(
            tutorial(
                "Choose Your Desire Product",
                "Contrary to popular belief, Lorem Ipsum is not simply random text",
                R.drawable.image1
            )
        )


       //tutorial.adapter = adapter(this, list<tutorial>)
        tutorial.adapter = adapter(this, list)
        tutorial.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val snapHelper = PagerSnapHelper()
        snapHelper.attachToRecyclerView(tutorial)

        //tutorial.addItemDecoration(LinePagerIndicatorDecoration())

    }
}
