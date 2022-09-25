package kotlinx.coroutines.p5574b;

import kotlinx.coroutines.p5574b.p5575a.C71434af;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69648ae;

/* renamed from: kotlinx.coroutines.b.bt */
/* compiled from: PG */
final class C71516bt implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C69648ae f190861a;

    public C71516bt(C69648ae aeVar) {
        this.f190861a = aeVar;
    }

    /* renamed from: a */
    public final Object mo20883a(Object obj, C69577g gVar) {
        C69648ae aeVar = this.f190861a;
        if (aeVar.f186027a == C71434af.f190644a) {
            aeVar.f186027a = obj;
            return C69788q.f186170a;
        }
        throw new IllegalArgumentException("Flow has more than one element");
    }
}
