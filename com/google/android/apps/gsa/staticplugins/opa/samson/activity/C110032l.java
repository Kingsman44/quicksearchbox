package com.google.android.apps.gsa.staticplugins.opa.samson.activity;

import android.app.KeyguardManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.activity.l */
/* compiled from: PG */
final class C110032l extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ OpaAmbActivity f306576a;

    public C110032l(OpaAmbActivity opaAmbActivity) {
        this.f306576a = opaAmbActivity;
    }

    /* renamed from: a */
    private final void m183278a() {
        this.f306576a.f306536Q.setVisibility(0);
        this.f306576a.f306536Q.mo84857a();
    }

    public final void onDismissCancelled() {
        super.onDismissCancelled();
        m183278a();
    }

    public final void onDismissError() {
        super.onDismissError();
        m183278a();
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        this.f306576a.finish();
    }
}
