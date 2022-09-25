package kotlinx.coroutines.p5574b;

import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.ab */
/* compiled from: PG */
public final /* synthetic */ class C71471ab {

    /* renamed from: a */
    private static final C69626l f190729a = C71470aa.f190728a;

    /* renamed from: b */
    private static final C69630p f190730b = C71599z.f191035a;

    /* renamed from: a */
    public static final C71587n m104286a(C71587n nVar) {
        C69664n.m101061g(nVar, "<this>");
        if (nVar instanceof C71571du) {
            return nVar;
        }
        return m104288c(nVar, f190729a, f190730b);
    }

    /* renamed from: b */
    public static final C71587n m104287b(C71587n nVar, C69626l lVar) {
        C69664n.m101061g(nVar, "<this>");
        return m104288c(nVar, lVar, f190730b);
    }

    /* renamed from: c */
    private static final C71587n m104288c(C71587n nVar, C69626l lVar, C69630p pVar) {
        if (nVar instanceof C71586m) {
            C71586m mVar = (C71586m) nVar;
            if (mVar.f191020a == lVar && mVar.f191021b == pVar) {
                return nVar;
            }
        }
        return new C71586m(nVar, lVar, pVar);
    }
}
