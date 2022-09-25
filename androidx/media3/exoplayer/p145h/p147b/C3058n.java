package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2680x;
import androidx.media3.extractor.C3627q;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2508l;
import androidx.media3.p132b.C2510n;

/* renamed from: androidx.media3.exoplayer.h.b.n */
/* compiled from: PG */
public final class C3058n extends C3050f {

    /* renamed from: a */
    public C3047c f8891a;

    /* renamed from: b */
    private long f8892b;

    /* renamed from: c */
    private volatile boolean f8893c;

    /* renamed from: d */
    private final C3049e f8894d;

    public C3058n(C2505i iVar, C2510n nVar, C2680x xVar, int i, Object obj, C3049e eVar) {
        super(iVar, nVar, 2, xVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.f8894d = eVar;
    }

    /* renamed from: b */
    public final void mo6996b() {
        this.f8893c = true;
    }

    /* renamed from: c */
    public final void mo6997c() {
        C3627q qVar;
        if (this.f8892b == 0) {
            this.f8894d.mo6986b(this.f8891a, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            C2510n a = this.f8846l.mo5936a(this.f8892b);
            C2493al alVar = this.f8853s;
            qVar = new C3627q(alVar, a.f6896f, alVar.mo5880b(a));
            do {
                if (this.f8893c || !this.f8894d.mo6985a(qVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f8894d.mo6985a(qVar));
            break;
            this.f8892b = qVar.f11566c - this.f8846l.f6896f;
            C2508l.m6614a(this.f8853s);
        } catch (Throwable th) {
            C2508l.m6614a(this.f8853s);
            throw th;
        }
    }
}
