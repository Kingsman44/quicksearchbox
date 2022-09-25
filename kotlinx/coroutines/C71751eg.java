package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71728j;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5467a.C69555b;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.eg */
/* compiled from: PG */
public final class C71751eg {
    /* renamed from: a */
    public static final Object m104937a(C69577g gVar) {
        Object obj;
        C69585o lY = gVar.mo61340lY();
        C71647ct.m104641e(lY);
        C69577g b = C69555b.m100961b(gVar);
        C71728j jVar = b instanceof C71728j ? (C71728j) b : null;
        if (jVar == null) {
            obj = C69788q.f186170a;
        } else {
            if (jVar.f191202a.mo62768f(lY)) {
                jVar.mo62982a(lY, C69788q.f186170a);
            } else {
                C71750ef efVar = new C71750ef();
                jVar.mo62982a(lY.plus(efVar), C69788q.f186170a);
                if (efVar.f191233b) {
                    C69788q qVar = C69788q.f186170a;
                    boolean z = C71600ba.f191036a;
                    ThreadLocal threadLocal = C71687dw.f191139a;
                    C71619bt a = C71687dw.m104785a();
                    if (!a.mo62848p()) {
                        if (a.mo62847o()) {
                            jVar.f191204c = qVar;
                            jVar.f191046f = 1;
                            a.mo62845m(jVar);
                            obj = C69554a.COROUTINE_SUSPENDED;
                        } else {
                            a.mo62846n(true);
                            try {
                                jVar.run();
                                do {
                                } while (a.mo62849q());
                            } catch (Throwable th) {
                                a.mo62844l(true);
                                throw th;
                            }
                            a.mo62844l(true);
                        }
                    }
                    obj = C69788q.f186170a;
                }
            }
            obj = C69554a.COROUTINE_SUSPENDED;
        }
        if (obj == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return obj == C69554a.COROUTINE_SUSPENDED ? obj : C69788q.f186170a;
    }
}
