package p5488io.p5490b.p5515g;

import java.util.concurrent.atomic.AtomicReference;
import p5488io.p5490b.C70123o;
import p5488io.p5490b.p5494b.C69803b;
import p5488io.p5490b.p5497e.p5498a.C69828d;
import p5488io.p5490b.p5497e.p5513j.C70083d;

/* renamed from: io.b.g.b */
/* compiled from: PG */
public abstract class C70096b implements C70123o, C69803b {

    /* renamed from: e */
    public final AtomicReference f186827e = new AtomicReference();

    /* renamed from: d */
    public final void mo26850d(C69803b bVar) {
        C70083d.m101983a(this.f186827e, bVar, getClass());
    }

    public final void dispose() {
        C69828d.m101309f(this.f186827e);
    }

    /* renamed from: e */
    public final boolean mo25859e() {
        return this.f186827e.get() == C69828d.f186198a;
    }
}
