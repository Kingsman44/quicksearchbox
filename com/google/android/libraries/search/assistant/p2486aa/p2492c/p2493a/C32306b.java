package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2493a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.android.libraries.search.assistant.p2517f.p2532b.C32941s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.a.b */
/* compiled from: PG */
final class C32306b extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32796ar f86534a;

    /* renamed from: b */
    final /* synthetic */ C32310f f86535b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32306b(C32796ar arVar, C32310f fVar) {
        super(1);
        this.f86534a = arVar;
        this.f86535b = fVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (th == null) {
            C59052c cVar = (C59052c) C32313i.f86565a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Sbcp");
            String b = C32602g.m60429b(this.f86534a);
            String b2 = C32941s.m60951b(this.f86535b.f86548a);
            cVar.mo56379ah(new C59094n(52542));
            cVar.mo56354G("Successfully scheduled context update for key: %s. SessionToken: %s.", b, b2);
        } else {
            C59052c cVar2 = (C59052c) C32313i.f86565a.mo56226d();
            cVar2.mo56378ag(C58975e.f156826a, "Sbcp");
            C59052c cVar3 = (C59052c) cVar2.mo56382g(th);
            String b3 = C32602g.m60429b(this.f86534a);
            String b4 = C32941s.m60951b(this.f86535b.f86548a);
            cVar3.mo56379ah(new C59094n(52541));
            cVar3.mo56354G("Context update failed for key: %s. SessionToken: %s.", b3, b4);
        }
        return C69788q.f186170a;
    }
}
