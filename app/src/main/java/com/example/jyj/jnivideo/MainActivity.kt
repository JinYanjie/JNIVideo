package com.example.jyj.jnivideo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.util.Log
import android.view.SurfaceHolder
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dataDirectory = Environment.getDataDirectory()
        var inPath = Environment.getExternalStorageDirectory().path + "/rain.mp4"
        Log.e("jyj",inPath)
        var file = File(inPath)
        if (file.exists()){
            Log.e("jyj","${file.length()}")
        }
        val input = File(Environment.getExternalStorageDirectory(), "rain.mp4").absolutePath
        if (v_videoView.holder==null){
            Log.e("jyj","  Holder 为空")
        }else{
            Log.e("jyj","  Holder 不 为空")
            if (v_videoView.holder.surface==null){
                Log.e("jyj","  surface 为空")
            }else{
                Log.e("jyj","  surface  不 为空")
            }
        }
        v_videoView.holder.addCallback(object :SurfaceHolder.Callback{
            override fun surfaceChanged(holder: SurfaceHolder?, format: Int, width: Int, height: Int) {

            }

            override fun surfaceDestroyed(holder: SurfaceHolder?) {

            }

            override fun surfaceCreated(holder: SurfaceHolder?) {
                VideoPlayer().render(input,v_videoView.holder.surface)
            }
        })


    }

}
