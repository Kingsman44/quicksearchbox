package androidx.media3.common.p136b;

/* renamed from: androidx.media3.common.b.ah */
/* compiled from: PG */
public final class C2609ah {

    /* renamed from: a */
    private long f7244a;

    /* renamed from: b */
    private long f7245b;

    /* renamed from: c */
    private long f7246c;

    /* renamed from: d */
    private final ThreadLocal f7247d = new ThreadLocal();

    public C2609ah(long j) {
        mo6184h(j);
    }

    /* renamed from: f */
    public static long m6906f(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: g */
    public static long m6907g(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public final synchronized long mo6179a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f7245b == -9223372036854775807L) {
            long j2 = this.f7244a;
            if (j2 == 9223372036854775806L) {
                Long l = (Long) this.f7247d.get();
                l.getClass();
                j2 = l.longValue();
            }
            this.f7245b = j2 - j;
            notifyAll();
        }
        this.f7246c = j;
        return j + this.f7245b;
    }

    /* renamed from: b */
    public final synchronized long mo6180b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j2 = this.f7246c;
        if (j2 != -9223372036854775807L) {
            long g = m6907g(j2);
            long j3 = (4294967296L + g) / 8589934592L;
            long j4 = ((-1 + j3) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - g) < Math.abs(j - g)) {
                j = j4;
            }
        }
        return mo6179a(m6906f(j));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        return -9223372036854775807L;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo6181c() {
        /*
            r5 = this;
            monitor-enter(r5)
            long r0 = r5.f7244a     // Catch:{ all -> 0x001f }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0018
            r2 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0016
            goto L_0x0018
        L_0x0016:
            monitor-exit(r5)
            return r0
        L_0x0018:
            monitor-exit(r5)
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            return r0
        L_0x001f:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.p136b.C2609ah.mo6181c():long");
    }

    /* renamed from: d */
    public final synchronized long mo6182d() {
        long j;
        j = this.f7246c;
        return j != -9223372036854775807L ? j + this.f7245b : mo6181c();
    }

    /* renamed from: e */
    public final synchronized long mo6183e() {
        return this.f7245b;
    }

    /* renamed from: h */
    public final synchronized void mo6184h(long j) {
        this.f7244a = j;
        this.f7245b = j == Long.MAX_VALUE ? 0 : -9223372036854775807L;
        this.f7246c = -9223372036854775807L;
    }

    /* renamed from: i */
    public final synchronized void mo6185i(boolean z, long j) {
        C2601a.m6832d(this.f7244a == 9223372036854775806L);
        if (this.f7245b == -9223372036854775807L) {
            if (!z) {
                while (this.f7245b == -9223372036854775807L) {
                    wait();
                }
                return;
            }
            this.f7247d.set(Long.valueOf(j));
        }
    }
}
