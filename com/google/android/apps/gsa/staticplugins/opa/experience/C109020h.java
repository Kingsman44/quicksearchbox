package com.google.android.apps.gsa.staticplugins.opa.experience;

import android.app.KeyguardManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.experience.h */
/* compiled from: PG */
final class C109020h extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ OpaBActivity f303162a;

    public C109020h(OpaBActivity opaBActivity) {
        this.f303162a = opaBActivity;
    }

    /* renamed from: a */
    private final void m181346a() {
        this.f303162a.f303130E.setVisibility(0);
        this.f303162a.f303130E.mo84857a();
    }

    public final void onDismissCancelled() {
        super.onDismissCancelled();
        m181346a();
    }

    public final void onDismissError() {
        super.onDismissError();
        m181346a();
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        this.f303162a.mo97374x(5);
    }
}
