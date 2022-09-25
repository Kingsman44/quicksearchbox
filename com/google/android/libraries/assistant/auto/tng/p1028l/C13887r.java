package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.r */
/* compiled from: PG */
public final /* synthetic */ class C13887r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13889t f42301a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f42302b;

    public /* synthetic */ C13887r(C13889t tVar, C60870cx cxVar) {
        this.f42301a = tVar;
        this.f42302b = cxVar;
    }

    public final void run() {
        C13889t tVar = this.f42301a;
        this.f42302b.cancel(false);
        tVar.mo21339a();
    }
}
