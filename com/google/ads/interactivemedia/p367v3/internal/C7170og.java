package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.og */
/* compiled from: PG */
public final class C7170og implements C7171oh {

    /* renamed from: a */
    private final List f23238a;

    /* renamed from: b */
    private final C7073kr[] f23239b;

    /* renamed from: c */
    private boolean f23240c;

    /* renamed from: d */
    private int f23241d;

    /* renamed from: e */
    private int f23242e;

    /* renamed from: f */
    private long f23243f;

    public C7170og(List list) {
        this.f23238a = list;
        this.f23239b = new C7073kr[list.size()];
    }

    /* renamed from: f */
    private final boolean m21345f(aee aee, int i) {
        if (aee.mo14550d() == 0) {
            return false;
        }
        if (aee.mo14560n() != i) {
            this.f23240c = false;
        }
        this.f23241d--;
        return this.f23240c;
    }

    /* renamed from: a */
    public final void mo16215a() {
        this.f23240c = false;
    }

    /* renamed from: b */
    public final void mo16216b(C7056ka kaVar, C7207pq pqVar) {
        for (int i = 0; i < this.f23239b.length; i++) {
            C7204pn pnVar = (C7204pn) this.f23238a.get(i);
            pqVar.mo16278a();
            C7073kr ak = kaVar.mo16113ak(pqVar.mo16279b(), 3);
            C6863cx cxVar = new C6863cx();
            cxVar.mo15617S(pqVar.mo16280c());
            cxVar.mo15630ae("application/dvbsubs");
            cxVar.mo15618T(Collections.singletonList(pnVar.f23513b));
            cxVar.mo15620V(pnVar.f23512a);
            ak.mo16102a(cxVar.mo15625a());
            this.f23239b[i] = ak;
        }
    }

    /* renamed from: c */
    public final void mo16217c(long j, int i) {
        if ((i & 4) != 0) {
            this.f23240c = true;
            this.f23243f = j;
            this.f23242e = 0;
            this.f23241d = 2;
        }
    }

    /* renamed from: d */
    public final void mo16218d(aee aee) {
        if (!this.f23240c) {
            return;
        }
        if (this.f23241d != 2 || m21345f(aee, 32)) {
            if (this.f23241d != 1 || m21345f(aee, 0)) {
                int g = aee.mo14553g();
                int d = aee.mo14550d();
                for (C7073kr d2 : this.f23239b) {
                    aee.mo14554h(g);
                    d2.mo16105d(aee, d);
                }
                this.f23242e += d;
            }
        }
    }

    /* renamed from: e */
    public final void mo16219e() {
        if (this.f23240c) {
            for (C7073kr b : this.f23239b) {
                b.mo16103b(this.f23243f, 1, this.f23242e, 0, (C7072kq) null);
            }
            this.f23240c = false;
        }
    }
}
