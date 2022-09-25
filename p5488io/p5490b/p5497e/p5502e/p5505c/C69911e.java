package p5488io.p5490b.p5497e.p5502e.p5505c;

import p5488io.p5490b.C70100i;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.c.e */
/* compiled from: PG */
final class C69911e implements C70100i, C69803b {

    /* renamed from: a */
    final C70100i f186344a;

    /* renamed from: b */
    final C69821c f186345b;

    /* renamed from: c */
    C69803b f186346c;

    public C69911e(C70100i iVar, C69821c cVar) {
        this.f186344a = iVar;
        this.f186345b = cVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f186344a.mo26090a();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186344a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186344a.mo61488d(obj);
        try {
            this.f186345b.mo25818a(obj);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            C70101a.m102023e(th);
        }
    }

    public final void dispose() {
        this.f186346c.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186346c, bVar)) {
            this.f186346c = bVar;
            this.f186344a.mo61460lO(this);
        }
    }
}
