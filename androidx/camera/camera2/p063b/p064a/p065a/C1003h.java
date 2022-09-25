package androidx.camera.camera2.p063b.p064a.p065a;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.camera2.b.a.a.h */
/* compiled from: PG */
class C1003h extends C1001f {
    public C1003h(Object obj) {
        super(obj);
    }

    /* renamed from: b */
    public Object mo3765b() {
        C1974i.m5313a(false);
        C1002g gVar = (C1002g) this.f3148a;
        throw null;
    }

    /* renamed from: c */
    public final void mo3768c(Surface surface) {
        ((OutputConfiguration) mo3765b()).addSurface(surface);
    }

    /* renamed from: d */
    public final void mo3769d() {
        ((OutputConfiguration) mo3765b()).enableSurfaceSharing();
    }
}
