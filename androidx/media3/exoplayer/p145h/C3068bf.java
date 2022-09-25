package androidx.media3.exoplayer.p145h;

import androidx.media3.exoplayer.C2897cz;
import androidx.media3.exoplayer.p150j.C3197ad;

/* renamed from: androidx.media3.exoplayer.h.bf */
/* compiled from: PG */
final class C3068bf implements C3034aq, C3033ap {

    /* renamed from: a */
    public final C3034aq f8913a;

    /* renamed from: b */
    private final long f8914b;

    /* renamed from: c */
    private C3033ap f8915c;

    public C3068bf(C3034aq aqVar, long j) {
        this.f8913a = aqVar;
        this.f8914b = j;
    }

    /* renamed from: a */
    public final long mo6807a(long j, C2897cz czVar) {
        return this.f8913a.mo6807a(j - this.f8914b, czVar) + this.f8914b;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo6617b(C3097ch chVar) {
        C3034aq aqVar = (C3034aq) chVar;
        C3033ap apVar = this.f8915c;
        apVar.getClass();
        apVar.mo6617b(this);
    }

    /* renamed from: c */
    public final long mo6808c() {
        long c = this.f8913a.mo6808c();
        if (c == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return c + this.f8914b;
    }

    /* renamed from: d */
    public final long mo6809d() {
        long d = this.f8913a.mo6809d();
        if (d == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return d + this.f8914b;
    }

    /* renamed from: e */
    public final long mo6810e() {
        long e = this.f8913a.mo6810e();
        if (e == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return e + this.f8914b;
    }

    /* renamed from: f */
    public final long mo6811f(long j) {
        return this.f8913a.mo6811f(j - this.f8914b) + this.f8914b;
    }

    /* renamed from: fc */
    public final void mo6812fc(C3033ap apVar, long j) {
        this.f8915c = apVar;
        this.f8913a.mo6812fc(this, j - this.f8914b);
    }

    /* renamed from: g */
    public final long mo6813g(C3197ad[] adVarArr, boolean[] zArr, C3095cf[] cfVarArr, boolean[] zArr2, long j) {
        C3095cf[] cfVarArr2 = cfVarArr;
        C3095cf[] cfVarArr3 = new C3095cf[cfVarArr2.length];
        int i = 0;
        while (true) {
            C3095cf cfVar = null;
            if (i >= cfVarArr2.length) {
                break;
            }
            C3069bg bgVar = (C3069bg) cfVarArr2[i];
            if (bgVar != null) {
                cfVar = bgVar.f8916a;
            }
            cfVarArr3[i] = cfVar;
            i++;
        }
        long g = this.f8913a.mo6813g(adVarArr, zArr, cfVarArr3, zArr2, j - this.f8914b);
        for (int i2 = 0; i2 < cfVarArr2.length; i2++) {
            C3095cf cfVar2 = cfVarArr3[i2];
            if (cfVar2 == null) {
                cfVarArr2[i2] = null;
            } else {
                C3095cf cfVar3 = cfVarArr2[i2];
                if (cfVar3 == null || ((C3069bg) cfVar3).f8916a != cfVar2) {
                    cfVarArr2[i2] = new C3069bg(cfVar2, this.f8914b);
                }
            }
        }
        return g + this.f8914b;
    }

    /* renamed from: h */
    public final C3107cr mo6814h() {
        return this.f8913a.mo6814h();
    }

    /* renamed from: i */
    public final void mo6815i(long j, boolean z) {
        this.f8913a.mo6815i(j - this.f8914b, z);
    }

    /* renamed from: j */
    public final void mo6816j() {
        this.f8913a.mo6816j();
    }

    /* renamed from: m */
    public final void mo6818m(long j) {
        this.f8913a.mo6818m(j - this.f8914b);
    }

    /* renamed from: n */
    public final boolean mo6819n(long j) {
        return this.f8913a.mo6819n(j - this.f8914b);
    }

    /* renamed from: o */
    public final boolean mo6820o() {
        return this.f8913a.mo6820o();
    }

    /* renamed from: eY */
    public final void mo6620eY(C3034aq aqVar) {
        C3033ap apVar = this.f8915c;
        apVar.getClass();
        apVar.mo6620eY(this);
    }
}
