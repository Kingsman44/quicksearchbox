package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2519a.C32602g;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32796ar;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71803m;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.du */
/* compiled from: PG */
final class C32706du extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ List f87656a;

    /* renamed from: b */
    final /* synthetic */ C32796ar f87657b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f87658c;

    /* renamed from: d */
    final /* synthetic */ C32750fk f87659d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32706du(List list, C32796ar arVar, C71422aw awVar, C32750fk fkVar) {
        super(0);
        this.f87656a = list;
        this.f87657b = arVar;
        this.f87658c = awVar;
        this.f87659d = fkVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C32716ed.f87685b.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "Context.Source");
        C69664n.m101060f(cVar, "logger\n                  .atInfo()");
        C59052c a = C32692dg.m60595a(cVar, this.f87656a);
        String b = C32602g.m60429b(this.f87657b);
        a.mo56379ah(new C59094n(50595));
        a.mo56389s("Invalidation request: %s", b);
        C71803m.m105043d(this.f87658c, (C69585o) null, (C71424ay) null, new C32705dt(this.f87659d, this.f87656a, this.f87657b, (C69577g) null), 3);
        return C69788q.f186170a;
    }
}
