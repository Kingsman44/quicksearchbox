package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.common.base.C58832aw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.c */
/* compiled from: PG */
final class C88647c extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C88649e f239675a;

    public C88647c(C88649e eVar) {
        this.f239675a = eVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (!C58832aw.m90831a(intent.getStringExtra("old_account_name"), intent.getStringExtra("account_name"))) {
            C58976aa aaVar = C58975e.f156826a;
            this.f239675a.f239681e.mo83174n("cachedZeroPrefixResponse", (Parcelable) null);
        }
    }
}
