package com.google.android.apps.gsa.searchbox.client.gsa.p6953ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.searchbox.client.gsa.ui.d */
/* compiled from: PG */
final class C88648d extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C88649e f239676a;

    public C88648d(C88649e eVar) {
        this.f239676a = eVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent.hasExtra("enable-trends") && !intent.getBooleanExtra("enable-trends", true)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f239676a.f239681e.mo83174n("cachedZeroPrefixResponse", (Parcelable) null);
        }
    }
}
