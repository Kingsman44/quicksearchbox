package androidx.media3.exoplayer;

import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2612ak;

/* renamed from: androidx.media3.exoplayer.cz */
/* compiled from: PG */
public final class C2897cz {

    /* renamed from: a */
    public static final C2897cz f8202a;

    /* renamed from: b */
    public static final C2897cz f8203b;

    /* renamed from: c */
    public final long f8204c;

    /* renamed from: d */
    public final long f8205d;

    static {
        C2897cz czVar = new C2897cz(0, 0);
        f8202a = czVar;
        new C2897cz(Long.MAX_VALUE, Long.MAX_VALUE);
        new C2897cz(Long.MAX_VALUE, 0);
        new C2897cz(0, Long.MAX_VALUE);
        f8203b = czVar;
    }

    public C2897cz(long j, long j2) {
        boolean z = true;
        C2601a.m6830b(j >= 0);
        C2601a.m6830b(j2 < 0 ? false : z);
        this.f8204c = j;
        this.f8205d = j2;
    }

    /* renamed from: a */
    public final long mo6705a(long j, long j2, long j3) {
        long j4 = this.f8204c;
        if (j4 == 0) {
            if (this.f8205d == 0) {
                return j;
            }
            j4 = 0;
        }
        long aC = C2612ak.m6947aC(j, j4);
        long at = C2612ak.m6970at(j, this.f8205d);
        boolean z = true;
        boolean z2 = aC <= j2 && j2 <= at;
        if (aC > j3 || j3 > at) {
            z = false;
        }
        if (z2 && z) {
            return Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3;
        }
        if (z2) {
            return j2;
        }
        return z ? j3 : aC;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C2897cz czVar = (C2897cz) obj;
            return this.f8204c == czVar.f8204c && this.f8205d == czVar.f8205d;
        }
    }

    public final int hashCode() {
        return (((int) this.f8204c) * 31) + ((int) this.f8205d);
    }
}
