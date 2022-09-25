package androidx.media3.extractor.p173l;

import androidx.media3.common.C2599az;
import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3327ab;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.l.c */
/* compiled from: PG */
final class C3577c implements C3576b {

    /* renamed from: a */
    private final C3329ad f11391a;

    /* renamed from: b */
    private final C3368bf f11392b;

    /* renamed from: c */
    private final C3579e f11393c;

    /* renamed from: d */
    private final C2680x f11394d;

    /* renamed from: e */
    private final int f11395e;

    /* renamed from: f */
    private long f11396f;

    /* renamed from: g */
    private int f11397g;

    /* renamed from: h */
    private long f11398h;

    public C3577c(C3329ad adVar, C3368bf bfVar, C3579e eVar, String str, int i) {
        this.f11391a = adVar;
        this.f11392b = bfVar;
        this.f11393c = eVar;
        int i2 = (eVar.f11407b * eVar.f11410e) / 8;
        int i3 = eVar.f11409d;
        if (i3 == i2) {
            int i4 = eVar.f11408c * i2;
            int i5 = i4 * 8;
            int max = Math.max(i2, i4 / 10);
            this.f11395e = max;
            C2679w wVar = new C2679w();
            wVar.f7459k = str;
            wVar.f7454f = i5;
            wVar.f7455g = i5;
            wVar.f7460l = max;
            wVar.f7472x = eVar.f11407b;
            wVar.f7473y = eVar.f11408c;
            wVar.f7474z = i;
            this.f11394d = new C2680x(wVar);
            return;
        }
        throw C2599az.m6819a("Expected block size: " + i2 + "; got: " + i3, (Throwable) null);
    }

    /* renamed from: a */
    public final void mo7484a(int i, long j) {
        this.f11391a.mo6989q(new C3582h(this.f11393c, 1, (long) i, j));
        this.f11392b.mo6850b(this.f11394d);
    }

    /* renamed from: b */
    public final void mo7485b(long j) {
        this.f11396f = j;
        this.f11397g = 0;
        this.f11398h = 0;
    }

    /* renamed from: c */
    public final boolean mo7486c(C3327ab abVar, long j) {
        long j2;
        int i;
        int i2;
        long j3 = j;
        while (j3 > 0 && (i = this.f11397g) < (i2 = this.f11395e)) {
            int a = this.f11392b.mo6849a(abVar, (int) Math.min((long) (i2 - i), j3), true);
            if (a == -1) {
                j3 = 0;
            } else {
                this.f11397g += a;
                j3 -= (long) a;
            }
        }
        C3579e eVar = this.f11393c;
        int i3 = eVar.f11409d;
        int i4 = this.f11397g / i3;
        if (i4 > 0) {
            long j4 = this.f11396f;
            long y = C2612ak.m7000y(this.f11398h, 1000000, (long) eVar.f11408c);
            int i5 = i4 * i3;
            int i6 = this.f11397g - i5;
            this.f11392b.mo6852d(j4 + y, 1, i5, i6, (C3367be) null);
            this.f11398h += (long) i4;
            this.f11397g = i6;
            j2 = 0;
        } else {
            j2 = 0;
        }
        return j3 <= j2;
    }
}
