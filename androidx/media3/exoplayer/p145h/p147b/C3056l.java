package androidx.media3.exoplayer.p145h.p147b;

import androidx.media3.common.C2680x;
import androidx.media3.common.p136b.C2601a;
import androidx.media3.extractor.C3627q;
import androidx.media3.p132b.C2493al;
import androidx.media3.p132b.C2505i;
import androidx.media3.p132b.C2508l;
import androidx.media3.p132b.C2510n;

/* renamed from: androidx.media3.exoplayer.h.b.l */
/* compiled from: PG */
public final class C3056l extends C3045a {

    /* renamed from: e */
    private final int f8883e;

    /* renamed from: f */
    private final long f8884f;

    /* renamed from: g */
    private long f8885g;

    /* renamed from: h */
    private volatile boolean f8886h;

    /* renamed from: i */
    private boolean f8887i;

    /* renamed from: j */
    private final C3049e f8888j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C3056l(C2505i iVar, C2510n nVar, C2680x xVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, C3049e eVar) {
        super(iVar, nVar, xVar, i, obj, j, j2, j3, j4, j5);
        this.f8883e = i2;
        this.f8884f = j6;
        this.f8888j = eVar;
    }

    /* renamed from: b */
    public final void mo6996b() {
        this.f8886h = true;
    }

    /* renamed from: c */
    public final void mo6997c() {
        C3627q qVar;
        long j;
        if (this.f8885g == 0) {
            C3047c cVar = this.f8822c;
            C2601a.m6829a(cVar);
            cVar.mo6982a(this.f8884f);
            C3049e eVar = this.f8888j;
            long j2 = this.f8820a;
            long j3 = j2 == -9223372036854775807L ? -9223372036854775807L : j2 - this.f8884f;
            long j4 = this.f8821b;
            if (j4 == -9223372036854775807L) {
                j = -9223372036854775807L;
            } else {
                j = j4 - this.f8884f;
            }
            eVar.mo6986b(cVar, j3, j);
        }
        try {
            C2510n a = this.f8846l.mo5936a(this.f8885g);
            C2493al alVar = this.f8853s;
            qVar = new C3627q(alVar, a.f6896f, alVar.mo5880b(a));
            do {
                if (this.f8886h || !this.f8888j.mo6985a(qVar)) {
                    break;
                }
                break;
                break;
            } while (!this.f8888j.mo6985a(qVar));
            break;
            this.f8885g = qVar.f11566c - this.f8846l.f6896f;
            C2508l.m6614a(this.f8853s);
            this.f8887i = !this.f8886h;
        } catch (Throwable th) {
            C2508l.m6614a(this.f8853s);
            throw th;
        }
    }

    /* renamed from: d */
    public final boolean mo6998d() {
        return this.f8887i;
    }

    /* renamed from: k */
    public final long mo6999k() {
        return this.f8895t + ((long) this.f8883e);
    }
}
