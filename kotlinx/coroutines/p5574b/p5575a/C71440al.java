package kotlinx.coroutines.p5574b.p5575a;

import kotlinx.coroutines.p5573a.C71367au;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.b.a.al */
/* compiled from: PG */
public final class C71440al implements C71588o {

    /* renamed from: a */
    private final C71367au f190655a;

    public C71440al(C71367au auVar) {
        C69664n.m101061g(auVar, "channel");
        this.f190655a = auVar;
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        Object v = this.f190655a.mo62729v(obj, gVar);
        return v == C69554a.COROUTINE_SUSPENDED ? v : C69788q.f186170a;
    }
}
