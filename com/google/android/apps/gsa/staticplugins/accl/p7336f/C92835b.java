package com.google.android.apps.gsa.staticplugins.accl.p7336f;

import com.google.android.apps.gsa.search.core.service.C86610af;
import com.google.android.apps.gsa.search.core.service.C86775r;
import com.google.android.apps.gsa.search.shared.service.ServiceEventData;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.accl.f.b */
/* compiled from: PG */
public final /* synthetic */ class C92835b implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C92836c f259028a;

    /* renamed from: b */
    public final /* synthetic */ ServiceEventData f259029b;

    public /* synthetic */ C92835b(C92836c cVar, ServiceEventData serviceEventData) {
        this.f259028a = cVar;
        this.f259029b = serviceEventData;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        boolean z;
        C92836c cVar = this.f259028a;
        ServiceEventData serviceEventData = this.f259029b;
        C86775r rVar = ((C86610af) cVar.f259031b.mo27525b()).f233977l;
        if (rVar != null) {
            rVar.f234383e.mo80379b(serviceEventData);
            z = true;
        } else {
            ((C59052c) ((C59052c) C92836c.f259030a.mo56225c()).mo56372aa(13465)).mo56386p("Failed to send ServiceEventData: no active attached client.");
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
