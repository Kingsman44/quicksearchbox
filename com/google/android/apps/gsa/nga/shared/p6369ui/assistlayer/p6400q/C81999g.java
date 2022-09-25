package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6400q;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.q.g */
/* compiled from: PG */
final class C81999g implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ View f224165a;

    /* renamed from: b */
    final /* synthetic */ C82003k f224166b;

    public C81999g(C82003k kVar, View view) {
        this.f224166b = kVar;
        this.f224165a = view;
    }

    public final boolean onPreDraw() {
        this.f224165a.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f224166b.f224170d.mo75443f();
        this.f224166b.mo75446c();
        return true;
    }
}
