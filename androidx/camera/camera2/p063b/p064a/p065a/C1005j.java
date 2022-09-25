package androidx.camera.camera2.p063b.p064a.p065a;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.a.a.j */
/* compiled from: PG */
public final class C1005j extends C1004i {
    public C1005j(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    /* renamed from: f */
    public final void mo3771f(long j) {
        if (j != -1) {
            ((OutputConfiguration) this.f3148a).setStreamUseCase(j);
        }
    }

    public C1005j(Object obj) {
        super(obj);
    }
}
