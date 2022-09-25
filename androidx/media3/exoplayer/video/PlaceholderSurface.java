package androidx.media3.exoplayer.video;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.common.p136b.C2620h;

/* compiled from: PG */
public final class PlaceholderSurface extends Surface {

    /* renamed from: b */
    private static int f9825b;

    /* renamed from: c */
    private static boolean f9826c;

    /* renamed from: a */
    public final boolean f9827a;

    /* renamed from: d */
    private final C3299f f9828d;

    /* renamed from: e */
    private boolean f9829e;

    public PlaceholderSurface(C3299f fVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.f9828d = fVar;
        this.f9827a = z;
    }

    /* renamed from: a */
    public static synchronized boolean m9514a() {
        int i;
        int i2;
        synchronized (PlaceholderSurface.class) {
            if (!f9826c) {
                int i3 = C2612ak.f7249a;
                String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                if (eglQueryString == null || !eglQueryString.contains("EGL_EXT_protected_content")) {
                    i2 = 0;
                } else {
                    String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                    i2 = 2;
                    if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                        i2 = 1;
                    }
                }
                f9825b = i2;
                f9826c = true;
            }
            i = f9825b;
        }
        return i != 0;
    }

    /* renamed from: b */
    public static PlaceholderSurface m9515b(boolean z) {
        boolean z2 = false;
        C2601a.m6832d(!z || m9514a());
        C3299f fVar = new C3299f();
        int i = z ? f9825b : 0;
        fVar.start();
        fVar.f9966b = new Handler(fVar.getLooper(), fVar);
        fVar.f9965a = new C2620h(fVar.f9966b);
        synchronized (fVar) {
            fVar.f9966b.obtainMessage(1, i, 0).sendToTarget();
            while (fVar.f9969e == null && fVar.f9968d == null && fVar.f9967c == null) {
                try {
                    fVar.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = fVar.f9968d;
        if (runtimeException == null) {
            Error error = fVar.f9967c;
            if (error == null) {
                PlaceholderSurface placeholderSurface = fVar.f9969e;
                placeholderSurface.getClass();
                return placeholderSurface;
            }
            throw error;
        }
        throw runtimeException;
    }

    public final void release() {
        super.release();
        synchronized (this.f9828d) {
            if (!this.f9829e) {
                Handler handler = this.f9828d.f9966b;
                handler.getClass();
                handler.sendEmptyMessage(2);
                this.f9829e = true;
            }
        }
    }
}
