package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p7997f;

import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.f.v */
/* compiled from: PG */
final class C102027v implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ ScrollView f284655a;

    /* renamed from: b */
    final /* synthetic */ C102029x f284656b;

    public C102027v(C102029x xVar, ScrollView scrollView) {
        this.f284656b = xVar;
        this.f284655a = scrollView;
    }

    public final void onGlobalLayout() {
        this.f284655a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f284656b.mo92805a();
    }
}
