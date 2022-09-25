package com.android.launcher3;

import android.app.ActionBar;
import android.app.WallpaperManager;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.net.Uri;
import android.opengl.GLUtils;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Toast;
import com.android.launcher3.base.BaseActivity;
import com.android.launcher3.util.WallpaperUtils;
import com.android.p261d.p262a.C5037a;
import com.android.p261d.p262a.C5038b;
import com.android.p261d.p262a.C5039c;
import com.android.p261d.p262a.C5041e;
import com.android.p261d.p263b.C5044c;
import com.android.p261d.p264c.C5053a;
import com.android.p261d.p264c.C5054b;
import com.android.p271h.C5152a;
import com.android.p271h.C5164c;
import com.android.p271h.C5165d;
import com.android.p271h.C5167f;
import com.android.p271h.p272a.C5156d;
import com.google.android.googlequicksearchbox.R;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: PG */
public class WallpaperCropActivity extends BaseActivity implements Handler.Callback {
    protected CropView mCropView;
    LoadRequest mCurrentLoadRequest;
    private Handler mLoaderHandler;
    private HandlerThread mLoaderThread;
    public final DialogInterface.OnCancelListener mOnDialogCancelListener = new DialogInterface.OnCancelListener() {
        public final void onCancel(DialogInterface dialogInterface) {
            WallpaperCropActivity.this.getActionBar().show();
            View findViewById = WallpaperCropActivity.this.findViewById(R.id.wallpaper_strip);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        }
    };
    protected View mProgressView;
    Set mReusableBitmaps = Collections.newSetFromMap(new WeakHashMap());
    protected View mSetWallpaperButton;
    private byte[] mTempStorageForDecoding = new byte[16384];

    /* compiled from: PG */
    public class CropViewScaleAndOffsetProvider {
        public float getParallaxOffset() {
            return 0.5f;
        }

        public float getScale(Point point, RectF rectF) {
            return 1.0f;
        }

        public void updateCropView(WallpaperCropActivity wallpaperCropActivity, C5156d dVar) {
            Point defaultWallpaperSize = WallpaperUtils.getDefaultWallpaperSize(wallpaperCropActivity.getResources(), wallpaperCropActivity.getWindowManager());
            RectF b = C5041e.m13843b(dVar.getImageWidth(), dVar.getImageHeight(), defaultWallpaperSize.x, defaultWallpaperSize.y, false);
            float scale = getScale(defaultWallpaperSize, b);
            PointF center = wallpaperCropActivity.mCropView.getCenter();
            float max = Math.max(0.0f, Math.min(getParallaxOffset(), 1.0f));
            float width = ((float) wallpaperCropActivity.mCropView.getWidth()) / scale;
            center.x = (width / 2.0f) + (max * (b.width() - width)) + b.left;
            wallpaperCropActivity.mCropView.setScaleAndCenter(scale, center.x, center.y);
        }
    }

    /* compiled from: PG */
    final class LoadRequest {
        boolean moveToLeft;
        Runnable postExecute;
        C5156d result;
        CropViewScaleAndOffsetProvider scaleAndOffsetProvider;
        C5152a src;
        boolean touchEnabled;
    }

    /* access modifiers changed from: package-private */
    public final void addReusableBitmap(C5156d dVar) {
        synchronized (this.mReusableBitmaps) {
            if (Utilities.ATLEAST_KITKAT && (dVar instanceof C5165d)) {
                C5053a aVar = ((C5165d) dVar).f16421e;
                Bitmap bitmap = aVar instanceof C5054b ? ((C5054b) aVar).f16099i : null;
                if (bitmap != null && bitmap.isMutable()) {
                    this.mReusableBitmaps.add(bitmap);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void cropImageAndSetWallpaper$ar$ds(Uri uri, C5037a aVar, boolean z) {
        float f;
        C5037a aVar2 = aVar;
        this.mProgressView.setVisibility(0);
        boolean z2 = getResources().getBoolean(R.bool.center_crop);
        boolean z3 = this.mCropView.getLayoutDirection() == 0;
        Display defaultDisplay = getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getSize(point);
        int i = point.x;
        int i2 = point.y;
        Point defaultWallpaperSize = WallpaperUtils.getDefaultWallpaperSize(getResources(), getWindowManager());
        CropView cropView = this.mCropView;
        RectF rectF = cropView.mTempEdges;
        cropView.getEdgesHelper(rectF);
        float f2 = cropView.mRenderer.f16404a;
        float f3 = (-rectF.left) / f2;
        float f4 = (-rectF.top) / f2;
        RectF rectF2 = new RectF(f3, f4, (((float) cropView.getWidth()) / f2) + f3, (((float) cropView.getHeight()) / f2) + f4);
        Point sourceDimensions = this.mCropView.getSourceDimensions();
        CropView cropView2 = this.mCropView;
        int i3 = cropView2.mRenderer.f16407d;
        float width = ((float) cropView2.getWidth()) / rectF2.width();
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i3);
        float[] fArr = {(float) sourceDimensions.x, (float) sourceDimensions.y};
        matrix.mapPoints(fArr);
        fArr[0] = Math.abs(fArr[0]);
        fArr[1] = Math.abs(fArr[1]);
        rectF2.left = Math.max(0.0f, rectF2.left);
        rectF2.right = Math.min(fArr[0], rectF2.right);
        rectF2.top = Math.max(0.0f, rectF2.top);
        rectF2.bottom = Math.min(fArr[1], rectF2.bottom);
        if (z2) {
            float min = Math.min(fArr[0] - rectF2.right, rectF2.left);
            f = min + min;
        } else {
            f = z3 ? fArr[0] - rectF2.right : rectF2.left;
        }
        float min2 = Math.min(f, (((float) defaultWallpaperSize.x) / width) - rectF2.width());
        if (z2) {
            float f5 = min2 / 2.0f;
            rectF2.left -= f5;
            rectF2.right += f5;
        } else if (z3) {
            rectF2.right += min2;
        } else {
            rectF2.left -= min2;
        }
        if (i < i2) {
            rectF2.bottom = rectF2.top + (((float) defaultWallpaperSize.y) / width);
        } else {
            float min3 = Math.min(Math.min(fArr[1] - rectF2.bottom, rectF2.top), ((((float) defaultWallpaperSize.y) / width) - rectF2.height()) / 2.0f);
            rectF2.top -= min3;
            rectF2.bottom += min3;
        }
        final int round = Math.round(rectF2.width() * width);
        final int round2 = Math.round(rectF2.height() * width);
        final boolean z4 = z;
        C5039c cVar = new C5039c(this, uri, rectF2, i3, round, round2, true, false, new C5038b() {
            public final void run(boolean z) {
                WallpaperCropActivity.this.updateWallpaperDimensions(round, round2);
                WallpaperCropActivity.this.setResult(-1);
                WallpaperCropActivity.this.finish();
                if (z && z4) {
                    WallpaperCropActivity.this.overridePendingTransition(0, R.anim.fade_out);
                }
            }
        });
        if (aVar2 != null) {
            cVar.mOnBitmapCroppedHandler = aVar2;
        }
        NycWallpaperUtils.executeCropTaskAfterPrompt(this, cVar, this.mOnDialogCancelListener);
    }

    public boolean enableRotation() {
        return getResources().getBoolean(R.bool.allow_rotation);
    }

    public final boolean handleMessage(Message message) {
        int i;
        Bitmap bitmap;
        if (message.what != 1) {
            return false;
        }
        final LoadRequest loadRequest = (LoadRequest) message.obj;
        try {
            C5152a aVar = loadRequest.src;
            C5044c cVar = new C5044c();
            if (aVar.mo10225c(cVar)) {
                int i2 = C5044c.f16027j;
                Integer f = cVar.mo9995f(i2, cVar.mo9993b(i2));
                if (f != null) {
                    aVar.f16360c = C5044c.m13853d(f.shortValue());
                }
            }
            aVar.f16358a = aVar.mo10224b();
            C5167f fVar = aVar.f16358a;
            if (fVar != null) {
                int b = fVar.mo10252b();
                int a = aVar.f16358a.mo10251a();
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inPreferQualityOverSpeed = true;
                int floor = (int) Math.floor((double) (1.0f / (1024.0f / ((float) Math.max(b, a)))));
                if (floor <= 1) {
                    i = 1;
                } else {
                    i = floor <= 8 ? Integer.highestOneBit(floor) : (floor >> 3) * 8;
                }
                options.inSampleSize = i;
                options.inJustDecodeBounds = false;
                options.inMutable = true;
                int i3 = (b / options.inSampleSize) * (a / options.inSampleSize);
                synchronized (this.mReusableBitmaps) {
                    int i4 = Integer.MAX_VALUE;
                    bitmap = null;
                    for (Bitmap bitmap2 : this.mReusableBitmaps) {
                        int width = bitmap2.getWidth() * bitmap2.getHeight();
                        if (width >= i3 && width < i4) {
                            bitmap = bitmap2;
                            i4 = width;
                        }
                    }
                    if (bitmap != null) {
                        this.mReusableBitmaps.remove(bitmap);
                    }
                }
                if (bitmap != null) {
                    options.inBitmap = bitmap;
                    try {
                        aVar.f16359b = aVar.mo10223a(options);
                    } catch (IllegalArgumentException e) {
                        Log.d("BitmapRegionTileSource", "Unable to reuse bitmap", e);
                        options.inBitmap = null;
                        aVar.f16359b = null;
                    }
                }
                if (aVar.f16359b == null) {
                    aVar.f16359b = aVar.mo10223a(options);
                }
                Bitmap bitmap3 = aVar.f16359b;
                if (bitmap3 != null) {
                    try {
                        GLUtils.getInternalFormat(bitmap3);
                        GLUtils.getType(aVar.f16359b);
                        aVar.f16361d = 2;
                    } catch (IllegalArgumentException e2) {
                        Log.d("BitmapRegionTileSource", "Image cannot be rendered on a GL surface", e2);
                        aVar.f16361d = 3;
                    }
                    loadRequest.result = new C5165d(this, loadRequest.src, this.mTempStorageForDecoding);
                    runOnUiThread(new Runnable() {
                        public final void run() {
                            LoadRequest loadRequest = loadRequest;
                            WallpaperCropActivity wallpaperCropActivity = WallpaperCropActivity.this;
                            if (loadRequest == wallpaperCropActivity.mCurrentLoadRequest) {
                                wallpaperCropActivity.onLoadRequestComplete(loadRequest, loadRequest.src.f16361d == 2);
                            } else {
                                wallpaperCropActivity.addReusableBitmap(loadRequest.result);
                            }
                        }
                    });
                    return true;
                }
            }
            aVar.f16361d = 3;
            loadRequest.result = new C5165d(this, loadRequest.src, this.mTempStorageForDecoding);
            runOnUiThread(new Runnable() {
                public final void run() {
                    LoadRequest loadRequest = loadRequest;
                    WallpaperCropActivity wallpaperCropActivity = WallpaperCropActivity.this;
                    if (loadRequest == wallpaperCropActivity.mCurrentLoadRequest) {
                        wallpaperCropActivity.onLoadRequestComplete(loadRequest, loadRequest.src.f16361d == 2);
                    } else {
                        wallpaperCropActivity.addReusableBitmap(loadRequest.result);
                    }
                }
            });
            return true;
        } catch (SecurityException e3) {
            if (isActivityDestroyed()) {
                return true;
            }
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    public void init() {
        setContentView(R.layout.wallpaper_cropper);
        this.mCropView = (CropView) findViewById(R.id.cropView);
        this.mProgressView = findViewById(R.id.loading);
        final Uri data = getIntent().getData();
        if (data == null) {
            Log.e("Launcher3.CropActivity", "No URI passed in intent, exiting WallpaperCropActivity");
            finish();
            return;
        }
        final ActionBar actionBar = getActionBar();
        actionBar.setCustomView(R.layout.actionbar_set_wallpaper);
        actionBar.getCustomView().setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                actionBar.hide();
                WallpaperCropActivity.this.cropImageAndSetWallpaper$ar$ds(data, (C5037a) null, false);
            }
        });
        this.mSetWallpaperButton = findViewById(R.id.set_wallpaper_button);
        final C5164c cVar = new C5164c(this, data);
        this.mSetWallpaperButton.setEnabled(false);
        setCropViewTileSource(cVar, true, false, (CropViewScaleAndOffsetProvider) null, new Runnable() {
            public final void run() {
                if (cVar.f16361d != 2) {
                    Toast.makeText(WallpaperCropActivity.this, R.string.wallpaper_load_fail, 1).show();
                    WallpaperCropActivity.this.finish();
                    return;
                }
                WallpaperCropActivity.this.mSetWallpaperButton.setEnabled(true);
            }
        });
    }

    /* access modifiers changed from: protected */
    public final boolean isActivityDestroyed() {
        return Utilities.ATLEAST_JB_MR1 && isDestroyed();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        HandlerThread handlerThread = new HandlerThread("wallpaper_loader");
        this.mLoaderThread = handlerThread;
        handlerThread.start();
        this.mLoaderHandler = new Handler(this.mLoaderThread.getLooper(), this);
        init();
        if (!enableRotation()) {
            setRequestedOrientation(1);
        }
    }

    public final void onDestroy() {
        CropView cropView = this.mCropView;
        if (cropView != null) {
            cropView.mGLSurfaceView.queueEvent(cropView.mFreeTextures);
        }
        HandlerThread handlerThread = this.mLoaderThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onLoadRequestComplete(LoadRequest loadRequest, boolean z) {
        this.mCurrentLoadRequest = null;
        if (z) {
            CropView cropView = this.mCropView;
            C5156d dVar = cropView.mRenderer.f16408e;
            cropView.setTileSource$ar$ds(loadRequest.result);
            CropView cropView2 = this.mCropView;
            cropView2.mTouchEnabled = loadRequest.touchEnabled;
            if (loadRequest.moveToLeft) {
                cropView2.moveToLeft();
            }
            CropViewScaleAndOffsetProvider cropViewScaleAndOffsetProvider = loadRequest.scaleAndOffsetProvider;
            if (cropViewScaleAndOffsetProvider != null) {
                cropViewScaleAndOffsetProvider.updateCropView(this, loadRequest.result);
            }
            if (!(dVar == null || dVar.getPreview() == null)) {
                dVar.getPreview().mo10022i();
            }
            addReusableBitmap(dVar);
        }
        Runnable runnable = loadRequest.postExecute;
        if (runnable != null) {
            runnable.run();
        }
        this.mProgressView.setVisibility(8);
    }

    public final void setCropViewTileSource(C5152a aVar, boolean z, boolean z2, CropViewScaleAndOffsetProvider cropViewScaleAndOffsetProvider, Runnable runnable) {
        final LoadRequest loadRequest = new LoadRequest();
        loadRequest.moveToLeft = z2;
        loadRequest.src = aVar;
        loadRequest.touchEnabled = z;
        loadRequest.postExecute = runnable;
        loadRequest.scaleAndOffsetProvider = cropViewScaleAndOffsetProvider;
        this.mCurrentLoadRequest = loadRequest;
        this.mLoaderHandler.removeMessages(1);
        Message.obtain(this.mLoaderHandler, 1, loadRequest).sendToTarget();
        this.mProgressView.postDelayed(new Runnable() {
            public final void run() {
                WallpaperCropActivity wallpaperCropActivity = WallpaperCropActivity.this;
                if (wallpaperCropActivity.mCurrentLoadRequest == loadRequest) {
                    wallpaperCropActivity.mProgressView.setVisibility(0);
                }
            }
        }, 1000);
    }

    /* access modifiers changed from: protected */
    public final void updateWallpaperDimensions(int i, int i2) {
        SharedPreferences sharedPreferences = getSharedPreferences("com.android.launcher3.WallpaperCropActivity", 4);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        if (i <= 0 || i2 <= 0) {
            edit.remove("wallpaper.width");
            edit.remove("wallpaper.height");
        } else {
            edit.putInt("wallpaper.width", i);
            edit.putInt("wallpaper.height", i2);
        }
        edit.apply();
        WallpaperUtils.suggestWallpaperDimension(getResources(), sharedPreferences, getWindowManager(), WallpaperManager.getInstance(this), true);
    }
}
