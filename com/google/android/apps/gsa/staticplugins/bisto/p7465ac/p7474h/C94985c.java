package com.google.android.apps.gsa.staticplugins.bisto.p7465ac.p7474h;

import android.content.Intent;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ac.h.c */
/* compiled from: PG */
public final /* synthetic */ class C94985c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C94995m f265725a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f265726b;

    public /* synthetic */ C94985c(C94995m mVar, ServiceEventData serviceEventData) {
        this.f265725a = mVar;
        this.f265726b = serviceEventData;
    }

    public final void run() {
        C94995m mVar = this.f265725a;
        ServiceEventData serviceEventData = this.f265726b;
        C59104x b = C94995m.f265738a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "GacsQueryHandler");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(17807);
        C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a == null) {
            a = C88244um.ATTACH_WEBVIEW;
        }
        cVar.mo56389s("onServiceEvent: %s", a);
        C88244um a2 = C88244um.m142794a(serviceEventData.f236959a.f238699b);
        if (a2 == null) {
            a2 = C88244um.ATTACH_WEBVIEW;
        }
        if (a2.ordinal() != 50) {
            mVar.f265761x.mo88898d(serviceEventData);
        } else {
            mVar.f265743f.mo89823a((Intent) serviceEventData.mo81912b(Intent.class));
        }
    }
}
