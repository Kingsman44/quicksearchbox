package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.C3367be;
import androidx.media3.extractor.C3368bf;
import androidx.media3.extractor.C3627q;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2508l;
import androidx.media3.p132b.C2510n;

/* renamed from: androidx.media3.exoplayer.h.b.r */
/* compiled from: PG */
public final class C3062r extends C3045a {

    /* renamed from: e */
    private final int f8897e;

    /* renamed from: f */
    private final C2680x f8898f;

    /* renamed from: g */
    private long f8899g;

    /* renamed from: h */
    private boolean f8900h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3062r(C2505i iVar, C2510n nVar, C2680x xVar, int i, Object obj, long j, long j2, long j3, int i2, C2680x xVar2) {
        super(iVar, nVar, xVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.f8897e = i2;
        this.f8898f = xVar2;
    }

    /* renamed from: b */
    public final void mo6996b() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public final void mo6997c() {
        C3047c cVar = this.f8822c;
        C2601a.m6829a(cVar);
        cVar.mo6982a(0);
        C3368bf b = cVar.mo6983b(this.f8897e);
        b.mo6850b(this.f8898f);
        try {
            long b2 = this.f8853s.mo5880b(this.f8846l.mo5936a(this.f8899g));
            if (b2 != -1) {
                b2 += this.f8899g;
            }
            C3627q qVar = new C3627q(this.f8853s, this.f8899g, b2);
            for (int i = 0; i != -1; i = b.mo6849a(qVar, Integer.MAX_VALUE, true)) {
                this.f8899g += (long) i;
            }
            b.mo6852d(this.f8851q, 1, (int) this.f8899g, 0, (C3367be) null);
            C2508l.m6614a(this.f8853s);
            this.f8900h = true;
        } catch (Throwable th) {
            C2508l.m6614a(this.f8853s);
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo6998d() {
        return this.f8900h;
    }
}
