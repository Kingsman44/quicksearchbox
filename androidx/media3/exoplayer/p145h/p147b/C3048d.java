package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2671o;
import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2604ac;
import androidx.media3.common.p136b.C2612ak;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3636z;

/* renamed from: androidx.media3.exoplayer.h.b.d */
/* compiled from: PG */
final class C3048d implements C3368bf {

    /* renamed from: a */
    public C2680x f8829a;

    /* renamed from: b */
    private final int f8830b;

    /* renamed from: c */
    private final C2680x f8831c;

    /* renamed from: d */
    private final C3636z f8832d = new C3636z();

    /* renamed from: e */
    private C3368bf f8833e;

    /* renamed from: f */
    private long f8834f;

    public C3048d(int i, C2680x xVar) {
        this.f8830b = i;
        this.f8831c = xVar;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo6849a(C2671o oVar, int i, boolean z) {
        C3368bf bfVar = this.f8833e;
        int i2 = C2612ak.f7249a;
        return bfVar.mo6849a(oVar, i, z);
    }

    /* renamed from: b */
    public final void mo6850b(C2680x xVar) {
        C2680x xVar2 = this.f8831c;
        if (xVar2 != null) {
            xVar = xVar.mo6358c(xVar2);
        }
        this.f8829a = xVar;
        C3368bf bfVar = this.f8833e;
        int i = C2612ak.f7249a;
        bfVar.mo6850b(this.f8829a);
    }

    /* renamed from: c */
    public final /* synthetic */ void mo6851c(C2604ac acVar, int i) {
        mo6854f(acVar, i);
    }

    /* renamed from: d */
    public final void mo6852d(long j, int i, int i2, int i3, C3367be beVar) {
        long j2 = this.f8834f;
        if (j2 != -9223372036854775807L && j >= j2) {
            this.f8833e = this.f8832d;
        }
        C3368bf bfVar = this.f8833e;
        int i4 = C2612ak.f7249a;
        bfVar.mo6852d(j, i, i2, i3, beVar);
    }

    /* renamed from: e */
    public final int mo6853e(C2671o oVar, int i, boolean z) {
        throw null;
    }

    /* renamed from: f */
    public final void mo6854f(C2604ac acVar, int i) {
        C3368bf bfVar = this.f8833e;
        int i2 = C2612ak.f7249a;
        bfVar.mo6851c(acVar, i);
    }

    /* renamed from: g */
    public final void mo6984g(C3047c cVar, long j) {
        if (cVar == null) {
            this.f8833e = this.f8832d;
            return;
        }
        this.f8834f = j;
        C3368bf b = cVar.mo6983b(this.f8830b);
        this.f8833e = b;
        C2680x xVar = this.f8829a;
        if (xVar != null) {
            b.mo6850b(xVar);
        }
    }
}
