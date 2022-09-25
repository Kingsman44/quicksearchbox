package com.google.android.libraries.onegoogle.accountmenu.internal;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.internal.bo */
/* compiled from: PG */
final class C30744bo implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f82978a;

    /* renamed from: b */
    final /* synthetic */ C30746bq f82979b;

    public C30744bo(C30746bq bqVar, View view) {
        this.f82979b = bqVar;
        this.f82978a = view;
    }

    public final void onGlobalLayout() {
        this.f82979b.mo36449k(this.f82978a);
        this.f82978a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
