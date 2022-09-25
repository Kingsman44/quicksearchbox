package com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared;

import android.app.KeyguardManager;
import com.google.android.apps.gsa.staticplugins.opa.p8185ah.C106160a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.d */
/* compiled from: PG */
final class C110118d extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ C106160a f306864a;

    public C110118d(C106160a aVar) {
        this.f306864a = aVar;
    }

    public final void onDismissCancelled() {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onDismissError() {
        C58976aa aaVar = C58975e.f156826a;
    }

    public final void onDismissSucceeded() {
        C58976aa aaVar = C58975e.f156826a;
        this.f306864a.mo95333b(1);
    }
}
