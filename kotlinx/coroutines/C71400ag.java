package kotlinx.coroutines;

import kotlinx.coroutines.p5579e.C71707ao;
import p5462h.C69702k;
import p5462h.C69714l;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5468b.p5469a.C69566d;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: kotlinx.coroutines.ag */
/* compiled from: PG */
public final class C71400ag {
    /* renamed from: a */
    public static final Object m104164a(Object obj, C69577g gVar) {
        C69664n.m101061g(gVar, "uCont");
        if (!(obj instanceof C71396ac)) {
            return obj;
        }
        Throwable th = ((C71396ac) obj).f190604b;
        if (C71600ba.f191037b && (gVar instanceof C69566d)) {
            th = C71707ao.m104840a(th, (C69566d) gVar);
        }
        return C69714l.m101133a(th);
    }

    /* renamed from: b */
    public static final Object m104165b(Object obj, C69626l lVar) {
        Throwable a = C69702k.m101124a(obj);
        if (a != null) {
            return new C71396ac(a, false);
        }
        if (lVar != null) {
            return new C71397ad(obj, lVar);
        }
        return obj;
    }
}
