package com.google.android.apps.gsa.shared.util;

import android.view.View;

/* renamed from: com.google.android.apps.gsa.shared.util.a */
/* compiled from: PG */
public final /* synthetic */ class C90715a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ View f253769a;

    public /* synthetic */ C90715a(View view) {
        this.f253769a = view;
    }

    public final void run() {
        this.f253769a.sendAccessibilityEvent(8);
    }
}
