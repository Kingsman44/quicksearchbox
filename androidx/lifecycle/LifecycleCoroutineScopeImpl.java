package androidx.lifecycle;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71647ct;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public final class LifecycleCoroutineScopeImpl extends C2385p implements C2389t {

    /* renamed from: a */
    public final C2384o f6490a;

    /* renamed from: b */
    private final C69585o f6491b;

    public LifecycleCoroutineScopeImpl(C2384o oVar, C69585o oVar2) {
        C69664n.m101061g(oVar, "lifecycle");
        C69664n.m101061g(oVar2, "coroutineContext");
        this.f6490a = oVar;
        this.f6491b = oVar2;
        if (oVar.mo5789a() == C2383n.DESTROYED) {
            C71647ct.m104639c(oVar2, (CancellationException) null);
        }
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        if (this.f6490a.mo5789a().compareTo(C2383n.DESTROYED) <= 0) {
            this.f6490a.mo5791c(this);
            C71647ct.m104639c(this.f6491b, (CancellationException) null);
        }
    }

    /* renamed from: lZ */
    public final C69585o mo5702lZ() {
        return this.f6491b;
    }
}
