package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import p5462h.C69788q;
import p5462h.p5473f.p5474a.C69615a;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.ae */
/* compiled from: PG */
final class C120043ae extends C69665o implements C69615a {

    /* renamed from: a */
    final /* synthetic */ C120042ad f334204a;

    /* renamed from: b */
    final /* synthetic */ C120045ag f334205b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120043ae(C120042ad adVar, C120045ag agVar) {
        super(0);
        this.f334204a = adVar;
        this.f334205b = agVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5672a() {
        C59052c cVar = (C59052c) C120045ag.f334210a.mo56224b();
        cVar.mo56378ag(C58975e.f156826a, "TRG.VIS.Conformity");
        C120042ad adVar = this.f334204a;
        cVar.mo56379ah(new C59094n(34648));
        cVar.mo56389s("Cancelling conformity tracking session(%s).", adVar);
        if (this.f334205b.f334211b.mo62808g(this.f334204a, (Object) null)) {
            return C69788q.f186170a;
        }
        throw new CancellationException("Unexpected session reference value.");
    }
}
