package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.jo */
/* compiled from: PG */
public final class C7043jo {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f22550a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f22551b;

    /* renamed from: c */
    private final long f22552c;

    /* renamed from: d */
    private long f22553d = 0;

    /* renamed from: e */
    private long f22554e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f22555f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f22556g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f22557h;

    protected C7043jo(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f22550a = j;
        long j8 = j2;
        this.f22551b = j8;
        long j9 = j4;
        this.f22554e = j9;
        long j10 = j5;
        this.f22555f = j10;
        long j11 = j6;
        this.f22556g = j11;
        long j12 = j7;
        this.f22552c = j12;
        this.f22557h = m20867a(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: a */
    protected static long m20867a(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return aeu.m18491I(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* synthetic */ void m20873g(C7043jo joVar, long j, long j2) {
        joVar.f22554e = j;
        joVar.f22556g = j2;
        joVar.m20875i();
    }

    /* renamed from: h */
    static /* synthetic */ void m20874h(C7043jo joVar, long j, long j2) {
        joVar.f22553d = j;
        joVar.f22555f = j2;
        joVar.m20875i();
    }

    /* renamed from: i */
    private final void m20875i() {
        this.f22557h = m20867a(this.f22551b, this.f22553d, this.f22554e, this.f22555f, this.f22556g, this.f22552c);
    }
}
