package com.google.android.filament.p10722a;

import android.view.SurfaceHolder;

/* renamed from: com.google.android.filament.a.a */
/* compiled from: PG */
public final class C142630a implements SurfaceHolder.Callback {

    /* renamed from: a */
    final /* synthetic */ C142635f f386961a;

    public C142630a(C142635f fVar) {
        this.f386961a = fVar;
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f386961a.f386973g.mo53130a(i2, i3);
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f386961a.mo117334a(surfaceHolder.getSurface());
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f386961a.mo117335b();
    }
}
