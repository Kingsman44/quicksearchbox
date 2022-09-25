package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.opengl.GLSurfaceView;
import com.google.mediapipe.p4723b.C62711b;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.ad */
/* compiled from: PG */
final class C10583ad implements GLSurfaceView.EGLContextFactory {

    /* renamed from: a */
    final /* synthetic */ C62711b f35404a;

    public C10583ad(C62711b bVar) {
        this.f35404a = bVar;
    }

    public final EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        C62711b bVar = this.f35404a;
        return egl10.eglCreateContext(eGLDisplay, eGLConfig, bVar.f169321c, new int[]{12440, bVar.f169322d, 12344});
    }

    public final void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
        if (!egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
            throw new RuntimeException("eglDestroyContext failed");
        }
    }
}
