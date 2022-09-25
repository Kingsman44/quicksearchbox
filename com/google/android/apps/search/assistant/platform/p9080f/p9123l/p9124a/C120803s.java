package com.google.android.apps.search.assistant.platform.p9080f.p9123l.p9124a;

import com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120550ag;
import com.google.android.apps.search.assistant.platform.p9080f.p9094e.p9096b.C120560k;
import com.google.android.apps.search.assistant.platform.p9080f.p9097f.C120601c;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.List;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.a.s */
/* compiled from: PG */
public final class C120803s extends C68247h {

    /* renamed from: a */
    private final C68283d f335956a;

    /* renamed from: c */
    private final C68283d f335957c;

    public C120803s(C69464a aVar, C69464a aVar2, C68283d dVar, C68283d dVar2) {
        super(aVar2, new C68277d(C120803s.class), aVar);
        this.f335956a = C68236af.m98549d(dVar);
        this.f335957c = C68236af.m98549d(dVar2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C60870cx mo20481a(Object obj) {
        List list = (List) obj;
        C120550ag agVar = (C120550ag) list.get(0);
        C120601c cVar = (C120601c) list.get(1);
        C69664n.m101061g(cVar, "result");
        if (!agVar.f335259d.get()) {
            C120560k a = agVar.f335257b.mo104837a(cVar);
            C120560k kVar = (C120560k) agVar.f335258c.getAndSet(a);
            if (kVar != null) {
                C58976aa aaVar = C58975e.f156826a;
                kVar.mo104836c();
            }
            if (agVar.f335259d.get()) {
                C59052c cVar2 = (C59052c) C120550ag.f335256a.mo56224b();
                cVar2.mo56378ag(C58975e.f156826a, "SBExecutionController");
                cVar2.mo56379ah(new C59094n(35510));
                cVar2.mo56386p("controller is shutdown, abort pending session");
                C120560k kVar2 = (C120560k) agVar.f335258c.getAndSet((Object) null);
                if (kVar2 != null) {
                    kVar2.mo104836c();
                }
            }
            return C60856cj.m92900i(a);
        }
        throw new IllegalStateException("controller has been shut down.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C60856cj.m92897f(this.f335956a.mo60297gq(), this.f335957c.mo60297gq());
    }
}
