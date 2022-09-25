package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

/* renamed from: com.google.android.gms.analytics.internal.o */
/* compiled from: PG */
final class C142745o implements Runnable {

    /* renamed from: a */
    final /* synthetic */ ComponentName f387359a;

    /* renamed from: b */
    final /* synthetic */ C142746p f387360b;

    public C142745o(C142746p pVar, ComponentName componentName) {
        this.f387360b = pVar;
        this.f387359a = componentName;
    }

    public final void run() {
        this.f387360b.f387362b.mo117557d(this.f387359a);
    }
}
