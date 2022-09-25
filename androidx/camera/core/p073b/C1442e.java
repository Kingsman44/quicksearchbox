package androidx.camera.core.p073b;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.core.C1505ci;
import androidx.camera.core.C1547dx;
import androidx.camera.core.p069a.p070a.p071a.C1238a;

/* renamed from: androidx.camera.core.b.e */
/* compiled from: PG */
public final /* synthetic */ class C1442e implements C1505ci {

    /* renamed from: a */
    public static final /* synthetic */ C1442e f3999a = new C1442e();

    private /* synthetic */ C1442e() {
    }

    /* renamed from: a */
    public final void mo4335a(C1547dx dxVar) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(dxVar.f4251b.getWidth(), dxVar.f4251b.getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        dxVar.mo4409a(surface, C1238a.m3410a(), new C1441d(surface, surfaceTexture));
    }
}
