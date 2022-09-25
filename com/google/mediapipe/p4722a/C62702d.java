package com.google.mediapipe.p4722a;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;

/* renamed from: com.google.mediapipe.a.d */
/* compiled from: PG */
public final /* synthetic */ class C62702d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C62707i f169282a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f169283b;

    /* renamed from: c */
    public final /* synthetic */ int f169284c;

    /* renamed from: d */
    public final /* synthetic */ int f169285d;

    public /* synthetic */ C62702d(C62707i iVar, SurfaceTexture surfaceTexture, int i, int i2) {
        this.f169282a = iVar;
        this.f169283b = surfaceTexture;
        this.f169284c = i;
        this.f169285d = i2;
    }

    public final void run() {
        C62707i iVar = this.f169282a;
        SurfaceTexture surfaceTexture = this.f169283b;
        int i = this.f169284c;
        int i2 = this.f169285d;
        C62706h hVar = iVar.f169304a;
        hVar.mo58589f(surfaceTexture, i, i2);
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        hVar.f169290a.attachToGLContext(iArr[0]);
    }
}
