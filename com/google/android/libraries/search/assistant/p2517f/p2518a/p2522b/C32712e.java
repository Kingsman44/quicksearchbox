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
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.e */
/* compiled from: PG */
final class C32712e implements C71588o {

    /* renamed from: a */
    final /* synthetic */ C32607ac f87672a;

    public C32712e(C32607ac acVar) {
        this.f87672a = acVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20883a(Object obj, C69577g gVar) {
        C32607ac acVar = this.f87672a;
        C32763p pVar = acVar.f87320k;
        List list = acVar.f87318i;
        C32796ar arVar = ((C32825bt) obj).f88023a;
        if (arVar == null) {
            arVar = C32796ar.f87973c;
        }
        C69664n.m101060f(arVar, "it.contextKey");
        C69664n.m101061g(list, "tags");
        C69664n.m101061g(arVar, "contextKey");
        try {
            pVar.f87908a.mo38033a(arVar);
        } catch (Throwable th) {
            C59052c cVar = (C59052c) C32607ac.f87310a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "Context.Consumer");
            C69664n.m101060f(cVar, "logger\n          .atWarning()");
            C59052c cVar2 = (C59052c) C32692dg.m60595a(cVar, list).mo56382g(th);
            String b = C32602g.m60429b(arVar);
            cVar2.mo56379ah(new C59094n(50568));
            cVar2.mo56389s("OnContextInvalidated failed; ignoring: %s", b);
        }
        return C69788q.f186170a;
    }
}
