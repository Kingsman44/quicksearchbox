package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.p5579e.C71706an;
import kotlinx.coroutines.p5579e.C71726h;
import kotlinx.coroutines.p5580f.C71754b;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ax */
/* compiled from: PG */
public final class C71423ax {
    /* renamed from: a */
    public static final Object m104196a(C69630p pVar, C69577g gVar) {
        C71706an anVar = new C71706an(gVar.mo61340lY(), gVar);
        Object a = C71754b.m104942a(anVar, anVar, pVar);
        if (a == C69554a.COROUTINE_SUSPENDED) {
            C69664n.m101061g(gVar, "frame");
        }
        return a;
    }

    /* renamed from: b */
    public static final C71422aw m104197b(C69585o oVar) {
        C69664n.m101061g(oVar, "context");
        if (oVar.get(C71643cp.f191083c) == null) {
            oVar = oVar.plus(new C71646cs((C71643cp) null));
        }
        return new C71726h(oVar);
    }

    /* renamed from: c */
    public static final void m104198c(C71422aw awVar, CancellationException cancellationException) {
        C69664n.m101061g(awVar, "<this>");
        C71643cp cpVar = (C71643cp) awVar.mo5702lZ().get(C71643cp.f191083c);
        if (cpVar != null) {
            cpVar.mo62723u(cancellationException);
        } else {
            new StringBuilder("Scope cannot be cancelled because it does not have a job: ").append(awVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(awVar)));
        }
    }

    /* renamed from: d */
    public static final boolean m104199d(C71422aw awVar) {
        C69664n.m101061g(awVar, "<this>");
        C71643cp cpVar = (C71643cp) awVar.mo5702lZ().get(C71643cp.f191083c);
        if (cpVar != null) {
            return cpVar.mo62867mj();
        }
        return true;
    }
}
