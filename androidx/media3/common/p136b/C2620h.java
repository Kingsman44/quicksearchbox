package androidx.media3.common.p136b;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: androidx.media3.common.b.h */
/* compiled from: PG */
public final class C2620h implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    public static final int[] f7274a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    public final Handler f7275b;

    /* renamed from: c */
    public final int[] f7276c = new int[1];

    /* renamed from: d */
    public EGLDisplay f7277d;

    /* renamed from: e */
    public EGLContext f7278e;

    /* renamed from: f */
    public EGLSurface f7279f;

    /* renamed from: g */
    public SurfaceTexture f7280g;

    public C2620h(Handler handler) {
        this.f7275b = handler;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f7275b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f7280g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
