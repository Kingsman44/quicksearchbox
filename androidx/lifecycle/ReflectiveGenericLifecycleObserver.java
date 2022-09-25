package androidx.lifecycle;

import java.util.List;

@Deprecated
/* compiled from: PG */
class ReflectiveGenericLifecycleObserver implements C2389t {

    /* renamed from: a */
    private final Object f6505a;

    /* renamed from: b */
    private final C2372c f6506b;

    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f6505a = obj;
        this.f6506b = C2374e.f6595a.mo5778b(obj.getClass());
    }

    /* renamed from: eN */
    public final void mo416eN(C2391v vVar, C2382m mVar) {
        C2372c cVar = this.f6506b;
        Object obj = this.f6505a;
        C2372c.m6373a((List) cVar.f6591a.get(mVar), vVar, mVar, obj);
        C2372c.m6373a((List) cVar.f6591a.get(C2382m.ON_ANY), vVar, mVar, obj);
    }
}
