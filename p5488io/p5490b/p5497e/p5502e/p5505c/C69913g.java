package p5488io.p5490b.p5497e.p5502e.p5505c;

import p5488io.p5490b.C70100i;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69823e;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.c.g */
/* compiled from: PG */
final class C69913g implements C70100i, C69803b {

    /* renamed from: a */
    final C70100i f186348a;

    /* renamed from: b */
    final C69823e f186349b;

    /* renamed from: c */
    C69803b f186350c;

    public C69913g(C70100i iVar, C69823e eVar) {
        this.f186348a = iVar;
        this.f186349b = eVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f186348a.mo26090a();
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186348a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        try {
            if (this.f186349b.mo61474a(obj)) {
                this.f186348a.mo61488d(obj);
            } else {
                this.f186348a.mo26090a();
            }
        } catch (Throwable th) {
            C69813f.m101292a(th);
            this.f186348a.mo26091b(th);
        }
    }

    public final void dispose() {
        C69803b bVar = this.f186350c;
        this.f186350c = C69828d.f186198a;
        bVar.dispose();
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186350c, bVar)) {
            this.f186350c = bVar;
            this.f186348a.mo61460lO(this);
        }
    }
}
