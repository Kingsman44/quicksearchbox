package com.google.android.libraries.mdi.download.workmanager.workers;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.mdi.download.workmanager.workers.a */
/* compiled from: PG */
public final /* synthetic */ class C29684a implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ PeriodicWorker f80389a;

    /* renamed from: b */
    public final /* synthetic */ String f80390b;

    public /* synthetic */ C29684a(PeriodicWorker periodicWorker, String str) {
        this.f80389a = periodicWorker;
        this.f80390b = str;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        PeriodicWorker periodicWorker = this.f80389a;
        return periodicWorker.f80387a.mo34719h(this.f80390b);
    }
}
