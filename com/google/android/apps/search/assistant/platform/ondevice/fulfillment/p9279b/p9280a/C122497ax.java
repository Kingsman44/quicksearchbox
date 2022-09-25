package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122396ao;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.ax */
/* compiled from: PG */
public final /* synthetic */ class C122497ax implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122501ba f339584a;

    public /* synthetic */ C122497ax(C122501ba baVar) {
        this.f339584a = baVar;
    }

    public final void run() {
        C122501ba baVar = this.f339584a;
        C122396ao aoVar = C122396ao.PART;
        int i = baVar.f339596c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 0) {
            baVar.f339596c = 2;
            Collection.EL.stream(baVar.f339595b.values()).forEach(C122495av.f339582a);
            baVar.f339595b.clear();
        } else if (i2 == 1) {
            C59104x d = C122504bd.f339601a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) d).mo56372aa(34783)).mo56386p("onCompleted called twice");
        } else if (i2 == 2) {
            C59104x d2 = C122504bd.f339601a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) d2).mo56372aa(34784)).mo56386p("onCompleted called after onError");
        }
    }
}
