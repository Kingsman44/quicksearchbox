package p5488io.p5490b.p5497e.p5502e.p5508f;

import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.f.c */
/* compiled from: PG */
final class C70012c implements C70130v, C69803b {

    /* renamed from: a */
    final C70130v f186631a;

    /* renamed from: b */
    final C69821c f186632b;

    /* renamed from: c */
    C69803b f186633c;

    public C70012c(C70130v vVar, C69821c cVar) {
        this.f186631a = vVar;
        this.f186632b = cVar;
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186631a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186631a.mo61488d(obj);
        try {
            this.f186632b.mo25818a(obj);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C70101a.m102023e(th);
        }
    }

    public final void dispose() {
        this.f186633c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186633c, bVar)) {
            this.f186633c = bVar;
            this.f186631a.mo61460lO(this);
        }
    }
}
