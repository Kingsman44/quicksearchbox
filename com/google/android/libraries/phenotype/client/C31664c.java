package com.google.android.libraries.phenotype.client;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.libraries.phenotype.client.c */
/* compiled from: PG */
final class C31664c extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C31665d f85169a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31664c(C31665d dVar) {
        super((Handler) null);
        this.f85169a = dVar;
    }

    public final void onChange(boolean z) {
        C31665d dVar = this.f85169a;
        synchronized (dVar.f85175e) {
            dVar.f85176f = null;
            dVar.f85174d.run();
        }
        synchronized (dVar) {
            for (C31666e a : dVar.f85177g) {
                a.mo37312a();
            }
        }
    }
}
