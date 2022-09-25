package com.google.android.apps.search.podcasts.widgets.valueselector;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.search.podcasts.widgets.valueselector.a */
/* compiled from: PG */
final class C141283a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C141288f f383581a;

    /* renamed from: b */
    final /* synthetic */ HorizontalValueSelector f383582b;

    public C141283a(HorizontalValueSelector horizontalValueSelector, C141288f fVar) {
        this.f383582b = horizontalValueSelector;
        this.f383581a = fVar;
    }

    public final void onGlobalLayout() {
        this.f383582b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        HorizontalValueSelector horizontalValueSelector = this.f383582b;
        horizontalValueSelector.f383573a.scrollToPositionWithOffset(horizontalValueSelector.f383574b.indexOf(this.f383581a) + 1, this.f383582b.f383576d);
    }
}
