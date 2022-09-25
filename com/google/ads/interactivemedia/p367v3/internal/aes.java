package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aes */
/* compiled from: PG */
public final class aes {

    /* renamed from: a */
    private long f20462a;

    /* renamed from: b */
    private long f20463b;

    /* renamed from: c */
    private volatile long f20464c = -9223372036854775807L;

    public aes(long j) {
        mo14597a(j);
    }

    /* renamed from: i */
    public static long m18473i(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: j */
    public static long m18474j(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public final synchronized void mo14597a(long j) {
        ary.m19464q(this.f20464c == -9223372036854775807L);
        this.f20462a = j;
    }

    /* renamed from: b */
    public final long mo14598b() {
        return this.f20462a;
    }

    /* renamed from: c */
    public final long mo14599c() {
        if (this.f20464c != -9223372036854775807L) {
            return this.f20463b + this.f20464c;
        }
        long j = this.f20462a;
        if (j == Long.MAX_VALUE) {
            return -9223372036854775807L;
        }
        return j;
    }

    /* renamed from: d */
    public final long mo14600d() {
        if (this.f20462a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f20464c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f20463b;
    }

    /* renamed from: e */
    public final void mo14601e() {
        this.f20464c = -9223372036854775807L;
    }

    /* renamed from: f */
    public final long mo14602f(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f20464c != -9223372036854775807L) {
            long j2 = m18474j(this.f20464c);
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((-1 + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return mo14603g(m18473i(j));
    }

    /* renamed from: g */
    public final long mo14603g(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f20464c != -9223372036854775807L) {
            this.f20464c = j;
        } else {
            long j2 = this.f20462a;
            if (j2 != Long.MAX_VALUE) {
                this.f20463b = j2 - j;
            }
            synchronized (this) {
                this.f20464c = j;
                notifyAll();
            }
        }
        return j + this.f20463b;
    }

    /* renamed from: h */
    public final synchronized void mo14604h() {
        while (this.f20464c == -9223372036854775807L) {
            wait();
        }
    }
}
