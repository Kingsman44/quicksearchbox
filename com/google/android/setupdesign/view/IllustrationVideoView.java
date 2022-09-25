package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Animatable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.google.android.setupcompat.p3550b.C45244a;
import com.google.android.setupdesign.C45318g;
import java.io.IOException;
import java.util.Map;

/* compiled from: PG */
public class IllustrationVideoView extends TextureView implements Animatable, TextureView.SurfaceTextureListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnSeekCompleteListener, MediaPlayer.OnInfoListener, MediaPlayer.OnErrorListener {

    /* renamed from: a */
    protected MediaPlayer f118419a;

    /* renamed from: b */
    Surface f118420b;

    /* renamed from: c */
    private float f118421c = 1.0f;

    /* renamed from: d */
    private int f118422d = 0;

    /* renamed from: e */
    private String f118423e;

    /* renamed from: f */
    private boolean f118424f;

    /* renamed from: g */
    private boolean f118425g = true;

    /* renamed from: h */
    private int f118426h = 0;

    /* renamed from: i */
    private boolean f118427i = false;

    public IllustrationVideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118392k);
            int resourceId = obtainStyledAttributes.getResourceId(1, 0);
            if (C45244a.m80595a()) {
                this.f118425g = obtainStyledAttributes.getBoolean(0, true);
            }
            obtainStyledAttributes.recycle();
            mo49265c(resourceId, getContext().getPackageName());
            setScaleX(0.9999999f);
            setScaleX(0.9999999f);
            setSurfaceTextureListener(this);
        }
    }

    /* renamed from: d */
    private final void m80787d() {
        if (getWindowVisibility() == 0) {
            Surface surface = this.f118420b;
            if (surface != null) {
                surface.release();
                this.f118420b = null;
            }
            SurfaceTexture surfaceTexture = getSurfaceTexture();
            if (surfaceTexture != null) {
                m80788e(true);
                this.f118420b = new Surface(surfaceTexture);
            }
            if (this.f118420b != null) {
                mo49263a();
            } else {
                Log.i("IllustrationVideoView", "Surface is null");
            }
        }
    }

    /* renamed from: e */
    private final void m80788e(boolean z) {
        this.f118427i = z;
        setVisibility(this.f118426h);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49263a() {
        MediaPlayer mediaPlayer = this.f118419a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        if (this.f118420b != null && this.f118422d != 0) {
            MediaPlayer mediaPlayer2 = new MediaPlayer();
            this.f118419a = mediaPlayer2;
            mediaPlayer2.setSurface(this.f118420b);
            this.f118419a.setOnPreparedListener(this);
            this.f118419a.setOnSeekCompleteListener(this);
            this.f118419a.setOnInfoListener(this);
            this.f118419a.setOnErrorListener(this);
            int i = this.f118422d;
            String str = this.f118423e;
            try {
                this.f118419a.setDataSource(getContext(), Uri.parse("android.resource://" + str + "/" + i), (Map) null);
                this.f118419a.prepareAsync();
            } catch (IOException e) {
                Log.e("IllustrationVideoView", "Unable to set video data source: " + i, e);
            }
        }
    }

    /* renamed from: b */
    public final void mo49264b() {
        MediaPlayer mediaPlayer = this.f118419a;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f118419a = null;
            this.f118424f = false;
        }
        Surface surface = this.f118420b;
        if (surface != null) {
            surface.release();
            this.f118420b = null;
        }
    }

    /* renamed from: c */
    public final void mo49265c(int i, String str) {
        if (i != this.f118422d || (str != null && !str.equals(this.f118423e))) {
            this.f118422d = i;
            this.f118423e = str;
            mo49263a();
        }
    }

    public final boolean isRunning() {
        MediaPlayer mediaPlayer = this.f118419a;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        Log.w("IllustrationVideoView", "MediaPlayer error. what=" + i + " extra=" + i2);
        return false;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        if (i == 3) {
            m80788e(false);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = (float) size2;
        float f2 = this.f118421c;
        float f3 = ((float) size) * f2;
        if (f < f3) {
            size = (int) (f / f2);
        } else {
            size2 = (int) f3;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        float f;
        this.f118424f = true;
        mediaPlayer.setLooping(true);
        if (mediaPlayer.getVideoWidth() <= 0 || mediaPlayer.getVideoHeight() <= 0) {
            int videoWidth = mediaPlayer.getVideoWidth();
            int videoHeight = mediaPlayer.getVideoHeight();
            Log.w("IllustrationVideoView", "Unexpected video size=" + videoWidth + "x" + videoHeight);
            f = 0.0f;
        } else {
            f = ((float) mediaPlayer.getVideoHeight()) / ((float) mediaPlayer.getVideoWidth());
        }
        if (Float.compare(this.f118421c, f) != 0) {
            this.f118421c = f;
            requestLayout();
        }
        if (getWindowVisibility() == 0) {
            start();
        }
    }

    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        if (this.f118424f) {
            mediaPlayer.start();
        } else {
            Log.e("IllustrationVideoView", "Seek complete but media player not prepared");
        }
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        m80788e(true);
        m80787d();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        mo49264b();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            start();
        } else {
            stop();
        }
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i != 0) {
            mo49264b();
        } else if (this.f118420b == null) {
            m80787d();
        }
    }

    public final void setVisibility(int i) {
        this.f118426h = i;
        if (this.f118427i && i == 0) {
            i = 4;
        }
        super.setVisibility(i);
    }

    public final void start() {
        MediaPlayer mediaPlayer;
        if (this.f118424f && (mediaPlayer = this.f118419a) != null && !mediaPlayer.isPlaying()) {
            this.f118419a.start();
        }
    }

    public final void stop() {
        MediaPlayer mediaPlayer;
        if (this.f118425g && this.f118424f && (mediaPlayer = this.f118419a) != null) {
            mediaPlayer.pause();
        }
    }
}
