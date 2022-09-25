package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70100i;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.q */
/* compiled from: PG */
final class C69987q implements C70123o, C69803b {

    /* renamed from: a */
    final C70100i f186538a;

    /* renamed from: b */
    C69803b f186539b;

    /* renamed from: c */
    long f186540c;

    /* renamed from: d */
    boolean f186541d;

    public C69987q(C70100i iVar) {
        this.f186538a = iVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186541d) {
            this.f186541d = true;
            this.f186538a.mo26090a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186541d) {
            C70101a.m102023e(th);
            return;
        }
        this.f186541d = true;
        this.f186538a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186539b, bVar)) {
            this.f186539b = bVar;
            this.f186538a.mo61460lO(this);
        }
    }

    public final void dispose() {
        this.f186539b.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186541d) {
            long j = this.f186540c;
            if (j == 0) {
                this.f186541d = true;
                this.f186539b.dispose();
                this.f186538a.mo61488d(obj);
                return;
            }
            this.f186540c = j + 1;
        }
    }
}
