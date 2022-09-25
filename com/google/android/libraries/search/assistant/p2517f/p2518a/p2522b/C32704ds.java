package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32825bt;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.ds */
/* compiled from: PG */
final class C32704ds implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C32680cv f87649a;

    /* renamed from: b */
    final /* synthetic */ List f87650b;

    /* renamed from: c */
    final /* synthetic */ C32750fk f87651c;

    public C32704ds(C32680cv cvVar, List list, C32750fk fkVar) {
        this.f87649a = cvVar;
        this.f87650b = list;
        this.f87651c = fkVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C32796ar arVar = ((C32825bt) obj).f88023a;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        C69664n.m101060f(arVar, "it.contextKey");
        if (this.f87649a.mo38241b(arVar)) {
            return C69788q.f186170a;
        }
        C59052c cVar = (C59052c) C32716ed.f87685b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger\n              .atInfo()");
        C59052c a = C32692dg.m60595a(cVar, this.f87650b);
        String b = C32602g.m60429b(arVar);
        a.mo56379ah(new C59094n(50594));
        a.mo56389s("Parent invalidation request: %s", b);
        Object c = this.f87651c.mo38273c(this.f87650b, arVar, gVar);
        return c != C69554a.COROUTINE_SUSPENDED ? C69788q.f186170a : c;
    }
}
