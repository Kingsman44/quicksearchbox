package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8324e.p8325a.p8326a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80115c;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6277b.C80116d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106285m;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8196c.p8199c.C106286n;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.e.a.a.f */
/* compiled from: PG */
public final /* synthetic */ class C107809f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107820q f299982a;

    /* renamed from: b */
    public final /* synthetic */ C106286n f299983b;

    public /* synthetic */ C107809f(C107820q qVar, C106286n nVar) {
        this.f299982a = qVar;
        this.f299983b = nVar;
    }

    public final void run() {
        C80116d dVar;
        C80116d dVar2;
        C113919w wVar;
        C107820q qVar = this.f299982a;
        C106286n nVar = this.f299983b;
        Query a = qVar.f300024c.mo96253a();
        if (nVar.f296546b == 4) {
            dVar = (C80116d) nVar.f296547c;
        } else {
            dVar = C80116d.f219831d;
        }
        String str = dVar.f219834b;
        if (str.isEmpty() || C39191a.m68622a(str) == a.f252749G) {
            C59104x b = C107820q.f300003a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "NgaClientEventSubCtrl");
            ((C59052c) ((C59052c) b).mo56372aa(26344)).mo56389s("handleCancelRecognitionEvent(%s): cancel query", str);
            qVar.f300024c.mo96257e(qVar.mo96298c(qVar.f300023b.mo84259V().mo84244G(true).mo84302an("android.opa.extra.RECOGNITION_CANCEL_BY_NGA", true)));
            qVar.f300036o = 3;
            qVar.f300035n = C58833ax.m90834k(Long.valueOf(a.f252749G));
            qVar.mo96305j(21);
            C113919w wVar2 = C113919w.NO_CONNECTIVITY;
            C106285m mVar = C106285m.INITIALIZE_QUERY_EVENT_DATA;
            if (nVar.f296546b == 4) {
                dVar2 = (C80116d) nVar.f296547c;
            } else {
                dVar2 = C80116d.f219831d;
            }
            int a2 = C80115c.m128084a(dVar2.f219835c);
            if (a2 == 0) {
                a2 = 1;
            }
            if (a2 - 1 != 1) {
                wVar = C113919w.CANCELED;
            } else {
                wVar = C113919w.GRAPH_FAILURE;
            }
            qVar.f300032k.mo100774c(a.f252749G, wVar);
            qVar.mo96301f(a.f252749G);
        }
    }
}
