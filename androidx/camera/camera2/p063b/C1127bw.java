package androidx.camera.camera2.p063b;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.p062a.C0989b;
import androidx.camera.camera2.p062a.C0992e;
import androidx.camera.core.p069a.C1306at;
import androidx.camera.core.p069a.C1308av;
import androidx.camera.core.p069a.C1339bz;
import androidx.camera.core.p069a.C1343cc;
import androidx.camera.core.p069a.C1351ck;
import androidx.camera.core.p069a.C1353cm;
import androidx.camera.core.p069a.C1357cq;
import androidx.camera.core.p069a.C1373df;

/* renamed from: androidx.camera.camera2.b.bw */
/* compiled from: PG */
final class C1127bw implements C1353cm {

    /* renamed from: a */
    static final C1127bw f3341a = new C1127bw();

    /* renamed from: a */
    public final void mo3875a(C1373df dfVar, C1351ck ckVar) {
        C1357cq m = dfVar.mo3963m();
        C1308av avVar = C1343cc.f3824c;
        int i = C1357cq.m3705a().f3847f.f3751e;
        if (m != null) {
            i = m.f3847f.f3751e;
            for (CameraDevice.StateCallback d : m.f3843b) {
                ckVar.mo4229d(d);
            }
            for (CameraCaptureSession.StateCallback f : m.f3844c) {
                ckVar.mo4231f(f);
            }
            ckVar.f3832b.mo4158b(m.f3847f.f3752f);
            avVar = m.f3847f.f3750d;
        }
        ckVar.f3832b.f3741b = C1339bz.m3626l(avVar);
        C0989b bVar = new C0989b(dfVar);
        ckVar.f3832b.f3742c = bVar.mo3740a(i);
        ckVar.mo4229d((CameraDevice.StateCallback) bVar.f3624i.mo3954F(C0989b.f3134c, new C1134cc()));
        ckVar.mo4231f((CameraCaptureSession.StateCallback) bVar.f3624i.mo3954F(C0989b.f3135d, new C1132ca()));
        ckVar.mo4228c(new C1137cf(bVar.mo3741b(new C1096as())));
        C1339bz g = C1339bz.m3625g();
        g.mo4216c(C0989b.f3137f, C1339bz.f3819a, bVar.mo3742c(C0992e.m2996b()));
        g.mo4216c(C0989b.f3139h, C1339bz.f3819a, bVar.mo3744f());
        C1306at atVar = C0989b.f3133b;
        g.mo4216c(atVar, C1339bz.f3819a, Long.valueOf(((Long) bVar.f3624i.mo3954F(atVar, -1L)).longValue()));
        ckVar.f3832b.mo4161e(g);
        ckVar.f3832b.mo4161e(bVar.mo3743d());
    }
}
