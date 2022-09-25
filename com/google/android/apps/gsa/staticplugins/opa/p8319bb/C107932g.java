package com.google.android.apps.gsa.staticplugins.opa.p8319bb;

import com.google.android.apps.gsa.search.core.service.C86771n;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ClientConfig;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.g */
/* compiled from: PG */
public final class C107932g {

    /* renamed from: a */
    public C87682aj f300311a;

    /* renamed from: b */
    public ClientConfig f300312b = ClientConfig.f236948a;

    /* renamed from: a */
    public final boolean mo96337a(ServiceEventData serviceEventData) {
        C87682aj ajVar = this.f300311a;
        if (ajVar != null) {
            ((C86771n) ajVar).mo80379b(serviceEventData);
            return true;
        }
        C58976aa aaVar = C58975e.f156826a;
        int i = serviceEventData.f236959a.f238699b;
        C88244um umVar = C88244um.ATTACH_WEBVIEW;
        return false;
    }
}
