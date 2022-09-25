package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71430ab;
import kotlinx.coroutines.p5574b.p5575a.C71431ac;
import kotlinx.coroutines.p5574b.p5575a.C71454k;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.C69586p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.y */
/* compiled from: PG */
public final /* synthetic */ class C71598y {
    /* renamed from: a */
    public static final C71587n m104521a(C71587n nVar, int i, C71387t tVar) {
        C71387t tVar2;
        int i2;
        C69664n.m101061g(nVar, "<this>");
        C69664n.m101061g(tVar, "onBufferOverflow");
        if (i < 0) {
            i = -1;
        }
        if (i != -1 || tVar == C71387t.SUSPEND) {
            if (i == -1) {
                tVar2 = C71387t.DROP_OLDEST;
                i2 = 0;
            } else {
                i2 = i;
                tVar2 = tVar;
            }
            if (nVar instanceof C71431ac) {
                return C71430ab.m104203a((C71431ac) nVar, (C69585o) null, i2, tVar2, 1);
            }
            return new C71454k(nVar, (C69585o) null, i2, tVar2, 2);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow");
    }

    /* renamed from: b */
    public static final C71587n m104522b(C71587n nVar) {
        C69664n.m101061g(nVar, "<this>");
        if (nVar instanceof C71577e) {
            return nVar;
        }
        return new C71581h(nVar);
    }

    /* renamed from: c */
    public static final C71587n m104523c(C71587n nVar) {
        C69664n.m101061g(nVar, "<this>");
        return m104521a(nVar, -1, C71387t.SUSPEND);
    }

    /* renamed from: d */
    public static final C71587n m104524d(C71587n nVar, C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        if (oVar.get(C71643cp.f191083c) != null) {
            new StringBuilder("Flow context cannot contain job in it. Had ").append(oVar);
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(oVar)));
        } else if (C69664n.m101066l(oVar, C69586p.f185991a)) {
            return nVar;
        } else {
            if (nVar instanceof C71431ac) {
                return C71430ab.m104203a((C71431ac) nVar, oVar, 0, (C71387t) null, 6);
            }
            return new C71454k(nVar, oVar, 0, (C71387t) null, 12);
        }
    }
}
