package com.google.common.p4535g;

import java.io.IOException;

/* renamed from: com.google.common.g.av */
/* compiled from: PG */
public final class C59129av extends C59130aw {
    public C59129av(C59214h hVar, C59220n nVar) {
        super(hVar, nVar);
    }

    /* renamed from: c */
    public static C59214h m91620c() {
        return new C59214h(-1.5707963267948966d, 1.5707963267948966d);
    }

    /* renamed from: d */
    public static C59129av m91621d(C59188d dVar) {
        byte a = C59161c.m91744a(dVar.f157256a);
        if (a == 1) {
            C59129av avVar = new C59129av(new C59214h(Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a))), new C59220n(Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a)), Double.longBitsToDouble(C59188d.m91800b(dVar.f157256a))));
            if (Math.abs(avVar.f157134a.f157289a) <= 1.5707963267948966d && Math.abs(avVar.f157134a.f157290b) <= 1.5707963267948966d) {
                C59220n nVar = avVar.f157135b;
                if (Math.abs(nVar.f157306a) <= 3.141592653589793d && Math.abs(nVar.f157307b) <= 3.141592653589793d) {
                    double d = nVar.f157306a;
                    if ((d != -3.141592653589793d || nVar.f157307b == 3.141592653589793d) && ((nVar.f157307b != -3.141592653589793d || d == 3.141592653589793d) && avVar.f157134a.mo56592h() == avVar.f157135b.mo56635l())) {
                        return avVar;
                    }
                }
            }
            throw new IOException("Decoded S2LatLngRect is invalid.");
        }
        throw new IOException("Unsupported S2LatLngRect encoding version " + a);
    }

    /* renamed from: e */
    public static C59129av m91622e() {
        return new C59129av(C59214h.m91849b(), C59220n.m91881c());
    }

    /* renamed from: h */
    public static C59129av m91623h() {
        return new C59129av(m91620c(), C59220n.m91882d());
    }

    /* renamed from: a */
    public final C59214h mo56458a() {
        return this.f157134a;
    }

    /* renamed from: b */
    public final C59220n mo56459b() {
        return this.f157135b;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        return new C59129av(mo56473n(), mo56472m());
    }

    /* renamed from: f */
    public final C59129av mo56464f(C59127at atVar) {
        C59214h c = this.f157134a.mo56587c(new C59218l(atVar.f157132a).f157299c);
        C59214h c2 = m91620c();
        C59214h hVar = new C59214h(Math.max(c.f157289a, c2.f157289a), Math.min(c.f157290b, c2.f157290b));
        C59220n nVar = this.f157135b;
        double d = new C59218l(atVar.f157133b).f157299c;
        C59220n nVar2 = new C59220n(nVar);
        if (d >= C59203do.f157270a) {
            if (!nVar2.mo56635l()) {
                double a = nVar2.mo56625a();
                double d2 = C59222p.f157311c;
                if (a + d + d + d2 + d2 >= 6.283185307179586d) {
                    nVar2.mo56630h();
                }
            }
            return new C59129av(hVar, nVar2);
        }
        if (!nVar2.mo56636m()) {
            double a2 = nVar2.mo56625a();
            double d3 = C59222p.f157311c;
            if ((a2 + (d + d)) - (d3 + d3) <= C59203do.f157270a) {
                nVar2.mo56629g();
            }
        }
        return new C59129av(hVar, nVar2);
        nVar2.mo56628f(Math.IEEEremainder(nVar2.f157306a - d, 6.283185307179586d), Math.IEEEremainder(nVar2.f157307b + d, 6.283185307179586d), false);
        if (nVar2.f157306a <= -3.141592653589793d) {
            nVar2.f157306a = 3.141592653589793d;
        }
        return new C59129av(hVar, nVar2);
    }

    /* renamed from: i */
    public final C59129av mo56465i() {
        C59214h hVar = this.f157134a;
        return (hVar.f157289a == -1.5707963267948966d || hVar.f157290b == 1.5707963267948966d) ? new C59129av(hVar, C59220n.m91882d()) : this;
    }

    public C59129av(C59127at atVar, C59127at atVar2) {
        super(atVar, atVar2);
    }
}
