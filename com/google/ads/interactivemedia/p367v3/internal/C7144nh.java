package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.nh */
/* compiled from: PG */
final class C7144nh implements C7150nn {

    /* renamed from: a */
    private final C7063kh f23089a;

    /* renamed from: b */
    private final C7062kg f23090b;

    /* renamed from: c */
    private long f23091c = -1;

    /* renamed from: d */
    private long f23092d = -1;

    public C7144nh(C7063kh khVar, C7062kg kgVar) {
        this.f23089a = khVar;
        this.f23090b = kgVar;
    }

    /* renamed from: a */
    public final void mo16193a(long j) {
        long[] jArr = this.f23090b.f22602a;
        this.f23092d = jArr[aeu.m18523an(jArr, j, true)];
    }

    /* renamed from: b */
    public final C7070ko mo16194b() {
        ary.m19464q(this.f23091c != -1);
        return new C7061kf(this.f23089a, this.f23091c);
    }

    /* renamed from: c */
    public final void mo16196c(long j) {
        this.f23091c = j;
    }

    /* renamed from: g */
    public final long mo16195g(C7050jv jvVar) {
        long j = this.f23092d;
        if (j < 0) {
            return -1;
        }
        this.f23092d = -1;
        return -(j + 2);
    }
}
