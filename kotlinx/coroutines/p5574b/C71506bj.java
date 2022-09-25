package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71459p;
import kotlinx.coroutines.p5574b.p5575a.C71461r;
import kotlinx.coroutines.p5579e.C71711as;
import p5462h.p5463a.C69531o;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5474a.C69631q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.bj */
/* compiled from: PG */
public final /* synthetic */ class C71506bj {
    static {
        C71711as.m104849a("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, 2147483647L);
    }

    /* renamed from: a */
    public static final C71587n m104335a(C71587n nVar, C69630p pVar) {
        return new C71502bf(new C71501be(nVar, pVar));
    }

    /* renamed from: b */
    public static final C71587n m104336b(C71587n nVar, C69630p pVar) {
        C69664n.m101061g(nVar, "<this>");
        return m104339e(nVar, new C71505bi(pVar, (C69577g) null));
    }

    /* renamed from: c */
    public static final C71587n m104337c(Iterable iterable) {
        C69664n.m101061g(iterable, "<this>");
        return new C71461r(iterable, C69586p.f185991a, -2, C71387t.SUSPEND);
    }

    /* renamed from: d */
    public static final C71587n m104338d(C71587n... nVarArr) {
        return m104337c(C69531o.m100932i(nVarArr));
    }

    /* renamed from: e */
    public static final C71587n m104339e(C71587n nVar, C69631q qVar) {
        C69664n.m101061g(nVar, "<this>");
        return new C71459p(qVar, nVar, C69586p.f185991a, -2, C71387t.SUSPEND);
    }
}
