package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107505a;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107554c;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.C107556e;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107508ab;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107510ad;
import com.google.android.apps.gsa.staticplugins.opa.p8300as.p8303b.p8304a.C107528g;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113898b;
import com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w;
import com.google.common.p4522b.C58723pp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59753ej;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.l */
/* compiled from: PG */
public final /* synthetic */ class C107701l implements C87682aj {

    /* renamed from: a */
    public final /* synthetic */ C107703n f299694a;

    public /* synthetic */ C107701l(C107703n nVar) {
        this.f299694a = nVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        Object obj;
        C107703n nVar = this.f299694a;
        if (nVar.f299702g) {
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            if (a == C88244um.OPA_SESSION_SERVICE_EVENT) {
                Query query = serviceEventData.mo81913d(Query.class) ? (Query) serviceEventData.mo81912b(Query.class) : null;
                if (query != null && query.mo84363bw("android.opa.extra.SUPPRESS_OPA_UI")) {
                    long j = query.f252749G;
                    C62940bt btVar = C107505a.f299120a;
                    C88246uo uoVar = serviceEventData.f236959a;
                    C62940bt r3 = C62942bv.checkIsLite(btVar);
                    uoVar.mo58887l(r3);
                    if (!uoVar.f169962ag.mo58857o(r3.f169971d)) {
                        C59104x d = C107703n.f299696a.mo56226d();
                        d.mo56378ag(C58975e.f156826a, "OSSClientManager");
                        C59052c cVar = (C59052c) ((C59052c) d).mo56372aa(26059);
                        C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
                        if (a2 == null) {
                            a2 = C88244um.ATTACH_WEBVIEW;
                        }
                        cVar.mo56387q("handleServiceEventData: %s missing OpaSessionServiceEvent extension", a2.f238695cJ);
                        return;
                    }
                    C107556e eVar = (C107556e) serviceEventData.mo81918e(C107505a.f299120a);
                    C107706q qVar = C107706q.CONNECTED;
                    int a3 = C107554c.m178398a(eVar.f299213b);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int i = a3 - 1;
                    if (i == 5) {
                        C62940bt r32 = C62942bv.checkIsLite(C107508ab.f299127a);
                        eVar.mo58887l(r32);
                        Object l = eVar.f169962ag.mo58854l(r32.f169971d);
                        if (l == null) {
                            obj = r32.f169969b;
                        } else {
                            obj = r32.mo58889c(l);
                        }
                        C107510ad adVar = (C107510ad) obj;
                        C59753ej ejVar = adVar.f299131b;
                        if (ejVar == null) {
                            ejVar = C59753ej.f161449e;
                        }
                        if (ejVar.f161452b != 524292) {
                            C113919w wVar = (C113919w) ((C58723pp) C113898b.f315353a).f156468c.get(nVar.f299698c.mo100757a(adVar));
                            if (wVar == null) {
                                wVar = C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_FAILURE_GENERIC_ERROR;
                            }
                            nVar.f299699d.mo100774c(j, wVar);
                        }
                    } else if (i == 6) {
                        C62940bt r33 = C62942bv.checkIsLite(C107528g.f299162a);
                        eVar.mo58887l(r33);
                        if (eVar.f169962ag.mo58857o(r33.f169971d)) {
                            nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_OPA_ENDSTATE_CANCEL_NEW_HOTWORD);
                        }
                    } else if (i == 7) {
                        nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_ACTION_V2_FOLLOW_ON_QUERY_COMMIT);
                    } else if (i == 10) {
                        nVar.f299699d.mo100774c(j, C113919w.HANDOVER_WITHOUT_UI_NO_SPEECH_DETECTED);
                    }
                }
            }
        }
    }
}
