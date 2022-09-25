package com.google.android.libraries.p579ar.faceviewer.p580a.p585e;

import android.util.Size;
import android.view.SurfaceHolder;
import com.google.mediapipe.p4722a.C62708j;

/* renamed from: com.google.android.libraries.ar.faceviewer.a.e.af */
/* compiled from: PG */
final class C10585af implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ C10587ah f35406a;

    public C10585af(C10587ah ahVar) {
        this.f35406a = ahVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Size a = this.f35406a.f35411e.mo18649a(new Size(i2, i3));
        C62708j jVar = this.f35406a.f35409c;
        int width = a.getWidth();
        int height = a.getHeight();
        jVar.f169306a = width;
        jVar.f169307b = height;
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }
}
