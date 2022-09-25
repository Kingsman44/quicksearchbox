package com.google.common.p4535g;

/* renamed from: com.google.common.g.an */
/* compiled from: PG */
public final class C59121an {
    /* renamed from: a */
    public static C59129av m91580a(C59129av avVar) {
        if (avVar.f157134a.mo56592h()) {
            return avVar;
        }
        double d = 3.141592653589793d;
        double max = Math.max(C59203do.f157270a, (3.141592653589793d - avVar.f157135b.mo56625a()) - (C59222p.f157311c * 2.5d));
        C59214h hVar = avVar.f157134a;
        double max2 = Math.max(hVar.f157289a, -hVar.f157290b);
        C59214h hVar2 = avVar.f157134a;
        double d2 = hVar2.f157289a + 1.5707963267948966d;
        double d3 = 1.5707963267948966d - hVar2.f157290b;
        if (max2 >= C59203do.f157270a) {
            if (max2 + max2 + max < 1.354E-15d) {
                return C59129av.m91623h();
            }
        } else if (max >= 1.5707963267948966d) {
            if (d2 + d3 < 1.687E-15d) {
                return C59129av.m91623h();
            }
        } else if (Math.max(d2, d3) * max < 1.765E-15d) {
            return C59129av.m91623h();
        }
        double d4 = C59222p.f157311c * 9.0d;
        if (max > C59203do.f157270a) {
            d = 0.0d;
        }
        return avVar.mo56464f(new C59127at(d4, d)).mo56465i();
    }
}
