package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.bo */
/* compiled from: PG */
public final /* synthetic */ class C138440bo implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C138445bt f376569a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f376570b;

    public /* synthetic */ C138440bo(C138445bt btVar, C60870cx cxVar) {
        this.f376569a = btVar;
        this.f376570b = cxVar;
    }

    public final void run() {
        C138445bt btVar = this.f376569a;
        C60870cx cxVar = this.f376570b;
        if (cxVar.isDone()) {
            return;
        }
        if (btVar.f376588k) {
            btVar.f376589l.mo114267d();
        } else {
            cxVar.cancel(true);
        }
    }
}
