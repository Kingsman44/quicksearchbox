package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.oy */
/* compiled from: PG */
final class C7188oy implements C7046jr {

    /* renamed from: a */
    private final aes f23427a;

    /* renamed from: b */
    private final aee f23428b = new aee();

    public /* synthetic */ C7188oy(aes aes) {
        this.f23427a = aes;
    }

    /* renamed from: a */
    public final void mo16079a() {
        this.f23428b.mo14548b(aeu.f20471f);
    }

    /* renamed from: b */
    public final C7045jq mo16080b(C7050jv jvVar, long j) {
        int h;
        long l = jvVar.mo16099l();
        int min = (int) Math.min(20000, jvVar.mo16100m() - l);
        this.f23428b.mo14547a(min);
        jvVar.mo16094g(this.f23428b.mo14555i(), 0, min);
        aee aee = this.f23428b;
        int i = -1;
        long j2 = -9223372036854775807L;
        int i2 = -1;
        while (aee.mo14550d() >= 4) {
            if (C7198ph.m21468h(aee.mo14555i(), aee.mo14553g()) != 442) {
                aee.mo14557k(1);
            } else {
                aee.mo14557k(4);
                long d = C7189oz.m21436d(aee);
                if (d != -9223372036854775807L) {
                    long f = this.f23427a.mo14602f(d);
                    if (f > j) {
                        return j2 == -9223372036854775807L ? C7045jq.m20877a(f, l) : C7045jq.m20879c(l + ((long) i2));
                    }
                    if (100000 + f > j) {
                        return C7045jq.m20879c(l + ((long) aee.mo14553g()));
                    }
                    i2 = aee.mo14553g();
                    j2 = f;
                }
                int e = aee.mo14551e();
                if (aee.mo14550d() >= 10) {
                    aee.mo14557k(9);
                    int n = aee.mo14560n() & 7;
                    if (aee.mo14550d() >= n) {
                        aee.mo14557k(n);
                        if (aee.mo14550d() >= 4) {
                            if (C7198ph.m21468h(aee.mo14555i(), aee.mo14553g()) == 443) {
                                aee.mo14557k(4);
                                int o = aee.mo14561o();
                                if (aee.mo14550d() < o) {
                                    aee.mo14554h(e);
                                } else {
                                    aee.mo14557k(o);
                                }
                            }
                            while (true) {
                                if (aee.mo14550d() < 4 || (h = C7198ph.m21468h(aee.mo14555i(), aee.mo14553g())) == 442 || h == 441 || (h >>> 8) != 1) {
                                    break;
                                }
                                aee.mo14557k(4);
                                if (aee.mo14550d() < 2) {
                                    aee.mo14554h(e);
                                    break;
                                }
                                aee.mo14554h(Math.min(aee.mo14551e(), aee.mo14553g() + aee.mo14561o()));
                            }
                        } else {
                            aee.mo14554h(e);
                        }
                    } else {
                        aee.mo14554h(e);
                    }
                } else {
                    aee.mo14554h(e);
                }
                i = aee.mo14553g();
            }
        }
        return j2 != -9223372036854775807L ? C7045jq.m20878b(j2, l + ((long) i)) : C7045jq.f22558a;
    }
}
