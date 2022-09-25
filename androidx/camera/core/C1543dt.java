package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.p069a.p070a.p072b.C1255d;
import androidx.core.p097i.C1967b;
import androidx.core.p097i.C1974i;

/* renamed from: androidx.camera.core.dt */
/* compiled from: PG */
final class C1543dt implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1967b f4248a;

    /* renamed from: b */
    final /* synthetic */ Surface f4249b;

    public C1543dt(C1967b bVar, Surface surface) {
        this.f4248a = bVar;
        this.f4249b = surface;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
        new StringBuilder("Camera surface session should only fail with request cancellation. Instead failed due to:\n").append(th);
        C1974i.m5315c(th instanceof C1544du, "Camera surface session should only fail with request cancellation. Instead failed due to:\n".concat(th.toString()));
        this.f4248a.mo3353a(new C1560j(1, this.f4249b));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        Void voidR = (Void) obj;
        this.f4248a.mo3353a(new C1560j(0, this.f4249b));
    }
}
