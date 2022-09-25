package kotlinx.coroutines;

import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.eb */
/* compiled from: PG */
public final class C71746eb extends C71414ao {

    /* renamed from: c */
    public static final C71746eb f191229c = new C71746eb();

    private C71746eb() {
    }

    /* renamed from: d */
    public final void mo62766d(C69585o oVar, Runnable runnable) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(runnable, "block");
        C71750ef efVar = (C71750ef) oVar.get(C71750ef.f191232a);
        if (efVar != null) {
            efVar.f191233b = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    /* renamed from: f */
    public final boolean mo62768f(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        return false;
    }

    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
