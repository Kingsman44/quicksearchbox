package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.view.Surface;

/* renamed from: com.google.ads.interactivemedia.v3.internal.afa */
/* compiled from: PG */
public final class afa extends Surface {

    /* renamed from: a */
    private static int f20500a;

    /* renamed from: b */
    private static boolean f20501b;

    /* renamed from: c */
    private final aez f20502c;

    /* renamed from: d */
    private boolean f20503d;

    public /* synthetic */ afa(aez aez, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f20502c = aez;
    }

    /* renamed from: a */
    public static synchronized boolean m18566a(Context context) {
        int i;
        int i2;
        synchronized (afa.class) {
            if (!f20501b) {
                if (aeu.f20466a >= 24) {
                    if (aeu.f20466a < 26) {
                        if (!"samsung".equals(aeu.f20468c)) {
                            if ("XT1650".equals(aeu.f20469d)) {
                            }
                        }
                    }
                    if (aeu.f20466a >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
                        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                        if (eglQueryString != null && eglQueryString.contains("EGL_EXT_protected_content")) {
                            i2 = 2;
                            if (aeu.f20466a >= 17) {
                                String eglQueryString2 = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
                                if (eglQueryString2 != null && eglQueryString2.contains("EGL_KHR_surfaceless_context")) {
                                    i2 = 1;
                                }
                            }
                            f20500a = i2;
                            f20501b = true;
                        }
                    }
                }
                i2 = 0;
                f20500a = i2;
                f20501b = true;
            }
            i = f20500a;
        }
        return i != 0;
    }

    /* renamed from: b */
    public static afa m18567b(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !m18566a(context)) {
            z2 = false;
        }
        ary.m19464q(z2);
        aez aez = new aez();
        if (z) {
            i = f20500a;
        }
        return aez.mo14613a(i);
    }

    public final void release() {
        super.release();
        synchronized (this.f20502c) {
            if (!this.f20503d) {
                this.f20502c.mo14614b();
                this.f20503d = true;
            }
        }
    }
}
