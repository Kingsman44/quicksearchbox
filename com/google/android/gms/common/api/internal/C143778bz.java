package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.bz */
/* compiled from: PG */
final class C143778bz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f389793a;

    /* renamed from: b */
    final /* synthetic */ String f389794b = "ConnectionlessLifecycleHelper";

    /* renamed from: c */
    final /* synthetic */ C143780ca f389795c;

    public C143778bz(C143780ca caVar, LifecycleCallback lifecycleCallback) {
        this.f389795c = caVar;
        this.f389793a = lifecycleCallback;
    }

    public final void run() {
        C143780ca caVar = this.f389795c;
        if (caVar.f389798b > 0) {
            LifecycleCallback lifecycleCallback = this.f389793a;
            Bundle bundle = caVar.f389799c;
            lifecycleCallback.mo119116d(bundle != null ? bundle.getBundle(this.f389794b) : null);
        }
        if (this.f389795c.f389798b >= 2) {
            this.f389793a.mo119119i();
        }
        if (this.f389795c.f389798b >= 3) {
            ((C143730ae) this.f389793a).mo119128k();
        }
        if (this.f389795c.f389798b >= 4) {
            this.f389793a.mo119120j();
        }
    }
}
