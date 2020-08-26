package com.example.wayout2_0

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.wayout2_0_2.R

class MainActivity : AppCompatActivity() {

    //var flag1 : Boolean = true
    val flag : Array<Boolean> = arrayOf(true, true, true, true, true, true, true)
    lateinit var imageButton0: ImageButton
    lateinit var imageButton1: ImageButton
    lateinit var imageButton2: ImageButton
    lateinit var imageButton3: ImageButton
    lateinit var imageButton4: ImageButton
    lateinit var imageButton5: ImageButton
    lateinit var imageButton6: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageButton0 = findViewById(R.id.imageButton0)
        imageButton1= findViewById(R.id.imageButton1)
        imageButton2 = findViewById(R.id.imageButton2)
        imageButton3 = findViewById(R.id.imageButton3)
        imageButton4= findViewById(R.id.imageButton4)
        imageButton5 = findViewById(R.id.imageButton5)
        imageButton6 = findViewById(R.id.imageButton6)

        imageButton0.setBackgroundResource(R.drawable.animation)
        imageButton1.setBackgroundResource(R.drawable.animation)
        imageButton2.setBackgroundResource(R.drawable.animation)
        imageButton3.setBackgroundResource(R.drawable.animation)
        imageButton4.setBackgroundResource(R.drawable.animation)
        imageButton5.setBackgroundResource(R.drawable.animation)
        imageButton6.setBackgroundResource(R.drawable.animation)

        imageButton0.setOnClickListener{
            onClick0(imageButton0)
        }

        imageButton1.setOnClickListener{
            onClick1(imageButton1)
        }

        imageButton2.setOnClickListener{
            onClick2(imageButton2)
        }

        imageButton3.setOnClickListener{
            onClick3(imageButton3)
        }

        imageButton4.setOnClickListener{
            onClick4(imageButton4)
        }

        imageButton5.setOnClickListener{
            onClick5(imageButton5)
        }

        imageButton6.setOnClickListener{
            onClick6(imageButton6)
        }


    }
    fun onClick0(imageButton0: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[1])imageButton1.setBackgroundResource(R.drawable.animation)
        else imageButton1.setBackgroundResource(R.drawable.animation_revers)
        if(flag[2])imageButton2.setBackgroundResource(R.drawable.animation)
        else imageButton2.setBackgroundResource(R.drawable.animation_revers)
        if(flag[3])imageButton3.setBackgroundResource(R.drawable.animation)
        else imageButton3.setBackgroundResource(R.drawable.animation_revers)
        if(flag[4])imageButton4.setBackgroundResource(R.drawable.animation)
        else imageButton4.setBackgroundResource(R.drawable.animation_revers)
        if(flag[5])imageButton5.setBackgroundResource(R.drawable.animation)
        else imageButton5.setBackgroundResource(R.drawable.animation_revers)
        if(flag[6])imageButton6.setBackgroundResource(R.drawable.animation)
        else imageButton6.setBackgroundResource(R.drawable.animation_revers)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton1.getBackground() as AnimationDrawable?)!!.start()
        (imageButton2.getBackground() as AnimationDrawable?)!!.start()
        (imageButton3.getBackground() as AnimationDrawable?)!!.start()
        (imageButton4.getBackground() as AnimationDrawable?)!!.start()
        (imageButton5.getBackground() as AnimationDrawable?)!!.start()
        (imageButton6.getBackground() as AnimationDrawable?)!!.start()
        for(i in 0..6){
            flag[i] = flag[i].not()
        }

    }
    fun onClick1(imageButton1: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[1])imageButton1.setBackgroundResource(R.drawable.animation)
        else imageButton1.setBackgroundResource(R.drawable.animation_revers)
        if(flag[2])imageButton2.setBackgroundResource(R.drawable.animation)
        else imageButton2.setBackgroundResource(R.drawable.animation_revers)
        if(flag[6])imageButton6.setBackgroundResource(R.drawable.animation)
        else imageButton6.setBackgroundResource(R.drawable.animation_revers)

        (imageButton1.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton2.getBackground() as AnimationDrawable?)!!.start()
        (imageButton6.getBackground() as AnimationDrawable?)!!.start()
        flag[1] = flag[1].not()
        flag[0] = flag[0].not()
        flag[2] = flag[2].not()
        flag[6] = flag[6].not()
    }
    fun onClick2(imageButton2: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[1])imageButton1.setBackgroundResource(R.drawable.animation)
        else imageButton1.setBackgroundResource(R.drawable.animation_revers)
        if(flag[2])imageButton2.setBackgroundResource(R.drawable.animation)
        else imageButton2.setBackgroundResource(R.drawable.animation_revers)
        if(flag[3])imageButton3.setBackgroundResource(R.drawable.animation)
        else imageButton3.setBackgroundResource(R.drawable.animation_revers)

        (imageButton2.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton1.getBackground() as AnimationDrawable?)!!.start()
        (imageButton3.getBackground() as AnimationDrawable?)!!.start()
        flag[2] = flag[1].not()
        flag[0] = flag[0].not()
        flag[1] = flag[2].not()
        flag[3] = flag[6].not()
    }
    fun onClick3(imageButton3: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[4])imageButton4.setBackgroundResource(R.drawable.animation)
        else imageButton4.setBackgroundResource(R.drawable.animation_revers)
        if(flag[2])imageButton2.setBackgroundResource(R.drawable.animation)
        else imageButton2.setBackgroundResource(R.drawable.animation_revers)
        if(flag[3])imageButton3.setBackgroundResource(R.drawable.animation)
        else imageButton3.setBackgroundResource(R.drawable.animation_revers)

        (imageButton3.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton2.getBackground() as AnimationDrawable?)!!.start()
        (imageButton4.getBackground() as AnimationDrawable?)!!.start()
        flag[3] = flag[3].not()
        flag[0] = flag[0].not()
        flag[2] = flag[2].not()
        flag[4] = flag[4].not()
    }
    fun onClick4(imageButton4: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[4])imageButton4.setBackgroundResource(R.drawable.animation)
        else imageButton4.setBackgroundResource(R.drawable.animation_revers)
        if(flag[5])imageButton5.setBackgroundResource(R.drawable.animation)
        else imageButton5.setBackgroundResource(R.drawable.animation_revers)
        if(flag[3])imageButton3.setBackgroundResource(R.drawable.animation)
        else imageButton3.setBackgroundResource(R.drawable.animation_revers)

        (imageButton4.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton3.getBackground() as AnimationDrawable?)!!.start()
        (imageButton5.getBackground() as AnimationDrawable?)!!.start()
        flag[4] = flag[4].not()
        flag[0] = flag[0].not()
        flag[3] = flag[3].not()
        flag[5] = flag[5].not()
    }
    fun onClick5(imageButton5: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[4])imageButton4.setBackgroundResource(R.drawable.animation)
        else imageButton4.setBackgroundResource(R.drawable.animation_revers)
        if(flag[5])imageButton5.setBackgroundResource(R.drawable.animation)
        else imageButton5.setBackgroundResource(R.drawable.animation_revers)
        if(flag[6])imageButton6.setBackgroundResource(R.drawable.animation)
        else imageButton6.setBackgroundResource(R.drawable.animation_revers)

        (imageButton5.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton6.getBackground() as AnimationDrawable?)!!.start()
        (imageButton4.getBackground() as AnimationDrawable?)!!.start()
        flag[5] = flag[5].not()
        flag[0] = flag[0].not()
        flag[6] = flag[6].not()
        flag[4] = flag[4].not()
    }
    fun onClick6(imageButton6: ImageButton){
        if(flag[0])imageButton0.setBackgroundResource(R.drawable.animation)
        else imageButton0.setBackgroundResource(R.drawable.animation_revers)
        if(flag[1])imageButton1.setBackgroundResource(R.drawable.animation)
        else imageButton1.setBackgroundResource(R.drawable.animation_revers)
        if(flag[5])imageButton5.setBackgroundResource(R.drawable.animation)
        else imageButton5.setBackgroundResource(R.drawable.animation_revers)
        if(flag[6])imageButton6.setBackgroundResource(R.drawable.animation)
        else imageButton6.setBackgroundResource(R.drawable.animation_revers)

        (imageButton6.getBackground() as AnimationDrawable?)!!.start()
        Thread.sleep(300)
        (imageButton0.getBackground() as AnimationDrawable?)!!.start()
        (imageButton5.getBackground() as AnimationDrawable?)!!.start()
        (imageButton1.getBackground() as AnimationDrawable?)!!.start()
        flag[6] = flag[6].not()
        flag[0] = flag[0].not()
        flag[5] = flag[5].not()
        flag[1] = flag[1].not()
    }
}