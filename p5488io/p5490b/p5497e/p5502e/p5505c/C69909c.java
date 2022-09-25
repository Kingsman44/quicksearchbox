package p5488io.p5490b.p5497e.p5502e.p5505c;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70100i;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.c.c */
/* compiled from: PG */
public final class C69909c extends AtomicReference implements C69803b {
    private static final long serialVersionUID = -2467358622224974244L;

    /* renamed from: a */
    public final C70100i f186342a;

    public C69909c(C70100i iVar) {
        this.f186342a = iVar;
    }

    /* renamed from: a */
    public final boolean mo61516a(Throwable th) {
        C69803b bVar;
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (get() == C69828d.f186198a || (bVar = (C69803b) getAndSet(C69828d.f186198a)) == C69828d.f186198a) {
            return false;
        }
        try {
            this.f186342a.mo26091b(th);
            if (bVar == null) {
                return true;
            }
            bVar.dispose();
            return true;
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
