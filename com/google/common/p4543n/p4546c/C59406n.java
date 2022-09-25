package com.google.common.p4543n.p4546c;

import com.google.common.base.C58830au;
import java.util.Arrays;

/* renamed from: com.google.common.n.c.n */
/* compiled from: PG */
public final class C59406n extends C59407o {

    /* renamed from: a */
    private final long f157617a;

    /* renamed from: b */
    private final long f157618b;

    public C59406n(long j, long j2) {
        C59407o.m92311h(j, "delayMillis");
        this.f157617a = j;
        C59407o.m92313j(j2, "totalMillis");
        this.f157618b = j2;
    }

    /* renamed from: a */
    public final long mo56909a(int i) {
        long j;
        long j2 = this.f157617a;
        long j3 = (long) i;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(j2 ^ -1) + Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(-1 ^ j3);
        if (numberOfLeadingZeros > 65) {
            j = j2 * j3;
        } else {
            long j4 = ((j2 ^ j3) >>> 63) + Long.MAX_VALUE;
            if (numberOfLeadingZeros >= 64) {
                long j5 = j2 * j3;
                if (j2 == 0 || j5 / j2 == j3) {
                    j = j5;
                }
            }
            j = j4;
        }
        return mo56917c(i, j);
    }

    /* renamed from: c */
    public final long mo56917c(int i, long j) {
        C59407o.m92310g(i);
        C59407o.m92311h(j, "elapsedMillis");
        if (i == 0) {
            return 0;
        }
        long j2 = this.f157618b - j;
        if (j2 <= 0) {
            return -1;
        }
        return Math.min(j2, this.f157617a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C59406n) {
            C59406n nVar = (C59406n) obj;
            if (this.f157617a == nVar.f157617a && this.f157618b == nVar.f157618b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f157617a), Long.valueOf(this.f157618b)});
    }

    public final String toString() {
        C58830au auVar = new C58830au("timed");
        auVar.mo56103c("delayMs", String.valueOf(this.f157617a));
        auVar.mo56103c("totalMs", String.valueOf(this.f157618b));
        return auVar.toString();
    }
}
