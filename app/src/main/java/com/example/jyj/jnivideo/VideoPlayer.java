package com.example.jyj.jnivideo;

import android.view.Surface;
import android.view.SurfaceView;

public class VideoPlayer {
    public native void render(String input,Surface surface);
    static {
        System.loadLibrary("avutil-54");
        System.loadLibrary("swresample-1");
        System.loadLibrary("avcodec-56");
        System.loadLibrary("avformat-56");
        System.loadLibrary("swscale-3");
        System.loadLibrary("postproc-53");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("avdevice-56");
        System.loadLibrary("avfilter-5");
        System.loadLibrary("myffpeg");
    }
}
