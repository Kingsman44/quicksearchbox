package com.google.android.apps.gsa.nowoverlayservice;

import android.widget.ViewSwitcher;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.k */
/* compiled from: PG */
public final /* synthetic */ class C83538k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewSwitcher f227764a;

    public /* synthetic */ C83538k(ViewSwitcher viewSwitcher) {
        this.f227764a = viewSwitcher;
    }

    public final void run() {
        this.f227764a.post(new C83536i(this.f227764a));
    }
}
