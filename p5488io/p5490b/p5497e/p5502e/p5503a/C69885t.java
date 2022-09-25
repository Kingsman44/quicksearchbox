package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.C70128t;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.a.t */
/* compiled from: PG */
final class C69885t extends AtomicReference implements Runnable, C69801b, C69803b {
    private static final long serialVersionUID = 8571289934935992137L;

    /* renamed from: a */
    final C69801b f186283a;

    /* renamed from: b */
    final C70128t f186284b;

    /* renamed from: c */
    Throwable f186285c;

    public C69885t(C69801b bVar, C70128t tVar) {
        this.f186283a = bVar;
        this.f186284b = tVar;
    }

    /* renamed from: a */
    public final void mo26090a() {
        C69828d.m101310g(this, this.f186284b.mo61593b(this));
    }

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        this.f186285c = th;
        C69828d.m101310g(this, this.f186284b.mo61593b(this));
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    /* renamed from: lO */
    public final void mo61460lO(C69803b bVar) {
        if (C69828d.m101307c(this, bVar)) {
            this.f186283a.mo61460lO(this);
        }
    }

    public final void run() {
        Throwable th = this.f186285c;
        if (th != null) {
            this.f186285c = null;
            this.f186283a.mo26091b(th);
            return;
        }
        this.f186283a.mo26090a();
    }

    public final String toString() {
        return String.valueOf(this.f186283a);
    }
}
