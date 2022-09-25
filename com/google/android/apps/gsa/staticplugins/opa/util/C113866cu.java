package com.google.android.apps.gsa.staticplugins.opa.util;

import android.app.KeyguardManager;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.cu */
/* compiled from: PG */
final class C113866cu extends KeyguardManager.KeyguardDismissCallback {

    /* renamed from: a */
    final /* synthetic */ Runnable f315282a;

    /* renamed from: b */
    final /* synthetic */ C113867cv f315283b;

    public C113866cu(C113867cv cvVar, Runnable runnable) {
        this.f315283b = cvVar;
        this.f315282a = runnable;
    }

    public final void onDismissCancelled() {
        this.f315283b.f315284a.finish();
    }

    public final void onDismissError() {
        this.f315283b.f315284a.finish();
    }

    public final void onDismissSucceeded() {
        this.f315282a.run();
    }
}
