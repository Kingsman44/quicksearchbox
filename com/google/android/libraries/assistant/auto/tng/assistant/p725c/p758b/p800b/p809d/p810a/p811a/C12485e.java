package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p800b.p809d.p810a.p811a;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.b.d.a.a.e */
/* compiled from: PG */
final class C12485e implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ ArrayList f39378a;

    /* renamed from: b */
    final /* synthetic */ C12497q f39379b;

    public C12485e(C12497q qVar, ArrayList arrayList) {
        this.f39379b = qVar;
        this.f39378a = arrayList;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        this.f39379b.f39406c.f155056f.mo54590g(th);
        Collection.EL.stream(this.f39378a).forEach(C12484d.f39377a);
        if (!(th instanceof CancellationException) || !((Boolean) this.f39379b.f39405b.mo17428b()).booleanValue()) {
            C59104x d = C12497q.f39404a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "InteractionStateStreamI");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(44282)).mo56386p("A dependent stream of InteractionState stream failed.");
            return;
        }
        C59104x b = C12497q.f39404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionStateStreamI");
        ((C59052c) ((C59052c) b).mo56372aa(44283)).mo56386p("A dependent stream of InteractionState stream cancelled.");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        List list = (List) obj;
        C59104x b = C12497q.f39404a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "InteractionStateStreamI");
        ((C59052c) ((C59052c) b).mo56372aa(44284)).mo56386p("InteractionState Channel ended.");
        this.f39379b.f39406c.f155056f.mo54589f(false);
    }
}
