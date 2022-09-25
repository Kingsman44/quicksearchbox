package p5462h.p5478h;

import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5481k.C69713k;

/* renamed from: h.h.a */
/* compiled from: PG */
public final class C69682a implements C69684c {

    /* renamed from: a */
    private Object f186050a;

    /* renamed from: b */
    public final void mo42045b(C69713k kVar, Object obj) {
        C69664n.m101061g(kVar, "property");
        C69664n.m101061g(obj, "value");
        this.f186050a = obj;
    }

    /* renamed from: c */
    public final Object mo42046c(C69713k kVar) {
        C69664n.m101061g(kVar, "property");
        Object obj = this.f186050a;
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Property " + kVar.mo61373c() + " should be initialized before get.");
    }
}
