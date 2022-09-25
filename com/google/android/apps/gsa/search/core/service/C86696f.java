package com.google.android.apps.gsa.search.core.service;

import android.os.IBinder;

/* renamed from: com.google.android.apps.gsa.search.core.service.f */
/* compiled from: PG */
final class C86696f implements IBinder.DeathRecipient {

    /* renamed from: a */
    final /* synthetic */ C86775r f234190a;

    public C86696f(C86775r rVar) {
        this.f234190a = rVar;
    }

    public final void binderDied() {
        this.f234190a.mo80389k();
    }
}
