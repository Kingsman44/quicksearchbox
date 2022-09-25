package p5488io.p5490b.p5497e.p5502e.p5503a;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C69801b;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69820b;
import p5488io.p5490b.p5497e.p5498a.C69825a;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.a.g */
/* compiled from: PG */
public final class C69872g extends AtomicReference implements C69803b {
    private static final long serialVersionUID = -2467358622224974244L;

    /* renamed from: a */
    final C69801b f186265a;

    public C69872g(C69801b bVar) {
        this.f186265a = bVar;
    }

    /* renamed from: a */
    public final void mo61500a() {
        C69803b bVar;
        if (get() != C69828d.f186198a && (bVar = (C69803b) getAndSet(C69828d.f186198a)) != C69828d.f186198a) {
            try {
                this.f186265a.mo26090a();
                if (bVar != null) {
                    bVar.dispose();
                }
            } catch (Throwable th) {
                if (bVar != null) {
                    bVar.dispose();
                }
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void mo61501b(Throwable th) {
        C69803b bVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (get() == C69828d.f186198a || (bVar = (C69803b) getAndSet(C69828d.f186198a)) == C69828d.f186198a) {
            C70101a.m102023e(th);
            return;
        }
        try {
            this.f186265a.mo26091b(nullPointerException);
            if (bVar != null) {
                bVar.dispose();
            }
        } catch (Throwable th2) {
            if (bVar != null) {
                bVar.dispose();
            }
            throw th2;
        }
    }

    /* renamed from: c */
    public final void mo61502c(C69820b bVar) {
        C69828d.m101311h(this, new C69825a(bVar));
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        throw null;
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
