package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87760co;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87765ct;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87767cv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87768cw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.k */
/* compiled from: PG */
public final /* synthetic */ class C107700k implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C107703n f299693a;

    public /* synthetic */ C107700k(C107703n nVar) {
        this.f299693a = nVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C107703n nVar = this.f299693a;
        if (nVar.f299702g) {
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            if (a == C88244um.CONVERSATION_SURFACE_EVENT) {
                Query query = serviceEventData.mo81913d(Query.class) ? (Query) serviceEventData.mo81912b(Query.class) : null;
                if (query != null && query.mo84363bw("android.opa.extra.SUPPRESS_OPA_UI")) {
                    long j = query.f252749G;
                    C58976aa aaVar = C58975e.f156826a;
                    C87768cw cwVar = (C87768cw) serviceEventData.mo81918e(C87760co.f237522a);
                    int a2 = C87765ct.m142765a(cwVar.f237532e);
                    if (a2 != 0 && a2 == 3) {
                        C107706q qVar = C107706q.CONNECTED;
                        int a3 = C87767cv.m142766a(cwVar.f237533f);
                        if (a3 == 0) {
                            a3 = 1;
                        }
                        int i = a3 - 1;
                        if (i == 1) {
                            nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_DONE);
                        } else if (i == 2) {
                            nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_FAILED);
                        } else if (i == 3) {
                            nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_CANCELLED);
                        }
                    }
                }
            }
        }
    }
}
