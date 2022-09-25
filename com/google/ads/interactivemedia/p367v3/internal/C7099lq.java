package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.lq */
/* compiled from: PG */
final class C7099lq {

    /* renamed from: a */
    private final byte[] f22796a = new byte[10];

    /* renamed from: b */
    private boolean f22797b;

    /* renamed from: c */
    private int f22798c;

    /* renamed from: d */
    private long f22799d;

    /* renamed from: e */
    private int f22800e;

    /* renamed from: f */
    private int f22801f;

    /* renamed from: g */
    private int f22802g;

    /* renamed from: a */
    public final void mo16151a() {
        this.f22797b = false;
        this.f22798c = 0;
    }

    /* renamed from: b */
    public final void mo16152b(C7098lp lpVar, long j, int i, int i2, int i3) {
        if (this.f22797b) {
            int i4 = this.f22798c;
            int i5 = i4 + 1;
            this.f22798c = i5;
            if (i4 == 0) {
                this.f22799d = j;
                this.f22800e = i;
                this.f22801f = 0;
            }
            this.f22801f += i2;
            this.f22802g = i3;
            if (i5 >= 16) {
                mo16153c(lpVar);
            }
        }
    }

    /* renamed from: c */
    public final void mo16153c(C7098lp lpVar) {
        if (this.f22798c > 0) {
            lpVar.f22766V.mo16103b(this.f22799d, this.f22800e, this.f22801f, this.f22802g, lpVar.f22778i);
            this.f22798c = 0;
        }
    }

    /* renamed from: d */
    public final void mo16154d(C7050jv jvVar) {
        if (!this.f22797b) {
            jvVar.mo16094g(this.f22796a, 0, 10);
            jvVar.mo16097j();
            byte[] bArr = this.f22796a;
            int i = C6963gp.f22211a;
            if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111 && (bArr[7] & 254) == 186) {
                this.f22797b = true;
            }
        }
    }
}
