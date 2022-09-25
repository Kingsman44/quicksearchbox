package com.google.android.apps.gsa.staticplugins.opa.morris2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.morris2.k */
/* compiled from: PG */
final class C109708k extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C109710m f305618a;

    public C109708k(C109710m mVar) {
        this.f305618a = mVar;
    }

    public final void onReceive(Context context, Intent intent) {
        C59071e eVar = C109710m.f305620a;
        C58976aa aaVar = C58975e.f156826a;
        intent.getAction();
        if ("com.google.android.apps.gsa.staticplugins.opa.morris.shared.INTENT_ACTION_EXIT_CAR_MODE".equals(intent.getAction())) {
            this.f305618a.f305633h.mo21430d(C37182a.f97998eR.mo40813g(), this.f305618a.f305629d.e());
            this.f305618a.mo98038m();
        }
    }
}
