package p5462h.p5463a;

import java.util.Collections;
import java.util.List;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: h.a.y */
/* compiled from: PG */
class C69541y {
    /* renamed from: a */
    public static final List m100943a(List list) {
        C69664n.m101061g(list, "builder");
        C69469c cVar = (C69469c) list;
        if (cVar.f185888e == null) {
            cVar.mo61072c();
            cVar.f185887d = true;
            return cVar;
        }
        throw new IllegalStateException();
    }

    /* renamed from: b */
    public static final List m100944b(Object obj) {
        List singletonList = Collections.singletonList(obj);
        C69664n.m101060f(singletonList, "singletonList(element)");
        return singletonList;
    }
}
