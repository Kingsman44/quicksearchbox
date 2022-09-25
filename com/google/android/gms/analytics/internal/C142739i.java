package com.google.android.gms.analytics.internal;

import java.lang.Thread;

/* renamed from: com.google.android.gms.analytics.internal.i */
/* compiled from: PG */
final class C142739i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    final /* synthetic */ C142740j f387332a;

    public C142739i(C142740j jVar) {
        this.f387332a = jVar;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        C142722as asVar = this.f387332a.f387337e;
        if (asVar != null) {
            asVar.mo117536i(6, "Job execution failed", th, (Object) null, (Object) null);
        }
    }
}
