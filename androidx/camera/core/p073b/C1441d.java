package androidx.camera.core.p073b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.C1545dv;
import androidx.core.p097i.C1967b;

/* renamed from: androidx.camera.core.b.d */
/* compiled from: PG */
public final /* synthetic */ class C1441d implements C1967b {

    /* renamed from: a */
    public final /* synthetic */ Surface f3997a;

    /* renamed from: b */
    public final /* synthetic */ SurfaceTexture f3998b;

    public /* synthetic */ C1441d(Surface surface, SurfaceTexture surfaceTexture) {
        this.f3997a = surface;
        this.f3998b = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo3353a(Object obj) {
        Surface surface = this.f3997a;
        SurfaceTexture surfaceTexture = this.f3998b;
        C1545dv dvVar = (C1545dv) obj;
        surface.release();
        surfaceTexture.release();
    }
}
