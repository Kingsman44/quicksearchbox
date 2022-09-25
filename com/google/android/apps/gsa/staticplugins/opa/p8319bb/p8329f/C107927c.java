package com.google.android.apps.gsa.staticplugins.opa.p8319bb.p8329f;

import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bb.f.c */
/* compiled from: PG */
public final /* synthetic */ class C107927c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C107929e f300290a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f300291b;

    public /* synthetic */ C107927c(C107929e eVar, ServiceEventData serviceEventData) {
        this.f300290a = eVar;
        this.f300291b = serviceEventData;
    }

    public final void run() {
        C107929e eVar = this.f300290a;
        ServiceEventData serviceEventData = this.f300291b;
        if (!eVar.f300307q) {
            C88244um a = C88244um.m142794a(serviceEventData.f236959a.f238699b);
            if (a == null) {
                a = C88244um.ATTACH_WEBVIEW;
            }
            if (a == C88244um.NEW_ASSISTANT_RESPONSE_RECEIVED) {
                eVar.mo96335n();
                return;
            }
            return;
        }
        ((C59052c) ((C59052c) C107929e.f300292a.mo56225c()).mo56372aa(26368)).mo56386p("onServiceEvent called after cleanup was performed.");
    }
}
