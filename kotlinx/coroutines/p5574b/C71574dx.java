package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.C71600ba;
import kotlinx.coroutines.p5573a.C71387t;
import kotlinx.coroutines.p5574b.p5575a.C71434af;
import kotlinx.coroutines.p5579e.C71708ap;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.dx */
/* compiled from: PG */
public final class C71574dx {

    /* renamed from: a */
    public static final C71708ap f191002a = new C71708ap("NONE");

    /* renamed from: b */
    public static final C71708ap f191003b = new C71708ap("PENDING");

    /* renamed from: a */
    public static final C71587n m104479a(C71571du duVar, C69585o oVar, int i, C71387t tVar) {
        C69664n.m101061g(oVar, "context");
        C69664n.m101061g(tVar, "onBufferOverflow");
        boolean z = C71600ba.f191036a;
        if (((i < 0 || i >= 2) && i != -2) || tVar != C71387t.DROP_OLDEST) {
            return C71557dg.m104444b(duVar, oVar, i, tVar);
        }
        return duVar;
    }

    /* renamed from: b */
    public static final C71548cy m104480b(Object obj) {
        if (obj == null) {
            obj = C71434af.f190644a;
        }
        return new C71573dw(obj);
    }
}
