package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5498a.C69829e;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.bq */
/* compiled from: PG */
final class C69963bq implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186478a;

    /* renamed from: b */
    boolean f186479b;

    /* renamed from: c */
    C69803b f186480c;

    /* renamed from: d */
    long f186481d = 2;

    public C69963bq(C70123o oVar) {
        this.f186478a = oVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186479b) {
            this.f186479b = true;
            this.f186480c.dispose();
            this.f186478a.mo25986a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186479b) {
            C70101a.m102023e(th);
            return;
        }
        this.f186479b = true;
        this.f186480c.dispose();
        this.f186478a.mo25987b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186480c, bVar)) {
            this.f186480c = bVar;
            if (this.f186481d == 0) {
                this.f186479b = true;
                bVar.dispose();
                C69829e.m101314d(this.f186478a);
                return;
            }
            this.f186478a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186480c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186479b) {
            long j = this.f186481d;
            long j2 = -1 + j;
            this.f186481d = j2;
            if (j > 0) {
                this.f186478a.mo25988lL(obj);
                if (j2 == 0) {
                    mo25986a();
                }
            }
        }
    }
}
