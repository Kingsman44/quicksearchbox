package com.google.android.apps.gsa.staticplugins.opa.smartspace;

import android.app.KeyguardManager;
import android.content.Intent;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.smartspace.af */
/* compiled from: PG */
final class C110515af extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Intent f308123a;

    /* renamed from: b */
    final /* synthetic */ SmartspaceTrampolineActivity f308124b;

    public C110515af(SmartspaceTrampolineActivity smartspaceTrampolineActivity, Intent intent) {
        this.f308124b = smartspaceTrampolineActivity;
        this.f308123a = intent;
    }

    public final void onDismissCancelled() {
        this.f308124b.finish();
    }

    public final void onDismissError() {
        this.f308124b.finish();
    }

    public final void onDismissSucceeded() {
        this.f308124b.mo98743e(this.f308123a);
    }
}
