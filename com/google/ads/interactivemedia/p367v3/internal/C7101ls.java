package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ls */
/* compiled from: PG */
final class C7101ls {

    /* renamed from: a */
    private final aee f22862a = new aee(8);

    /* renamed from: b */
    private int f22863b;

    /* renamed from: b */
    private final long m21076b(C7050jv jvVar) {
        int i = 0;
        jvVar.mo16094g(this.f22862a.mo14555i(), 0, 1);
        byte b = this.f22862a.mo14555i()[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        jvVar.mo16094g(this.f22862a.mo14555i(), 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f22862a.mo14555i()[i] & 255) + (i4 << 8);
        }
        this.f22863b += i3 + 1;
        return (long) i4;
    }

    /* renamed from: a */
    public final boolean mo16161a(C7050jv jvVar) {
        long m = jvVar.mo16100m();
        long j = 1024;
        if (m != -1 && m <= 1024) {
            j = m;
        }
        int i = (int) j;
        jvVar.mo16094g(this.f22862a.mo14555i(), 0, 4);
        long t = this.f22862a.mo14566t();
        this.f22863b = 4;
        while (t != 440786851) {
            int i2 = this.f22863b + 1;
            this.f22863b = i2;
            if (i2 == i) {
                return false;
            }
            jvVar.mo16094g(this.f22862a.mo14555i(), 0, 1);
            t = ((t << 8) & -256) | ((long) (this.f22862a.mo14555i()[0] & 255));
        }
        long b = m21076b(jvVar);
        long j2 = (long) this.f22863b;
        if (b != Long.MIN_VALUE && (m == -1 || j2 + b < m)) {
            while (true) {
                long j3 = (long) this.f22863b;
                long j4 = j2 + b;
                if (j3 < j4) {
                    if (m21076b(jvVar) == Long.MIN_VALUE) {
                        return false;
                    }
                    long b2 = m21076b(jvVar);
                    if (b2 < 0) {
                        return false;
                    }
                    if (b2 != 0) {
                        int i3 = (int) b2;
                        jvVar.mo16096i(i3);
                        this.f22863b += i3;
                    }
                } else if (j3 == j4) {
                    return true;
                }
            }
        }
        return false;
    }
}
