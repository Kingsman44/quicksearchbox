package com.google.android.gms.common.api.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.common.api.internal.cz */
/* compiled from: PG */
final class C143805cz implements Runnable {

    /* renamed from: a */
    final /* synthetic */ LifecycleCallback f389851a;

    /* renamed from: b */
    final /* synthetic */ String f389852b = "ConnectionlessLifecycleHelper";

    /* renamed from: c */
    final /* synthetic */ C143807da f389853c;

    public C143805cz(C143807da daVar, LifecycleCallback lifecycleCallback) {
        this.f389853c = daVar;
        this.f389851a = lifecycleCallback;
    }

    public final void run() {
        C143807da daVar = this.f389853c;
        if (daVar.f389856b > 0) {
            LifecycleCallback lifecycleCallback = this.f389851a;
            Bundle bundle = daVar.f389857c;
            lifecycleCallback.mo119116d(bundle != null ? bundle.getBundle(this.f389852b) : null);
        }
        if (this.f389853c.f389856b >= 2) {
            this.f389851a.mo119119i();
        }
        if (this.f389853c.f389856b >= 3) {
            ((C143730ae) this.f389851a).mo119128k();
        }
        if (this.f389853c.f389856b >= 4) {
            this.f389851a.mo119120j();
        }
    }
}
