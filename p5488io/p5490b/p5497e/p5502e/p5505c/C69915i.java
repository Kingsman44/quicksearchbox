package p5488io.p5490b.p5497e.p5502e.p5505c;

import p5488io.p5490b.C70100i;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69822d;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69841j;

/* renamed from: io.b.e.e.c.i */
/* compiled from: PG */
final class C69915i implements C70100i, C69803b {

    /* renamed from: a */
    final C70100i f186352a;

    /* renamed from: b */
    final C69822d f186353b;

    /* renamed from: c */
    C69803b f186354c;

    public C69915i(C70100i iVar, C69822d dVar) {
        this.f186352a = iVar;
        this.f186353b = dVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f186352a.mo26090a();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186352a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        try {
            Object a = this.f186353b.mo25875a(obj);
            C69841j.m101337b(a, "The mapper returned a null item");
            this.f186352a.mo61488d(a);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186352a.mo26091b(th);
        }
    }

    public final void dispose() {
        C69803b bVar = this.f186354c;
        this.f186354c = C69828d.f186198a;
        bVar.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186354c, bVar)) {
            this.f186354c = bVar;
            this.f186352a.mo61460lO(this);
        }
    }
}
