package com.google.android.apps.gsa.nowoverlayservice;

import android.widget.ViewSwitcher;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.m */
/* compiled from: PG */
public final /* synthetic */ class C83540m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewSwitcher f227766a;

    public /* synthetic */ C83540m(ViewSwitcher viewSwitcher) {
        this.f227766a = viewSwitcher;
    }

    public final void run() {
        this.f227766a.showNext();
    }
}
