package com.google.android.apps.gsa.staticplugins.bisto.p7520u.p7522b;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.base.C58879cp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.u.b.bg */
/* compiled from: PG */
public final /* synthetic */ class C96011bg implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C96017bm f268819a;

    /* renamed from: b */
    public final /* synthetic */ Set f268820b;

    public /* synthetic */ C96011bg(C96017bm bmVar, Set set) {
        this.f268819a = bmVar;
        this.f268820b = set;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C96017bm bmVar = this.f268819a;
        Set set = this.f268820b;
        for (C124548d dVar : (List) obj) {
            String R = dVar.mo106477R();
            if (!C58879cp.m90962d(R) && Collection.EL.stream(set).anyMatch(new C95958ag(R)) && dVar.mo106521s() == C124636bb.OPA_ENABLED) {
                C59104x b = C96017bm.f268828a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "BistoGacsManager");
                ((C59052c) ((C59052c) b).mo56372aa(15678)).mo56386p("About to disable assistant due to capability change");
                bmVar.mo89885i(dVar.mo106475P());
            }
        }
    }
}
