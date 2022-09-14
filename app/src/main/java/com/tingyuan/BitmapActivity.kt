package com.tingyuan

import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.tingyuan.kotlindemo.util.SimilarPhoto
import kotlinx.android.synthetic.main.activity_excel.*

/**
 * @description:
 * @author: tingyuan
 * @date: 2022/9/13
 */
class BitmapActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_excel)
        btn.setOnClickListener {
            // 点击进行对比
//            var bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.doesnt_like_broccoli)
//            var bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.horses_eatina111.jpgg_grass)

            val bitmap1 = BitmapFactory.decodeResource(getResources(), R.mipmap.a1)
            val bitmap2 = BitmapFactory.decodeResource(getResources(), R.mipmap.a111)

            val fingerPrintFirst = SimilarPhoto.calculateFingerPrint(bitmap1)
            val fingerPrintSecond = SimilarPhoto.calculateFingerPrint(bitmap2)
            val dis = SimilarPhoto.hamDist(fingerPrintFirst, fingerPrintSecond)
            Log.d("yuanting", "dis $dis")
        }
    }
}
