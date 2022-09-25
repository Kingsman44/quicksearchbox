package com.google.mediapipe.p4723b;

import android.opengl.GLES20;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.mediapipe.b.e */
/* compiled from: PG */
public class C62714e extends Thread {

    /* renamed from: l */
    public boolean f169343l;

    /* renamed from: m */
    public boolean f169344m;

    /* renamed from: n */
    public final Object f169345n = new Object();

    /* renamed from: o */
    protected volatile C62711b f169346o;

    /* renamed from: p */
    protected EGLSurface f169347p = null;

    /* renamed from: q */
    public Handler f169348q = null;

    /* renamed from: r */
    protected Looper f169349r = null;

    /* renamed from: s */
    protected int f169350s = 0;

    public C62714e(Object obj) {
        this.f169346o = new C62711b(obj);
        setName("drishti.glutil.GlThread");
    }

    /* renamed from: c */
    public void mo58586c() {
        this.f169347p = this.f169346o.mo58597d();
        C62711b bVar = this.f169346o;
        EGLSurface eGLSurface = this.f169347p;
        bVar.mo58594a(eGLSurface, eGLSurface);
        GLES20.glDisable(2929);
        GLES20.glDisable(2884);
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        this.f169350s = iArr[0];
    }

    /* renamed from: d */
    public void mo58587d() {
        int i = this.f169350s;
        if (i != 0) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.f169350s = 0;
        }
        C62711b bVar = this.f169346o;
        if (!bVar.f169319a.eglMakeCurrent(bVar.f169320b, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_SURFACE, EGL10.EGL_NO_CONTEXT)) {
            throw new RuntimeException("eglMakeCurrent failed");
        } else if (this.f169347p != null) {
            this.f169346o.mo58596c(this.f169347p);
            this.f169347p = null;
        }
    }

    /* renamed from: i */
    public final void mo58598i(int i, int i2, int i3) {
        GLES20.glBindFramebuffer(36160, this.f169350s);
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
        int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (glCheckFramebufferStatus == 36053) {
            GLES20.glViewport(0, 0, i2, i3);
            C62715f.m94926c("glViewport");
            return;
        }
        throw new RuntimeException("Framebuffer not complete, status=" + glCheckFramebufferStatus);
    }

    /* renamed from: j */
    public final void mo58599j() {
        Looper looper = this.f169349r;
        if (looper != null) {
            looper.quitSafely();
        }
    }

    public final void run() {
        String str;
        String str2;
        try {
            Looper.prepare();
            this.f169348q = new Handler();
            this.f169349r = Looper.myLooper();
            Log.d("GlThread", String.format("Starting GL thread %s", new Object[]{getName()}));
            mo58586c();
            this.f169344m = true;
            synchronized (this.f169345n) {
                this.f169343l = true;
                this.f169345n.notify();
            }
            try {
                Looper.loop();
            } finally {
                this.f169349r = null;
                mo58587d();
                this.f169346o.mo58595b();
                str = "GlThread";
                str2 = "Stopping GL thread %s";
                Log.d(str, String.format(str2, new Object[]{getName()}));
            }
        } catch (Throwable th) {
            synchronized (this.f169345n) {
                this.f169343l = true;
                this.f169345n.notify();
                throw th;
            }
        }
    }
}
