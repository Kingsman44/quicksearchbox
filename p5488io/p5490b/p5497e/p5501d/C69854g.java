package p5488io.p5490b.p5497e.p5501d;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5495c.C69812e;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5499b.C69837f;
import p5488io.p5490b.p5517i.C70101a;

/* renamed from: io.b.e.d.g */
/* compiled from: PG */
public final class C69854g extends AtomicReference implements C70130v, C69803b {
    private static final long serialVersionUID = -7012088219455310787L;

    /* renamed from: b */
    public final void mo26091b(Throwable th) {
        lazySet(C69828d.f186198a);
        try {
            C69837f.m101333b(th);
        } catch (Throwable th2) {
            C69813f.m101292a(th2);
            C70101a.m102023e(new C69812e(Arrays.asList(new Throwable[]{th, th2})));
        }
    }

    /* renamed from: d */
    public final void mo61488d(Object obj) {
        lazySet(C69828d.f186198a);
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
        C69828d.m101307c(this, bVar);
    }
}
