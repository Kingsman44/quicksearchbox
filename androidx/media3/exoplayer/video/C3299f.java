package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2620h;
import androidx.media3.common.p136b.C2624l;
import androidx.media3.common.p136b.C2625m;
import androidx.media3.common.p136b.C2633u;

/* renamed from: androidx.media3.exoplayer.video.f */
/* compiled from: PG */
final class C3299f extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public C2620h f9965a;

    /* renamed from: b */
    public Handler f9966b;

    /* renamed from: c */
    public Error f9967c;

    /* renamed from: d */
    public RuntimeException f9968d;

    /* renamed from: e */
    public PlaceholderSurface f9969e;

    public C3299f() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final boolean handleMessage(Message message) {
        EGLSurface eGLSurface;
        C2620h hVar;
        Message message2 = message;
        int i = message2.what;
        boolean z = false;
        if (i == 1) {
            try {
                int i2 = message2.arg1;
                C2620h hVar2 = this.f9965a;
                hVar2.getClass();
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                C2625m.m7026c(eglGetDisplay != null, "eglGetDisplay failed");
                int[] iArr = new int[2];
                C2625m.m7026c(EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
                hVar2.f7277d = eglGetDisplay;
                EGLConfig[] eGLConfigArr = new EGLConfig[1];
                int[] iArr2 = new int[1];
                boolean eglChooseConfig = EGL14.eglChooseConfig(hVar2.f7277d, C2620h.f7274a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                C2625m.m7026c(eglChooseConfig && iArr2[0] > 0 && eGLConfigArr[0] != null, C2612ak.m6928K("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                EGLConfig eGLConfig = eGLConfigArr[0];
                EGLContext eglCreateContext = EGL14.eglCreateContext(hVar2.f7277d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
                C2625m.m7026c(eglCreateContext != null, "eglCreateContext failed");
                hVar2.f7278e = eglCreateContext;
                EGLDisplay eGLDisplay = hVar2.f7277d;
                EGLContext eGLContext = hVar2.f7278e;
                if (i2 == 1) {
                    eGLSurface = EGL14.EGL_NO_SURFACE;
                } else {
                    eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                    C2625m.m7026c(eGLSurface != null, "eglCreatePbufferSurface failed");
                }
                C2625m.m7026c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext), "eglMakeCurrent failed");
                hVar2.f7279f = eGLSurface;
                GLES20.glGenTextures(1, hVar2.f7276c, 0);
                C2625m.m7025b();
                hVar2.f7280g = new SurfaceTexture(hVar2.f7276c[0]);
                hVar2.f7280g.setOnFrameAvailableListener(hVar2);
                SurfaceTexture surfaceTexture = this.f9965a.f7280g;
                surfaceTexture.getClass();
                if (i2 != 0) {
                    z = true;
                }
                this.f9969e = new PlaceholderSurface(this, surfaceTexture, z);
                synchronized (this) {
                    notify();
                }
            } catch (RuntimeException e) {
                C2633u.m7048c("PlaceholderSurface", C2633u.m7046a("Failed to initialize placeholder surface", e));
                this.f9968d = e;
                synchronized (this) {
                    notify();
                }
            } catch (C2624l e2) {
                C2633u.m7048c("PlaceholderSurface", C2633u.m7046a("Failed to initialize placeholder surface", e2));
                this.f9968d = new IllegalStateException(e2);
                synchronized (this) {
                    notify();
                }
            } catch (Error e3) {
                try {
                    C2633u.m7048c("PlaceholderSurface", C2633u.m7046a("Failed to initialize placeholder surface", e3));
                    this.f9967c = e3;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
            return true;
        } else if (i != 2) {
            return true;
        } else {
            try {
                hVar = this.f9965a;
                hVar.getClass();
                hVar.f7275b.removeCallbacks(hVar);
                SurfaceTexture surfaceTexture2 = hVar.f7280g;
                if (surfaceTexture2 != null) {
                    surfaceTexture2.release();
                    GLES20.glDeleteTextures(1, hVar.f7276c, 0);
                }
                EGLDisplay eGLDisplay2 = hVar.f7277d;
                if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglMakeCurrent(hVar.f7277d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = hVar.f7279f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(hVar.f7277d, hVar.f7279f);
                }
                EGLContext eGLContext2 = hVar.f7278e;
                if (eGLContext2 != null) {
                    EGL14.eglDestroyContext(hVar.f7277d, eGLContext2);
                }
                int i3 = C2612ak.f7249a;
                EGL14.eglReleaseThread();
                EGLDisplay eGLDisplay3 = hVar.f7277d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(hVar.f7277d);
                }
                hVar.f7277d = null;
                hVar.f7278e = null;
                hVar.f7279f = null;
                hVar.f7280g = null;
            } catch (Throwable th2) {
                try {
                    C2633u.m7048c("PlaceholderSurface", C2633u.m7046a("Failed to release placeholder surface", th2));
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }
}
