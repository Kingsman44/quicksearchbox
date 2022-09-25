package com.google.android.apps.gsa.staticplugins.opa.ambient.p8264h.p8273g;

import android.app.KeyguardManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.h.g.j */
/* compiled from: PG */
final class C107070j extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ C107071k f298115a;

    public C107070j(C107071k kVar) {
        this.f298115a = kVar;
    }

    public final void onDismissCancelled() {
        super.onDismissCancelled();
        KeyguardManager.KeyguardDismissCallback keyguardDismissCallback = this.f298115a.f298119c;
        if (keyguardDismissCallback != null) {
            keyguardDismissCallback.onDismissCancelled();
            this.f298115a.f298119c = null;
        }
        this.f298115a.mo95769d();
    }

    public final void onDismissError() {
        super.onDismissError();
        KeyguardManager.KeyguardDismissCallback keyguardDismissCallback = this.f298115a.f298119c;
        if (keyguardDismissCallback != null) {
            keyguardDismissCallback.onDismissError();
            this.f298115a.f298119c = null;
        }
        this.f298115a.mo95769d();
    }

    public final void onDismissSucceeded() {
        super.onDismissSucceeded();
        KeyguardManager.KeyguardDismissCallback keyguardDismissCallback = this.f298115a.f298119c;
        if (keyguardDismissCallback != null) {
            keyguardDismissCallback.onDismissSucceeded();
            this.f298115a.f298119c = null;
        }
        this.f298115a.mo95769d();
    }
}
