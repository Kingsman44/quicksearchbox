package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.p063b.p064a.C0995a;
import androidx.camera.core.p069a.p070a.p072b.C1255d;

/* renamed from: androidx.camera.camera2.b.ad */
/* compiled from: PG */
final class C1081ad implements C1255d {

    /* renamed from: a */
    final /* synthetic */ C1148cq f3223a;

    /* renamed from: b */
    final /* synthetic */ C1091an f3224b;

    public C1081ad(C1091an anVar, C1148cq cqVar) {
        this.f3224b = anVar;
        this.f3223a = cqVar;
    }

    /* renamed from: a */
    public final void mo3794a(Throwable th) {
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo3795b(Object obj) {
        CameraDevice cameraDevice;
        Void voidR = (Void) obj;
        this.f3224b.f3249h.remove(this.f3223a);
        int i = this.f3224b.f3253l;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 != 6) {
                        return;
                    }
                } else if (this.f3224b.f3247f == 0) {
                    return;
                }
            }
            if (this.f3224b.mo3837v() && (cameraDevice = this.f3224b.f3246e) != null) {
                C0995a.m3005a(cameraDevice);
                this.f3224b.f3246e = null;
                return;
            }
            return;
        }
        throw null;
    }
}
