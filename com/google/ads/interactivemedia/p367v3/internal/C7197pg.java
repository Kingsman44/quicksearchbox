package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pg */
/* compiled from: PG */
final class C7197pg implements C7046jr {

    /* renamed from: a */
    private final aes f23470a;

    /* renamed from: b */
    private final aee f23471b = new aee();

    /* renamed from: c */
    private final int f23472c;

    /* renamed from: d */
    private final int f23473d;

    public C7197pg(int i, aes aes, int i2) {
        this.f23472c = i;
        this.f23470a = aes;
        this.f23473d = i2;
    }

    /* renamed from: a */
    public final void mo16079a() {
        this.f23471b.mo14548b(aeu.f20471f);
    }

    /* renamed from: b */
    public final C7045jq mo16080b(C7050jv jvVar, long j) {
        int f;
        int i;
        long j2;
        long l = jvVar.mo16099l();
        int min = (int) Math.min((long) this.f23473d, jvVar.mo16100m() - l);
        this.f23471b.mo14547a(min);
        jvVar.mo16094g(this.f23471b.mo14555i(), 0, min);
        aee aee = this.f23471b;
        int e = aee.mo14551e();
        long j3 = -1;
        long j4 = -1;
        long j5 = -9223372036854775807L;
        while (aee.mo14550d() >= 188 && (i = f + 188) <= e) {
            long g = C7135mz.m21204g(aee, (f = C7135mz.m21203f(aee.mo14555i(), aee.mo14553g(), e)), this.f23472c);
            if (g != -9223372036854775807L) {
                long f2 = this.f23470a.mo14602f(g);
                if (f2 > j) {
                    if (j5 == -9223372036854775807L) {
                        return C7045jq.m20877a(f2, l);
                    }
                    j2 = l + j4;
                } else if (100000 + f2 > j) {
                    j2 = l + ((long) f);
                } else {
                    j4 = (long) f;
                    j5 = f2;
                }
                return C7045jq.m20879c(j2);
            }
            aee.mo14554h(i);
            j3 = (long) i;
        }
        return j5 != -9223372036854775807L ? C7045jq.m20878b(j5, l + j3) : C7045jq.f22558a;
    }
}
