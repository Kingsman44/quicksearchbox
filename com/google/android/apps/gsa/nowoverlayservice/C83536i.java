package com.google.android.apps.gsa.nowoverlayservice;

import android.widget.ViewSwitcher;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.nowoverlayservice.i */
/* compiled from: PG */
public final /* synthetic */ class C83536i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ViewSwitcher f227762a;

    public /* synthetic */ C83536i(ViewSwitcher viewSwitcher) {
        this.f227762a = viewSwitcher;
    }

    public final void run() {
        ViewSwitcher viewSwitcher = this.f227762a;
        C59071e eVar = C83553y.f227783a;
        viewSwitcher.setDisplayedChild(0);
    }
}
