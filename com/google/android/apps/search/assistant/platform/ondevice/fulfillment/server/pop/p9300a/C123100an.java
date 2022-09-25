package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.p9300a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C122985af;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123001av;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123002aw;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9298j.C123011be;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123140c;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.a.an */
/* compiled from: PG */
public final /* synthetic */ class C123100an implements C123011be {

    /* renamed from: a */
    public final /* synthetic */ C123101ao f340719a;

    /* renamed from: b */
    public final /* synthetic */ C123002aw f340720b;

    /* renamed from: c */
    public final /* synthetic */ C123140c f340721c;

    public /* synthetic */ C123100an(C123101ao aoVar, C123002aw awVar, C123140c cVar) {
        this.f340719a = aoVar;
        this.f340720b = awVar;
        this.f340721c = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo105827a(C122985af afVar) {
        C123101ao aoVar = this.f340719a;
        C123002aw awVar = this.f340720b;
        C123140c cVar = this.f340721c;
        ((C59052c) ((C59052c) C123101ao.f340722a.mo56224b()).mo56372aa(35073)).mo56386p("Creating new POP");
        C123001av a = awVar.mo105822a();
        synchronized (aoVar) {
            aoVar.f340724c = a;
        }
        return cVar.mo105872a(new C123099am(aoVar), afVar, a);
    }
}
