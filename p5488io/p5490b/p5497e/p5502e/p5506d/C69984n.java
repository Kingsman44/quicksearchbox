package p5488io.p5490b.p5497e.p5502e.p5506d;

import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.n */
/* compiled from: PG */
final class C69984n implements C70123o, C69803b {

    /* renamed from: a */
    final C70123o f186531a;

    /* renamed from: b */
    final C69821c f186532b;

    /* renamed from: c */
    C69803b f186533c;

    /* renamed from: d */
    boolean f186534d;

    public C69984n(C70123o oVar, C69821c cVar) {
        this.f186531a = oVar;
        this.f186532b = cVar;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!this.f186534d) {
            this.f186534d = true;
            this.f186531a.mo25986a();
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (this.f186534d) {
            C70101a.m102023e(th);
            return;
        }
        this.f186534d = true;
        this.f186531a.mo25987b(th);
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        if (C69828d.m101308d(this.f186533c, bVar)) {
            this.f186533c = bVar;
            this.f186531a.mo26850d(this);
        }
    }

    public final void dispose() {
        this.f186533c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!this.f186534d) {
            try {
                this.f186532b.mo25818a(obj);
                this.f186531a.mo25988lL(obj);
            } catch (Throwable th) {
                C69813f.m101292a(th);
                this.f186533c.dispose();
                mo25987b(th);
            }
        }
    }
}
