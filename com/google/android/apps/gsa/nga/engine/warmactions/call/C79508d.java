package com.google.android.apps.gsa.nga.engine.warmactions.call;

import android.content.Intent;
import com.google.android.apps.gsa.nga.engine.warmactions.call.incallservice.WarmActionsInCallService;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.android.libraries.search.assistant.incallservice.IncomingCallInCallService;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.call.d */
/* compiled from: PG */
public final /* synthetic */ class C79508d implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C79525l f218211a;

    public /* synthetic */ C79508d(C79525l lVar) {
        this.f218211a = lVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        C79525l lVar = this.f218211a;
        lVar.mo74118e(1);
        if (lVar.f218234c.mo85405j(C90126fx.f251472jU)) {
            Intent intent = new Intent(lVar.f218233b, IncomingCallInCallService.class);
            intent.setAction("local_incallservice_intent");
            if (!lVar.f218233b.bindService(intent, lVar.f218236e, 1)) {
                ((C58970a) ((C58970a) C79525l.f218230a.mo56225c()).mo56372aa(5602)).mo56386p("#MWW Error binding to service");
            }
        } else {
            Intent intent2 = new Intent(lVar.f218233b, WarmActionsInCallService.class);
            intent2.setAction("local_agsa_incallservice_intent");
            if (!lVar.f218233b.bindService(intent2, lVar.f218236e, 1)) {
                ((C58970a) ((C58970a) C79525l.f218230a.mo56225c()).mo56372aa(5601)).mo56386p("#MWW Error binding to service");
            }
        }
        return C118826c.f331422a;
    }
}
