package com.google.android.apps.gsa.staticplugins.p7666ci;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.ci.bq */
/* compiled from: PG */
final class C97806bq implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C58495hd f273098a;

    /* renamed from: b */
    final /* synthetic */ C53306j f273099b;

    /* renamed from: c */
    final /* synthetic */ C123777f f273100c;

    /* renamed from: d */
    final /* synthetic */ C97811bv f273101d;

    public C97806bq(C97811bv bvVar, C58495hd hdVar, C53306j jVar, C123777f fVar) {
        this.f273101d = bvVar;
        this.f273098a = hdVar;
        this.f273099b = jVar;
        this.f273100c = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        C59104x c = C97811bv.f273109a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "PCP.ImplV0");
        ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(30260)).mo56386p("Failed to get last update timestamp for potter.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        long longValue = ((Long) obj).longValue();
        long longValue2 = this.f273101d.f273131l.mo103694f(10).longValue();
        boolean booleanValue = ((Boolean) this.f273098a.getOrDefault(10, false)).booleanValue();
        if (this.f273101d.f273128i.mo26870b() >= longValue + longValue2 && booleanValue) {
            C58976aa aaVar = C58975e.f156826a;
            this.f273101d.mo90821k(this.f273099b, C58485gu.m89846n(10), true, true, this.f273100c);
        }
    }
}
