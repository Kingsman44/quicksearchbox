package com.google.android.apps.gsa.staticplugins.opa.p8313ay;

import com.google.android.apps.gsa.opa.C83607e;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.searchbox.shared.response.Response;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ay.ad */
/* compiled from: PG */
final class C107644ad implements C87682aj {

    /* renamed from: a */
    final /* synthetic */ C107656ap f299476a;

    public C107644ad(C107656ap apVar) {
        this.f299476a = apVar;
    }

    /* renamed from: fM */
    public final void mo19965fM(ServiceEventData serviceEventData) {
        C83607e eVar = C83607e.UNDEFINED;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        if (a.ordinal() == 40) {
            C58976aa aaVar = C58975e.f156826a;
            this.f299476a.mo96194v((Response) serviceEventData.mo81912b(Response.class), false);
        }
    }
}
