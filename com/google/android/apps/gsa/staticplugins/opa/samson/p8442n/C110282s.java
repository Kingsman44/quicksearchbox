package com.google.android.apps.gsa.staticplugins.opa.samson.p8442n;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.n.s */
/* compiled from: PG */
final class C110282s extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C110283t f307312a;

    public C110282s(C110283t tVar) {
        this.f307312a = tVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C59104x b = C110283t.f307313a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "SmartSpaceCtrl");
        C59052c cVar = (C59052c) b;
        cVar.mo56378ag(C58975e.f156826a, "SmartSpaceIntent");
        ((C59052c) cVar.mo56372aa(25945)).mo56389s("Received %s", intent);
        if ("com.google.android.apps.gsa.ambient.UPDATE_GENERIC_CARD_INTERNAL".equals(intent.getAction())) {
            this.f307312a.f307318f.mo98537a();
        }
    }
}
