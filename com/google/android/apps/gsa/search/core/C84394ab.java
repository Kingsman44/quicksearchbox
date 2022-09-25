package com.google.android.apps.gsa.search.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.search.core.ab */
/* compiled from: PG */
final class C84394ab extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ String f229655a = "com.google.android.gms";

    /* renamed from: b */
    final /* synthetic */ String f229656b = "com.android.vending";

    /* renamed from: c */
    final /* synthetic */ C84413ad f229657c;

    public C84394ab(C84413ad adVar) {
        this.f229657c = adVar;
    }

    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            String encodedSchemeSpecificPart = data.getEncodedSchemeSpecificPart();
            if (this.f229655a.equals(encodedSchemeSpecificPart) || this.f229656b.equals(encodedSchemeSpecificPart)) {
                C58976aa aaVar = C58975e.f156826a;
                this.f229657c.mo77969f();
            }
        }
    }
}
