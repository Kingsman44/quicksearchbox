package androidx.camera.camera2.p068c;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.p062a.C0989b;
import androidx.camera.core.C1412am;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1338by;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;

/* renamed from: androidx.camera.camera2.c.i */
/* compiled from: PG */
public final class C1233i implements C1412am {

    /* renamed from: a */
    public final C1339bz f3623a = C1339bz.m3625g();

    /* renamed from: a */
    public static C1233i m3390a(C1308av avVar) {
        C1233i iVar = new C1233i();
        avVar.mo3961k(new C1232h(iVar, avVar));
        return iVar;
    }

    /* renamed from: b */
    public final C1338by mo3737b() {
        throw null;
    }

    /* renamed from: c */
    public final C1234j mo4062c() {
        return new C1234j(C1343cc.m3633m(this.f3623a));
    }

    /* renamed from: d */
    public final void mo4063d(CaptureRequest.Key key, Object obj) {
        this.f3623a.mo4216c(C0989b.m2990e(key), C1339bz.f3819a, obj);
    }
}
