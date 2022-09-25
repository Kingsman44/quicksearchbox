package androidx.media3.extractor.p172k;

import androidx.media3.common.C2679w;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2609ah;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3329ad;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;

/* renamed from: androidx.media3.extractor.k.y */
/* compiled from: PG */
public final class C3572y implements C3533af {

    /* renamed from: a */
    private C2680x f11363a;

    /* renamed from: b */
    private C2609ah f11364b;

    /* renamed from: c */
    private C3368bf f11365c;

    public C3572y(String str) {
        C2679w wVar = new C2679w();
        wVar.f7459k = str;
        this.f11363a = new C2680x(wVar);
    }

    /* renamed from: a */
    public final void mo7454a(C2604ac acVar) {
        C2601a.m6829a(this.f11364b);
        int i = C2612ak.f7249a;
        long d = this.f11364b.mo6182d();
        long e = this.f11364b.mo6183e();
        if (d != -9223372036854775807L && e != -9223372036854775807L) {
            C2680x xVar = this.f11363a;
            if (e != xVar.f7500r) {
                C2679w wVar = new C2679w(xVar);
                wVar.f7463o = e;
                C2680x xVar2 = new C2680x(wVar);
                this.f11363a = xVar2;
                this.f11365c.mo6850b(xVar2);
            }
            int i2 = acVar.f7236c - acVar.f7235b;
            this.f11365c.mo6851c(acVar, i2);
            this.f11365c.mo6852d(d, 1, i2, 0, (C3367be) null);
        }
    }

    /* renamed from: b */
    public final void mo7455b(C2609ah ahVar, C3329ad adVar, C3545ar arVar) {
        this.f11364b = ahVar;
        arVar.mo7462a();
        arVar.mo7463b();
        C3368bf eZ = adVar.mo6987eZ(arVar.f11108a, 5);
        this.f11365c = eZ;
        eZ.mo6850b(this.f11363a);
    }
}
