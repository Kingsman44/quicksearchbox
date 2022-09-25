package com.google.android.apps.gsa.staticplugins.opa.worker.p8614i;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88347yh;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8519o.C111708as;
import com.google.assistant.p3858ar.p3859a.C49727q;
import com.google.assistant.p3858ar.p3859a.C49728r;
import com.google.assistant.p3858ar.p3859a.C49736z;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.worker.i.j */
/* compiled from: PG */
public final /* synthetic */ class C114353j implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C114361r f317073a;

    /* renamed from: b */
    public final /* synthetic */ long f317074b;

    public /* synthetic */ C114353j(C114361r rVar, long j) {
        this.f317073a = rVar;
        this.f317074b = j;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C114361r rVar = this.f317073a;
        long j = this.f317074b;
        C88347yh yhVar = (C88347yh) obj;
        int i = 1;
        if ((yhVar.f238925a & 1) != 0) {
            C49736z zVar = yhVar.f238926b;
            if (zVar == null) {
                zVar = C49736z.f128420e;
            }
            if ((zVar.f128422a & 2) != 0) {
                C49736z zVar2 = yhVar.f238926b;
                if (zVar2 == null) {
                    zVar2 = C49736z.f128420e;
                }
                C49728r rVar2 = zVar2.f128424c;
                if (rVar2 == null) {
                    rVar2 = C49728r.f128339j;
                }
                int a = C49727q.m85711a(rVar2.f128348h);
                if (a != 0) {
                    i = a;
                }
                if (((C86124t) rVar.f317085c.mo27525b()).mo79746e(C90063do.f249428dO)) {
                    if (j > 0) {
                        if (i == 3) {
                            rVar.f317086f.mo28213m("Retry Tapas Suggestion request", ((C86124t) rVar.f317085c.mo27525b()).mo79743a(C90063do.f249631hf), new C114352i(rVar, j));
                            return;
                        }
                    } else {
                        return;
                    }
                }
                if (i == 2) {
                    ((C111708as) rVar.f317084b.mo27525b()).mo99213e(rVar2);
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) C114361r.f317083a.mo56226d()).mo56372aa(29092)).mo56386p("Invalid response: resEventData doesn't contain valid Tapas Response");
            return;
        }
        ((C59052c) ((C59052c) C114361r.f317083a.mo56226d()).mo56372aa(29090)).mo56386p("#prefetchTapasZeroPrefixSuggestions - tapas search does NOT have service response.");
    }
}
