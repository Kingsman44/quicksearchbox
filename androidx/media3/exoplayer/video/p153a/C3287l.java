package androidx.media3.exoplayer.video.p153a;

import android.graphics.SurfaceTexture;

/* renamed from: androidx.media3.exoplayer.video.a.l */
/* compiled from: PG */
public final /* synthetic */ class C3287l implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a */
    public final /* synthetic */ C3288m f9878a;

    public /* synthetic */ C3287l(C3288m mVar) {
        this.f9878a = mVar;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f9878a.f9879a.set(true);
    }
}
