package p5488io.p5490b.p5497e.p5502e.p5506d;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5496d.C69820b;
import p5488io.p5490b.p5497e.p5498a.C69825a;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.e.d.g */
/* compiled from: PG */
public final class C69977g extends AtomicReference implements C69803b {
    private static final long serialVersionUID = -3434801548987643227L;

    /* renamed from: a */
    final C70123o f186520a;

    public C69977g(C70123o oVar) {
        this.f186520a = oVar;
    }

    /* renamed from: a */
    public final void mo61551a(Throwable th) {
        if (!mo25859e()) {
            try {
                this.f186520a.mo25987b(th);
            } finally {
                C69828d.m101309f(this);
            }
        } else {
            C70101a.m102023e(th);
        }
    }

    /* renamed from: b */
    public final void mo61552b(Object obj) {
        if (obj == null) {
            mo61551a(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
        } else if (!mo25859e()) {
            this.f186520a.mo25988lL(obj);
        }
    }

    /* renamed from: c */
    public final void mo61553c(C69820b bVar) {
        C69828d.m101311h(this, new C69825a(bVar));
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        return C69828d.m101306b((C69803b) get());
    }

    public final String toString() {
        return String.format("%s{%s}", new Object[]{getClass().getSimpleName(), super.toString()});
    }
}
