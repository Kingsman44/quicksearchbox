package com.google.android.libraries.gsa.p1859d.p1860a;

import android.widget.RemoteViews;

/* renamed from: com.google.android.libraries.gsa.d.a.p */
/* compiled from: PG */
public final /* synthetic */ class C22745p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C22747r f62585a;

    public /* synthetic */ C22745p(C22747r rVar) {
        this.f62585a = rVar;
    }

    public final void run() {
        C22747r rVar = this.f62585a;
        rVar.updateAppWidget(new RemoteViews(rVar.f62592a.getPackageName(), 0));
    }
}
