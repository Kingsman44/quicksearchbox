package p5488io.p5490b.p5497e.p5502e.p5505c;

import java.util.NoSuchElementException;
import p5488io.p5490b.C70100i;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.c.k */
/* compiled from: PG */
final class C69917k implements C70100i, C69803b {

    /* renamed from: a */
    final C70130v f186356a;

    /* renamed from: b */
    final Object f186357b;

    /* renamed from: c */
    C69803b f186358c;

    public C69917k(C70130v vVar, Object obj) {
        this.f186356a = vVar;
        this.f186357b = obj;
    }

    /* renamed from: a */
    public final void mo26090a() {
        this.f186358c = C69828d.f186198a;
        Object obj = this.f186357b;
        if (obj != null) {
            this.f186356a.mo61488d(obj);
        } else {
            this.f186356a.mo26091b(new NoSuchElementException("The MaybeSource is empty"));
        }
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186358c = C69828d.f186198a;
        this.f186356a.mo26091b(th);
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        this.f186358c = C69828d.f186198a;
        this.f186356a.mo61488d(obj);
    }

    public final void dispose() {
        this.f186358c.dispose();
        this.f186358c = C69828d.f186198a;
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101308d(this.f186358c, bVar)) {
            this.f186358c = bVar;
            this.f186356a.mo61460lO(this);
        }
    }
}
