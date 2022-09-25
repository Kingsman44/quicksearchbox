package com.google.ads.interactivemedia.p367v3.internal;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.util.Log;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ado */
/* compiled from: PG */
public final class ado implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    private static final int[] f20374a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    private final Handler f20375b;

    /* renamed from: c */
    private final int[] f20376c = new int[1];

    /* renamed from: d */
    private EGLDisplay f20377d;

    /* renamed from: e */
    private EGLContext f20378e;

    /* renamed from: f */
    private EGLSurface f20379f;

    /* renamed from: g */
    private SurfaceTexture f20380g;

    public ado(Handler handler) {
        this.f20375b = handler;
    }

    /* renamed from: a */
    public final void mo14493a(int i) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        int[] iArr;
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        if (eglGetDisplay != null) {
            int[] iArr2 = new int[2];
            if (EGL14.eglInitialize(eglGetDisplay, iArr2, 0, iArr2, 1)) {
                this.f20377d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr3 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(eglGetDisplay, f20374a, 0, eGLConfigArr, 0, 1, iArr3, 0);
                if (!eglChooseConfig || iArr3[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                    throw new adn(aeu.m18487E("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr3[0]), eGLConfigArr[0]));
                }
                EGLContext eglCreateContext = EGL14.eglCreateContext(this.f20377d, eGLConfig, EGL14.EGL_NO_CONTEXT, i == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                if (eglCreateContext != null) {
                    this.f20378e = eglCreateContext;
                    EGLDisplay eGLDisplay = this.f20377d;
                    if (i == 1) {
                        eGLSurface = EGL14.EGL_NO_SURFACE;
                    } else {
                        if (i == 2) {
                            iArr = new int[]{12375, 1, 12374, 1, 12992, 1, 12344};
                        } else {
                            iArr = new int[]{12375, 1, 12374, 1, 12344};
                        }
                        eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, iArr, 0);
                        if (eGLSurface == null) {
                            throw new adn("eglCreatePbufferSurface failed");
                        }
                    }
                    if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eglCreateContext)) {
                        this.f20379f = eGLSurface;
                        GLES20.glGenTextures(1, this.f20376c, 0);
                        while (true) {
                            int glGetError = GLES20.glGetError();
                            if (glGetError != 0) {
                                String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                                Log.e("GlUtil", valueOf.length() != 0 ? "glError ".concat(valueOf) : new String("glError "));
                            } else {
                                SurfaceTexture surfaceTexture = new SurfaceTexture(this.f20376c[0]);
                                this.f20380g = surfaceTexture;
                                surfaceTexture.setOnFrameAvailableListener(this);
                                return;
                            }
                        }
                    } else {
                        throw new adn("eglMakeCurrent failed");
                    }
                } else {
                    throw new adn("eglCreateContext failed");
                }
            } else {
                throw new adn("eglInitialize failed");
            }
        } else {
            throw new adn("eglGetDisplay failed");
        }
    }

    /* renamed from: b */
    public final void mo14494b() {
        this.f20375b.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f20380g;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f20376c, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f20377d;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglMakeCurrent(this.f20377d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface = this.f20379f;
            if (eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f20377d, this.f20379f);
            }
            EGLContext eGLContext = this.f20378e;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f20377d, eGLContext);
            }
            if (aeu.f20466a >= 19) {
                EGL14.eglReleaseThread();
            }
            EGLDisplay eGLDisplay2 = this.f20377d;
            if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f20377d);
            }
            this.f20377d = null;
            this.f20378e = null;
            this.f20379f = null;
            this.f20380g = null;
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo14495c() {
        SurfaceTexture surfaceTexture = this.f20380g;
        ary.m19467t(surfaceTexture);
        return surfaceTexture;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f20375b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f20380g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
