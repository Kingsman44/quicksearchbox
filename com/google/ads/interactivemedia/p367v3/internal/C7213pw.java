package com.google.ads.interactivemedia.p367v3.internal;

/* renamed from: com.google.ads.interactivemedia.v3.internal.pw */
/* compiled from: PG */
final class C7213pw implements C7212pv {

    /* renamed from: a */
    private final C7056ka f23541a;

    /* renamed from: b */
    private final C7073kr f23542b;

    /* renamed from: c */
    private final C7215py f23543c;

    /* renamed from: d */
    private final C6864cy f23544d;

    /* renamed from: e */
    private final int f23545e;

    /* renamed from: f */
    private long f23546f;

    /* renamed from: g */
    private int f23547g;

    /* renamed from: h */
    private long f23548h;

    public C7213pw(C7056ka kaVar, C7073kr krVar, C7215py pyVar, String str, int i) {
        this.f23541a = kaVar;
        this.f23542b = krVar;
        this.f23543c = pyVar;
        int i2 = (pyVar.f23556b * pyVar.f23559e) / 8;
        int i3 = pyVar.f23558d;
        if (i3 == i2) {
            int i4 = pyVar.f23557c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f23545e = max;
            C6863cx cxVar = new C6863cx();
            cxVar.mo15630ae(str);
            cxVar.mo15605G(i5);
            cxVar.mo15624Z(i5);
            cxVar.mo15621W(max);
            cxVar.mo15606H(pyVar.f23556b);
            cxVar.mo15631af(pyVar.f23557c);
            cxVar.mo15623Y(i);
            this.f23544d = cxVar.mo15625a();
            return;
        }
        StringBuilder sb = new StringBuilder(50);
        sb.append("Expected block size: ");
        sb.append(i2);
        sb.append("; got: ");
        sb.append(i3);
        throw new C6886dt(sb.toString());
    }

    /* renamed from: a */
    public final void mo16283a(long j) {
        this.f23546f = j;
        this.f23547g = 0;
        this.f23548h = 0;
    }

    /* renamed from: b */
    public final void mo16284b(int i, long j) {
        this.f23541a.mo16115am(new C7219qb(this.f23543c, 1, (long) i, j));
        this.f23542b.mo16102a(this.f23544d);
    }

    /* renamed from: c */
    public final boolean mo16285c(C7050jv jvVar, long j) {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.f23547g) < (i2 = this.f23545e)) {
            int c = this.f23542b.mo16104c(jvVar, (int) Math.min((long) (i2 - i), j3), true);
            if (c == -1) {
                j3 = 0;
            } else {
                this.f23547g += c;
                j3 -= (long) c;
            }
        }
        C7215py pyVar = this.f23543c;
        int i3 = pyVar.f23558d;
        int i4 = this.f23547g / i3;
        if (i4 > 0) {
            long j4 = this.f23546f;
            long N = aeu.m18496N(this.f23548h, 1000000, (long) pyVar.f23557c);
            int i5 = i4 * i3;
            int i6 = this.f23547g - i5;
            this.f23542b.mo16103b(j4 + N, 1, i5, i6, (C7072kq) null);
            this.f23548h += (long) i4;
            this.f23547g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
