package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.d */
/* compiled from: PG */
final class C32308d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32310f f86544a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32308d(C32310f fVar) {
        super(1);
        this.f86544a = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            C59052c cVar = (C59052c) C32313i.f86565a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32941s.m60951b(this.f86544a.f86548a);
            cVar.mo56379ah(new C59094n(52544));
            cVar.mo56389s("Successfully cleaned up session. SessionToken: %s.", b);
        } else {
            C59052c cVar2 = (C59052c) C32313i.f86565a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
            String b2 = C32941s.m60951b(this.f86544a.f86548a);
            cVar3.mo56379ah(new C59094n(52543));
            cVar3.mo56389s("Failed to clean up session. SessionToken: %s.", b2);
        }
        return C69788q.f186170a;
    }
}
