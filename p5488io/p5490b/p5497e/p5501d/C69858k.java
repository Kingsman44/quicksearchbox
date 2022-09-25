package p5488io.p5490b.p5497e.p5501d;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5496d.C69821c;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.d.k */
/* compiled from: PG */
public final class C69858k extends AtomicReference implements C70123o, C69803b {
    private static final long serialVersionUID = -7251123623727029452L;

    /* renamed from: a */
    final C69821c f186232a;

    /* renamed from: b */
    final C69821c f186233b;

    public C69858k(C69821c cVar, C69821c cVar2) {
        this.f186232a = cVar;
        this.f186233b = cVar2;
    }

    /* renamed from: a */
    public final void mo25986a() {
        if (!mo25859e()) {
            lazySet(C69828d.f186198a);
        }
    }

    /* renamed from: b */
    public final void mo25987b(Throwable th) {
        if (!mo25859e()) {
            lazySet(C69828d.f186198a);
            try {
                this.f186233b.mo25818a(th);
            } catch (Throwable th2) {
                C69813f.m101292a(th2);
                C70101a.m102023e(new C69812e(Arrays.asList(new Throwable[]{th, th2})));
            }
        } else {
            C70101a.m102023e(th);
        }
    }

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        C69828d.m101307c(this, bVar);
    }

    public final void dispose() {
        C69828d.m101309f(this);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        return get() == C69828d.f186198a;
    }

    /* renamed from: lL */
    public final void mo25988lL(Object obj) {
        if (!mo25859e()) {
            try {
                this.f186232a.mo25818a(obj);
            } catch (Throwable th) {
                C69813f.m101292a(th);
                ((C69803b) get()).dispose();
                mo25987b(th);
            }
        }
    }
}
