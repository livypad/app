package org.tensorflow.lite.examples.styletransfer;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u00c0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\\B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010(\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020\u000eH\u0002J\b\u0010+\u001a\u00020)H\u0002J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u000eH\u0002J\u0018\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u00020\u0010J\b\u00103\u001a\u00020\u0010H\u0002J\u0010\u00104\u001a\u0004\u0018\u00010\u00102\u0006\u00105\u001a\u000206J\u0010\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u0010H\u0002J\"\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u00122\u0006\u0010;\u001a\u00020\u00122\b\u0010<\u001a\u0004\u0018\u00010=H\u0014J\u0010\u0010>\u001a\u00020)2\u0006\u0010?\u001a\u00020/H\u0016J\u0012\u0010@\u001a\u00020)2\b\u0010A\u001a\u0004\u0018\u00010BH\u0014J\u0010\u0010C\u001a\u00020)2\u0006\u0010D\u001a\u00020\u0010H\u0016J+\u0010E\u001a\u00020)2\u0006\u0010:\u001a\u00020\u00122\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100G2\u0006\u0010H\u001a\u00020IH\u0016\u00a2\u0006\u0002\u0010JJ\u0018\u0010K\u001a\u00020)2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020\u0010H\u0002J\u0010\u0010O\u001a\u00020)2\u0006\u0010L\u001a\u00020MH\u0002J\u0006\u0010P\u001a\u00020)J\u0018\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020\u00162\u0006\u0010S\u001a\u00020MH\u0002J\u0018\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020\u00162\u0006\u0010T\u001a\u00020\u0010H\u0002J\b\u0010U\u001a\u00020)H\u0002J\b\u0010V\u001a\u00020)H\u0002J\u0010\u0010W\u001a\u00020)2\u0006\u0010X\u001a\u00020YH\u0002J\u0018\u0010Z\u001a\u00020)2\u0006\u0010N\u001a\u00020\u00102\u0006\u0010[\u001a\u00020YH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0016X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006]"}, d2 = {"Lorg/tensorflow/lite/examples/styletransfer/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/tensorflow/lite/examples/styletransfer/StyleFragment$OnListFragmentInteractionListener;", "Lorg/tensorflow/lite/examples/styletransfer/camera/CameraFragment$OnCaptureFinished;", "()V", "cameraFragment", "Lorg/tensorflow/lite/examples/styletransfer/camera/CameraFragment;", "captureButton", "Landroid/widget/ImageButton;", "horizontalScrollView", "Landroid/widget/HorizontalScrollView;", "inferenceThread", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "isRunningModel", "", "lastSavedFile", "", "lensFacing", "", "mainScope", "Lkotlinx/coroutines/CoroutineScope;", "originalImageView", "Landroid/widget/ImageView;", "photopath", "progressBar", "Landroid/widget/ProgressBar;", "rerunButton", "Landroid/widget/Button;", "resultImageView", "selectedStyle", "styleImageView", "styleTransferModelExecutor", "Lorg/tensorflow/lite/examples/styletransfer/StyleTransferModelExecutor;", "stylesFragment", "Lorg/tensorflow/lite/examples/styletransfer/StyleFragment;", "useGPU", "viewFinder", "Landroid/widget/FrameLayout;", "viewModel", "Lorg/tensorflow/lite/examples/styletransfer/MLExecutionViewModel;", "addCameraFragment", "", "allPermissionsGranted", "animateCameraButton", "enableControls", "enable", "getAppSpecificAlbumStorageDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "albumName", "getLastTakenPicture", "getPath", "uri", "Landroid/net/Uri;", "getUriFromAssetThumb", "thumb", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCaptureFinished", "file", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onListFragmentInteraction", "item", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "saveToPngToAPP", "pic", "Landroid/graphics/Bitmap;", "time", "saveToPngToAlbum", "selectImage", "setImageView", "imageView", "image", "imagePath", "setupControls", "startRunningModel", "updateUIWithResults", "modelExecutionResult", "Lorg/tensorflow/lite/examples/styletransfer/ModelExecutionResult;", "writeLog", "result", "CropTop", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements org.tensorflow.lite.examples.styletransfer.StyleFragment.OnListFragmentInteractionListener, org.tensorflow.lite.examples.styletransfer.camera.CameraFragment.OnCaptureFinished {
    private boolean isRunningModel;
    private final org.tensorflow.lite.examples.styletransfer.StyleFragment stylesFragment = null;
    private java.lang.String selectedStyle;
    private org.tensorflow.lite.examples.styletransfer.camera.CameraFragment cameraFragment;
    private org.tensorflow.lite.examples.styletransfer.MLExecutionViewModel viewModel;
    private android.widget.FrameLayout viewFinder;
    private android.widget.ImageView resultImageView;
    private android.widget.ImageView originalImageView;
    private android.widget.ImageView styleImageView;
    private android.widget.Button rerunButton;
    private android.widget.ImageButton captureButton;
    private android.widget.ProgressBar progressBar;
    private android.widget.HorizontalScrollView horizontalScrollView;
    private java.lang.String lastSavedFile;
    private boolean useGPU;
    private org.tensorflow.lite.examples.styletransfer.StyleTransferModelExecutor styleTransferModelExecutor;
    private final kotlinx.coroutines.ExecutorCoroutineDispatcher inferenceThread = null;
    private final kotlinx.coroutines.CoroutineScope mainScope = null;
    private int lensFacing;
    private java.lang.String photopath;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void saveToPngToAlbum(android.graphics.Bitmap pic) {
    }
    
    private final void writeLog(java.lang.String time, org.tensorflow.lite.examples.styletransfer.ModelExecutionResult result) {
    }
    
    private final void saveToPngToAPP(android.graphics.Bitmap pic, java.lang.String time) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.File getAppSpecificAlbumStorageDir(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String albumName) {
        return null;
    }
    
    private final void animateCameraButton() {
    }
    
    private final void setImageView(android.widget.ImageView imageView, android.graphics.Bitmap image) {
    }
    
    private final void setImageView(android.widget.ImageView imageView, java.lang.String imagePath) {
    }
    
    private final void updateUIWithResults(org.tensorflow.lite.examples.styletransfer.ModelExecutionResult modelExecutionResult) {
    }
    
    private final void enableControls(boolean enable) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPath(@org.jetbrains.annotations.NotNull()
    android.net.Uri uri) {
        return null;
    }
    
    public final void selectImage() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void setupControls() {
    }
    
    private final void addCameraFragment() {
    }
    
    /**
     * Process result from permission request dialog box, has the request
     * been granted? If yes, start Camera. Otherwise display a toast
     */
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    /**
     * Check if all permission specified in the manifest have been granted
     */
    private final boolean allPermissionsGranted() {
        return false;
    }
    
    @java.lang.Override()
    public void onCaptureFinished(@org.jetbrains.annotations.NotNull()
    java.io.File file) {
    }
    
    private final java.lang.String getLastTakenPicture() {
        return null;
    }
    
    @java.lang.Override()
    public void onListFragmentInteraction(@org.jetbrains.annotations.NotNull()
    java.lang.String item) {
    }
    
    private final java.lang.String getUriFromAssetThumb(java.lang.String thumb) {
        return null;
    }
    
    private final void startRunningModel() {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002J\b\u0010\u0007\u001a\u00020\bH\u0016J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016\u00a8\u0006\u0015"}, d2 = {"Lorg/tensorflow/lite/examples/styletransfer/MainActivity$CropTop;", "Lcom/bumptech/glide/load/resource/bitmap/BitmapTransformation;", "()V", "equals", "", "other", "", "hashCode", "", "transform", "Landroid/graphics/Bitmap;", "pool", "Lcom/bumptech/glide/load/engine/bitmap_recycle/BitmapPool;", "toTransform", "outWidth", "outHeight", "updateDiskCacheKey", "", "messageDigest", "Ljava/security/MessageDigest;", "Companion", "app_debug"})
    public static final class CropTop extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
        private static final java.lang.String ID = "org.tensorflow.lite.examples.styletransfer.CropTop";
        private static final byte[] ID_BYTES = null;
        public static final org.tensorflow.lite.examples.styletransfer.MainActivity.CropTop.Companion Companion = null;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.graphics.Bitmap transform(@org.jetbrains.annotations.NotNull()
        com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool pool, @org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap toTransform, int outWidth, int outHeight) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public void updateDiskCacheKey(@org.jetbrains.annotations.NotNull()
        java.security.MessageDigest messageDigest) {
        }
        
        public CropTop() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/tensorflow/lite/examples/styletransfer/MainActivity$CropTop$Companion;", "", "()V", "ID", "", "ID_BYTES", "", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
        }
    }
}