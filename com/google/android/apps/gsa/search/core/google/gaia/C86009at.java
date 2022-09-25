package com.google.android.apps.gsa.search.core.google.gaia;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.google.gaia.at */
/* compiled from: PG */
final class C86009at extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C86013ax f232540a;

    public C86009at(C86013ax axVar) {
        this.f232540a = axVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.getAction().equals("android.intent.action.APPLICATION_RESTRICTIONS_CHANGED")) {
            C59104x d = C86013ax.f232544a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "Search.LoginHelperImpl");
            ((C59052c) ((C59052c) d).mo56372aa(8035)).mo56386p("ApplicationRestrictionsChangedBroadcastReceiver called with wrong intent.");
            return;
        }
        this.f232540a.mo79663J();
        C58976aa aaVar = C58975e.f156826a;
        this.f232540a.f232556d.mo28212l("Updating supervision info for accounts.", new C86008as(this));
    }
}
