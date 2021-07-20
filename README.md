# 风格迁移


## 挑选图片

更改原来按键的功能，调用一个Intent

```kotlin
    captureButton.setOnClickListener {
        it.clearAnimation()
        //            cameraFragment.takePicture()
        selectImage()
    }   


fun selectImage() {
    val intent = Intent(Intent.ACTION_GET_CONTENT).apply {
        type = "image/*"
    }
    if (intent.resolveActivity(packageManager) != null) {
        startActivityForResult(intent, REQUEST_IMAGE_GET)
    }
}
```

在`onActivityResult`中将`Uri`转成图片路径并显示



## 保存本地结果

分为保存到媒体库和保存到用户文件夹下。都是先找到保存位置，再打开文件流，调用`Bitmap`的`compress`api输出结果。本地图片路径`files/Pictures/album/*`和log文件路径 `files/model_log.txt`



```kotlin
private fun saveToPngToAlbum(pic:Bitmap) {
        val new_path:String= (System.currentTimeMillis()/1000L).toString()+"x.png"
        val resolver = applicationContext.contentResolver
        val imageCollection = MediaStore.Images.Media.getContentUri(
            MediaStore.VOLUME_EXTERNAL_PRIMARY)

        val newimg = ContentValues().apply {
            put(MediaStore.Images.Media.DISPLAY_NAME, new_path)
        }
        val newUri = resolver
            .insert(imageCollection, newimg)
        if(newUri!=null){
            resolver.openOutputStream(newUri!!).use { stream ->
                pic.compress(Bitmap.CompressFormat.PNG,90,stream)
            }
        }
    }
    private fun writeLog(time:String,result: ModelExecutionResult){
        val logName="model_log.txt"
        val appSpecificExternalDir = File(applicationContext.getExternalFilesDir(null), logName)
        appSpecificExternalDir.appendText(time+"\n")
        appSpecificExternalDir.appendText(result.executionLog+'\n')
    }
    private fun saveToPngToAPP(pic:Bitmap,time:String){
        val dir=getAppSpecificAlbumStorageDir(applicationContext,"album")
        if(dir!=null){
            val file = File(dir,time+".png")
            file?.outputStream()?.use{ stream ->
                pic.compress(Bitmap.CompressFormat.PNG,90,stream)
            }
        }
    }
    fun getAppSpecificAlbumStorageDir(context: Context, albumName: String): File? {
        val file = File(context.getExternalFilesDir(
            Environment.DIRECTORY_PICTURES), albumName)
        if (!file?.mkdirs()) {
            Log.e(TAG, "Directory not created")
        }
        return file
    }
```

## 分享文件

使用android 自带框架的sharesheet，在保存到媒体库时候记忆图片的`Uri`即可

```kotlin
    fun sharePng(pngUri:Uri){
        val shareIntent: Intent = Intent().apply {
            action = Intent.ACTION_SEND
            putExtra(Intent.EXTRA_STREAM, pngUri)
            type = "image/png"
        }
        startActivity(Intent.createChooser(shareIntent,"Share images to.."))
    }
```



## 自己模型

尚未实现。主要问题有

1. 没有时间学习风格迁移的知识，并自己搭建网络
2. 我已经试验过的预训练模型
	- 图片迭代次数多，处理速度过慢
	- keras的`backend.function`和转换器不兼容，尚不能解决
