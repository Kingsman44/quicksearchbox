package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.kf */
/* compiled from: PG */
public final class C7061kf implements C7070ko {

    /* renamed from: a */
    private final C7063kh f22600a;

    /* renamed from: b */
    private final long f22601b;

    public C7061kf(C7063kh khVar, long j) {
        this.f22600a = khVar;
        this.f22601b = j;
    }

    /* renamed from: d */
    private final C7071kp m20945d(long j, long j2) {
        return new C7071kp((j * 1000000) / ((long) this.f22600a.f22608e), this.f22601b + j2);
    }

    /* renamed from: a */
    public final boolean mo16074a() {
        return true;
    }

    /* renamed from: b */
    public final C7068km mo16075b(long j) {
        long j2;
        ary.m19466s(this.f22600a.f22614k);
        C7063kh khVar = this.f22600a;
        C7062kg kgVar = khVar.f22614k;
        long[] jArr = kgVar.f22602a;
        long[] jArr2 = kgVar.f22603b;
        int an = aeu.m18523an(jArr, khVar.mo16117b(j), false);
        long j3 = 0;
        if (an == -1) {
            j2 = 0;
        } else {
            j2 = jArr[an];
        }
        if (an != -1) {
            j3 = jArr2[an];
        }
        C7071kp d = m20945d(j2, j3);
        if (d.f22630b == j || an == jArr.length - 1) {
            return new C7068km(d, d);
        }
        int i = an + 1;
        return new C7068km(d, m20945d(jArr[i], jArr2[i]));
    }

    /* renamed from: c */
    public final long mo16076c() {
        return this.f22600a.mo16116a();
    }
}
