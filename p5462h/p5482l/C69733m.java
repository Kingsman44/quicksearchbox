package p5462h.p5482l;

import java.util.Collection;
import java.util.Iterator;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;

/* renamed from: h.l.m */
/* compiled from: PG */
public abstract class C69733m {
    /* renamed from: a */
    public abstract Object mo61426a(Object obj, C69577g gVar);

    /* renamed from: b */
    public abstract Object mo61427b(Iterator it, C69577g gVar);

    /* renamed from: c */
    public final Object mo61428c(Iterable iterable, C69577g gVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return C69788q.f186170a;
        }
        Object b = mo61427b(iterable.iterator(), gVar);
        return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
    }

    /* renamed from: d */
    public final Object mo61429d(C69731k kVar, C69577g gVar) {
        Object b = mo61427b(kVar.mo5191a(), gVar);
        return b == C69554a.COROUTINE_SUSPENDED ? b : C69788q.f186170a;
    }
}
