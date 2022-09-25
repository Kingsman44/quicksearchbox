package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71715aw;
import kotlinx.coroutines.p5579e.C71728j;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.bm */
/* compiled from: PG */
public final class C71612bm {
    /* renamed from: a */
    public static final void m104561a(C71611bl blVar, C69577g gVar, boolean z) {
        C69664n.m101061g(gVar, "delegate");
        Object p = blVar.mo62833p();
        Throwable s = blVar.mo62835s(p);
        Object a = s != null ? C69714l.m101133a(s) : blVar.mo62832o(p);
        if (z) {
            C71728j jVar = (C71728j) gVar;
            C69577g gVar2 = jVar.f191203b;
            Object obj = jVar.f191205d;
            C69585o lY = gVar2.mo61340lY();
            Object b = C71715aw.m104856b(lY, obj);
            C71747ec c = b != C71715aw.f191181a ? C71405al.m104172c(gVar2, lY, b) : null;
            try {
                jVar.f191203b.mo61338mb(a);
                if (c == null || c.mo62990T()) {
                    C71715aw.m104857c(lY, b);
                }
            } catch (Throwable th) {
                if (c == null || c.mo62990T()) {
                    C71715aw.m104857c(lY, b);
                }
                throw th;
            }
        } else {
            gVar.mo61338mb(a);
        }
    }

    /* renamed from: b */
    public static final boolean m104562b(int i) {
        return i == 1 || i == 2;
    }
}
