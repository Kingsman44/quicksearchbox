package com.google.android.apps.gsa.staticplugins.nowcards.p8123ui;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.ui.k */
/* compiled from: PG */
final class C105074k implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C105075l f292808a;

    public C105074k(C105075l lVar) {
        this.f292808a = lVar;
    }

    public final void run() {
        this.f292808a.f292809a.setVisibility(8);
        View view = this.f292808a.f292812d;
        if (view != null) {
            view.sendAccessibilityEvent(8);
        }
    }
}
