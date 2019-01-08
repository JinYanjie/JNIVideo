# JNIVideo
使用ffmpeg视频解析

这句
  ANativeWindow *nativeWindow = ANativeWindow_fromSurface(env, surface);
  
  返回的nativeWindow为空，困了我好久，原因是surfaceView没有创建完成的时候就获取导致的，通过添加surfaceHolder的回调判断创建成功去调用才解决。
