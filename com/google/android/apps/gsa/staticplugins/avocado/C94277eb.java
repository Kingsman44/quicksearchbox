package com.google.android.apps.gsa.staticplugins.avocado;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.eb */
/* compiled from: PG */
final class C94277eb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ CircleView f263465a;

    public C94277eb(CircleView circleView) {
        this.f263465a = circleView;
    }

    public final void onGlobalLayout() {
        this.f263465a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        CircleView circleView = this.f263465a;
        circleView.f263025a = (float) (circleView.getMeasuredWidth() / 2);
        CircleView circleView2 = this.f263465a;
        circleView2.f263026b = (float) (circleView2.getMeasuredHeight() / 2);
    }
}
