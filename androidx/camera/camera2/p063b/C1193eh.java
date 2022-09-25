package androidx.camera.camera2.p063b;

import androidx.camera.camera2.p063b.p064a.C1068k;
import androidx.camera.camera2.p063b.p064a.p066b.C1027l;
import androidx.camera.camera2.p063b.p064a.p066b.C1031p;
import androidx.camera.camera2.p063b.p064a.p067c.C1047e;
import androidx.camera.core.C1477bw;
import androidx.camera.core.C1564n;
import androidx.camera.core.p069a.p070a.C1285p;
import androidx.lifecycle.C2332ag;
import androidx.p104d.p105a.C2164c;

/* renamed from: androidx.camera.camera2.b.eh */
/* compiled from: PG */
final class C1193eh {

    /* renamed from: a */
    public final C1217t f3507a;

    /* renamed from: b */
    public final C2332ag f3508b;

    /* renamed from: c */
    public boolean f3509c;

    /* renamed from: d */
    C2164c f3510d;

    /* renamed from: e */
    boolean f3511e;

    /* renamed from: f */
    private final boolean f3512f;

    public C1193eh(C1217t tVar, C1068k kVar) {
        boolean z;
        this.f3507a = tVar;
        if (C1027l.f3156a.mo4225a(C1031p.class) != null) {
            C1477bw.m3978a("FlashAvailability", "Device has quirk " + C1031p.class.getSimpleName() + ". Checking for flash availability safely...");
            z = C1047e.m3034b(kVar);
        } else {
            z = C1047e.m3033a(kVar);
        }
        this.f3512f = z;
        this.f3508b = new C2332ag(0);
        tVar.f3562a.mo4029a(new C1192eg(this));
    }

    /* renamed from: b */
    public static final void m3340b(C2332ag agVar, Object obj) {
        if (C1285p.m3463b()) {
            agVar.mo5708l(obj);
        } else {
            agVar.mo5706i(obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo4015a(C2164c cVar, boolean z) {
        if (!this.f3512f) {
            if (cVar != null) {
                cVar.mo5439d(new IllegalStateException("No flash unit"));
            }
        } else if (!this.f3509c) {
            m3340b(this.f3508b, 0);
            if (cVar != null) {
                cVar.mo5439d(new C1564n("Camera is not active."));
            }
        } else {
            this.f3511e = z;
            this.f3507a.mo4041j(z);
            m3340b(this.f3508b, Integer.valueOf(z ? 1 : 0));
            C2164c cVar2 = this.f3510d;
            if (cVar2 != null) {
                cVar2.mo5439d(new C1564n("There is a new enableTorch being set"));
            }
            this.f3510d = cVar;
        }
    }
}
