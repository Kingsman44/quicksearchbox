package com.android.p271h.p272a;

import android.content.Context;
import android.graphics.RectF;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.widget.FrameLayout;

/* renamed from: com.android.h.a.j */
/* compiled from: PG */
public class C5162j extends FrameLayout {
    private Choreographer.FrameCallback mFrameCallback;
    public Runnable mFreeTextures;
    public GLSurfaceView mGLSurfaceView;
    boolean mInvalPending;
    protected Object mLock;
    public C5160h mRenderer;

    public C5162j(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void invalOnVsync() {
        if (!this.mInvalPending) {
            this.mInvalPending = true;
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new C5159g(this);
            }
            Choreographer.getInstance().postFrameCallback(this.mFrameCallback);
        }
    }

    public final void invalidate() {
        invalOnVsync();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        synchronized (this.mLock) {
            updateScaleIfNecessaryLocked(this.mRenderer);
        }
    }

    public final void setVisibility(int i) {
        super.setVisibility(i);
        this.mGLSurfaceView.setVisibility(i);
    }

    public final void updateScaleIfNecessaryLocked(C5160h hVar) {
        if (hVar != null && hVar.f16408e != null && hVar.f16404a <= 0.0f && getWidth() != 0) {
            hVar.f16404a = Math.min(((float) getWidth()) / ((float) hVar.f16408e.getImageWidth()), ((float) getHeight()) / ((float) hVar.f16408e.getImageHeight()));
        }
    }

    public C5162j(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mInvalPending = false;
        this.mLock = new Object();
        this.mFreeTextures = new C5158f(this);
        new RectF();
        C5160h hVar = new C5160h();
        this.mRenderer = hVar;
        hVar.f16410g = new C5157e(this);
        GLSurfaceView gLSurfaceView = new GLSurfaceView(context);
        this.mGLSurfaceView = gLSurfaceView;
        gLSurfaceView.setEGLContextClientVersion(2);
        this.mGLSurfaceView.setRenderer(new C5161i(this));
        this.mGLSurfaceView.setRenderMode(0);
        addView(this.mGLSurfaceView, new FrameLayout.LayoutParams(-1, -1));
    }
}
