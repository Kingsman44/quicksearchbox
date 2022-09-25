package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kz */
/* compiled from: PG */
final class C7081kz implements C7046jr {

    /* renamed from: a */
    private final C7063kh f22671a;

    /* renamed from: b */
    private final int f22672b;

    /* renamed from: c */
    private final C7059kd f22673c = new C7059kd();

    public /* synthetic */ C7081kz(C7063kh khVar, int i) {
        this.f22671a = khVar;
        this.f22672b = i;
    }

    /* renamed from: c */
    private final long m20996c(C7050jv jvVar) {
        while (jvVar.mo16098k() < jvVar.mo16100m() - 6 && !asn.m19524k(jvVar, this.f22671a, this.f22672b, this.f22673c)) {
            jvVar.mo16096i(1);
        }
        if (jvVar.mo16098k() < jvVar.mo16100m() - 6) {
            return this.f22673c.f22598a;
        }
        jvVar.mo16096i((int) (jvVar.mo16100m() - jvVar.mo16098k()));
        return this.f22671a.f22613j;
    }

    /* renamed from: a */
    public final void mo16079a() {
    }

    /* renamed from: b */
    public final C7045jq mo16080b(C7050jv jvVar, long j) {
        long l = jvVar.mo16099l();
        long c = m20996c(jvVar);
        long k = jvVar.mo16098k();
        jvVar.mo16096i(Math.max(6, this.f22671a.f22606c));
        long c2 = m20996c(jvVar);
        long k2 = jvVar.mo16098k();
        if (c > j || c2 <= j) {
            return c2 <= j ? C7045jq.m20878b(c2, k2) : C7045jq.m20877a(c, l);
        }
        return C7045jq.m20879c(k);
    }
}
