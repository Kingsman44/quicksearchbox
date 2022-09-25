package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ct */
/* compiled from: PG */
public final /* synthetic */ class C71647ct {
    /* renamed from: a */
    public static final Object m104637a(C71643cp cpVar, C69577g gVar) {
        cpVar.mo62723u((CancellationException) null);
        Object o = cpVar.mo62869o(gVar);
        return o == C69554a.COROUTINE_SUSPENDED ? o : C69788q.f186170a;
    }

    /* renamed from: b */
    public static final C71643cp m104638b(C69585o oVar) {
        C69664n.m101061g(oVar, "<this>");
        C71643cp cpVar = (C71643cp) oVar.get(C71643cp.f191083c);
        if (cpVar != null) {
            return cpVar;
        }
        new StringBuilder("Current context doesn't contain Job in it: ").append(oVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(oVar)));
    }

    /* renamed from: c */
    public static final void m104639c(C69585o oVar, CancellationException cancellationException) {
        C69664n.m101061g(oVar, "<this>");
        C71643cp cpVar = (C71643cp) oVar.get(C71643cp.f191083c);
        if (cpVar != null) {
            cpVar.mo62723u(cancellationException);
        }
    }

    /* renamed from: d */
    public static final void m104640d(C71643cp cpVar, String str, Throwable th) {
        C69664n.m101061g(cpVar, "<this>");
        cpVar.mo62723u(C71629cb.m104602a(str, th));
    }

    /* renamed from: e */
    public static final void m104641e(C69585o oVar) {
        C69664n.m101061g(oVar, "<this>");
        C71643cp cpVar = (C71643cp) oVar.get(C71643cp.f191083c);
        if (cpVar != null) {
            m104642f(cpVar);
        }
    }

    /* renamed from: f */
    public static final void m104642f(C71643cp cpVar) {
        if (!cpVar.mo62867mj()) {
            throw cpVar.mo62870p();
        }
    }
}
