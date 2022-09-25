package com.google.android.apps.gsa.staticplugins.opa.samson.p8433h;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.h.w */
/* compiled from: PG */
final class C110159w extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ PendingIntent f306930a;

    public C110159w(PendingIntent pendingIntent) {
        this.f306930a = pendingIntent;
    }

    public final void onDismissCancelled() {
    }

    public final void onDismissError() {
    }

    public final void onDismissSucceeded() {
        C58976aa aaVar = C58975e.f156826a;
        C110161y.m183450g(this.f306930a);
    }
}
