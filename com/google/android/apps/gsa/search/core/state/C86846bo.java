package com.google.android.apps.gsa.search.core.state;

import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4500cm.p4514b.C58170d;

/* renamed from: com.google.android.apps.gsa.search.core.state.bo */
/* compiled from: PG */
public final /* synthetic */ class C86846bo implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C86854bw f234556a;

    public /* synthetic */ C86846bo(C86854bw bwVar) {
        this.f234556a = bwVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C86854bw bwVar = this.f234556a;
        C58833ax axVar = (C58833ax) obj;
        if (axVar.mo56113h()) {
            C58170d dVar = (C58170d) axVar.mo56107c();
            C86853bv bvVar = bwVar.f234573e;
            if (bvVar == null) {
                C59104x d = C86854bw.f234569a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ClockworkState");
                ((C59052c) ((C59052c) d).mo56372aa(8674)).mo56389s("Received a ClockworkSearchResponse without a ClockworkSearch. Response = %s", dVar);
            } else {
                bvVar.f234566c = dVar;
                bvVar.mo80536a();
            }
            bwVar.mo80541f(bwVar.mo80538a());
            bwVar.mo80591ar();
        }
    }
}
