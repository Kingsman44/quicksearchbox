package androidx.work.impl.utils.p209a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: androidx.work.impl.utils.a.m */
/* compiled from: PG */
public final class C4579m extends C4577k {
    /* renamed from: e */
    public final void mo9537e(Object obj) {
        if (obj == null) {
            obj = C4577k.f14442c;
        }
        if (C4577k.f14441b.mo9525d(this, (Object) null, obj)) {
            C4577k.m12973c(this);
        }
    }

    /* renamed from: f */
    public final void mo9538f(Throwable th) {
        if (C4577k.f14441b.mo9525d(this, (Object) null, new C4570d(th))) {
            C4577k.m12973c(this);
        }
    }

    /* renamed from: g */
    public final void mo9539g(C60870cx cxVar) {
        C4574h hVar;
        C4570d dVar;
        cxVar.getClass();
        Object obj = this.f14444d;
        if (obj == null) {
            if (cxVar.isDone()) {
                if (C4577k.f14441b.mo9525d(this, (Object) null, C4577k.m12972a(cxVar))) {
                    C4577k.m12973c(this);
                    return;
                }
                return;
            }
            hVar = new C4574h(this, cxVar);
            if (C4577k.f14441b.mo9525d(this, (Object) null, hVar)) {
                try {
                    cxVar.mo4106b(hVar, C4578l.f14447a);
                    return;
                } catch (Throwable unused) {
                    dVar = C4570d.f14424a;
                }
            } else {
                obj = this.f14444d;
            }
        }
        if (obj instanceof C4568b) {
            cxVar.cancel(((C4568b) obj).f14422c);
            return;
        }
        return;
        C4577k.f14441b.mo9525d(this, hVar, dVar);
    }
}
