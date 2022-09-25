package com.google.android.filament.p10722a;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;

/* renamed from: com.google.android.filament.a.b */
/* compiled from: PG */
public final class C142631b implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    final /* synthetic */ C142635f f386962a;

    public C142631b(C142635f fVar) {
        this.f386962a = fVar;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        C142635f fVar = this.f386962a;
        int i4 = fVar.f386967a;
        if (i4 > 0 && (i3 = fVar.f386968b) > 0) {
            surfaceTexture.setDefaultBufferSize(i4, i3);
        }
        Surface surface = new Surface(surfaceTexture);
        ((C142634e) this.f386962a.f386971e).mo117333c(surface);
        this.f386962a.mo117334a(surface);
        this.f386962a.f386973g.mo53130a(i, i2);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f386962a.mo117335b();
        return true;
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        int i3;
        C142635f fVar = this.f386962a;
        int i4 = fVar.f386967a;
        if (i4 <= 0 || (i3 = fVar.f386968b) <= 0) {
            fVar.f386973g.mo53130a(i, i2);
            return;
        }
        surfaceTexture.setDefaultBufferSize(i4, i3);
        C142635f fVar2 = this.f386962a;
        fVar2.f386973g.mo53130a(fVar2.f386967a, fVar2.f386968b);
    }
}
