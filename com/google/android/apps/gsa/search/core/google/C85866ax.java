package com.google.android.apps.gsa.search.core.google;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.google.android.apps.gsa.search.core.google.ax */
/* compiled from: PG */
final class C85866ax extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C85878ba f232170a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C85866ax(C85878ba baVar, Handler handler) {
        super(handler);
        this.f232170a = baVar;
    }

    public final void onChange(boolean z) {
        this.f232170a.mo79512c();
    }
}
