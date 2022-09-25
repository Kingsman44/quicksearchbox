package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71454k;
import kotlinx.coroutines.p5579e.C71708ap;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.dg */
/* compiled from: PG */
public final class C71557dg {

    /* renamed from: a */
    public static final C71708ap f190963a = new C71708ap("NO_VALUE");

    /* renamed from: a */
    public static final Object m104443a(Object[] objArr, long j) {
        return objArr[(objArr.length - 1) & ((int) j)];
    }

    /* renamed from: b */
    public static final C71587n m104444b(C71553dc dcVar, C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        if ((i == 0 || i == -3) && tVar == C71387t.SUSPEND) {
            return dcVar;
        }
        return new C71454k(dcVar, oVar, i, tVar);
    }

    /* renamed from: c */
    public static final C71547cx m104445c(int i, int i2, C71387t tVar) {
        C69664n.m101061g(tVar, "onBufferOverflow");
        if (i2 < 0) {
            throw new IllegalArgumentException("extraBufferCapacity cannot be negative, but was " + i2);
        } else if (i > 0 || i2 > 0 || tVar == C71387t.SUSPEND) {
            int i3 = i2 + i;
            if (i3 < 0) {
                i3 = Integer.MAX_VALUE;
            }
            return new C71556df(i, i3, tVar);
        } else {
            new StringBuilder("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ").append(tVar);
            throw new IllegalArgumentException("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ".concat(String.valueOf(tVar)));
        }
    }

    /* renamed from: d */
    public static final void m104446d(Object[] objArr, long j, Object obj) {
        objArr[(objArr.length - 1) & ((int) j)] = obj;
    }

    /* renamed from: e */
    public static /* synthetic */ C71547cx m104447e(int i, int i2, C71387t tVar, int i3) {
        if (1 == (i3 & 1)) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            tVar = C71387t.SUSPEND;
        }
        return m104445c(i, i2, tVar);
    }
}
