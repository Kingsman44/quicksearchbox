package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.libraries.search.assistant.f.a.b.eh */
/* compiled from: PG */
final class C32720eh extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C32721ei f87698a;

    /* renamed from: b */
    final /* synthetic */ List f87699b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32720eh(C32721ei eiVar, List list) {
        super(1);
        this.f87698a = eiVar;
        this.f87699b = list;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        Throwable th = (Throwable) obj;
        if (this.f87698a.f87702c.decrementAndGet() == 0 && !this.f87698a.f87701b.mo62875x()) {
            C59052c cVar = (C59052c) C32721ei.f87700a.mo56224b();
            cVar.mo56378ag(C58975e.f156826a, "Context.Cache");
            C69664n.m101060f(cVar, "logger.atInfo()");
            C59052c a = C32692dg.m60595a(cVar, this.f87699b);
            a.mo56379ah(new C59094n(50601));
            a.mo56386p("Canceling because there are no longer any owners");
            this.f87698a.f87701b.mo62723u(new CancellationException("The task no longer has any owners"));
        }
        return C69788q.f186170a;
    }
}
