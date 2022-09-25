package androidx.camera.camera2.p063b.p064a.p065a;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* renamed from: androidx.camera.camera2.b.a.a.i */
/* compiled from: PG */
class C1004i extends C1003h {
    public C1004i(int i, Surface surface) {
        super(new OutputConfiguration(i, surface));
    }

    /* renamed from: b */
    public final Object mo3765b() {
        return this.f3148a;
    }

    /* renamed from: e */
    public final void mo3770e(String str) {
        ((OutputConfiguration) this.f3148a).setPhysicalCameraId(str);
    }

    public C1004i(Object obj) {
        super(obj);
    }
}
