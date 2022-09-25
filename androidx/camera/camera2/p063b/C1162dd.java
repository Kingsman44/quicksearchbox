package androidx.camera.camera2.p063b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.p069a.p070a.p072b.C1255d;

/* renamed from: androidx.camera.camera2.b.dd */
/* compiled from: PG */
final class C1162dd implements C1255d {

    /* renamed from: a */
    final /* synthetic */ Surface f3408a;

    /* renamed from: b */
    final /* synthetic */ SurfaceTexture f3409b;

    public C1162dd(Surface surface, SurfaceTexture surfaceTexture) {
        this.f3408a = surface;
        this.f3409b = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Void voidR = (Void) obj;
        this.f3408a.release();
        this.f3409b.release();
    }
}
