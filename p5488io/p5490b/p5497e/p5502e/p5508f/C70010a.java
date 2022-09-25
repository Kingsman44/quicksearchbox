package p5488io.p5490b.p5497e.p5502e.p5508f;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.f.a */
/* compiled from: PG */
public final class C70010a extends AtomicReference implements C69803b {
    private static final long serialVersionUID = -2467358622224974244L;

    /* renamed from: a */
    public final C70130v f186629a;

    public C70010a(C70130v vVar) {
        this.f186629a = vVar;
    }

    /* renamed from: a */
    public final void mo61578a(Throwable th) {
        C69803b bVar;
        Throwable nullPointerException = th == null ? new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.") : th;
        if (get() == C69828d.f186198a || (bVar = (C69803b) getAndSet(C69828d.f186198a)) == C69828d.f186198a) {
            C70101a.m102023e(th);
            return;
        }
        try {
            this.f186629a.mo26091b(nullPointerException);
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
