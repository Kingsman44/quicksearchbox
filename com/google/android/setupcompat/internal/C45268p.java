package com.google.android.setupcompat.internal;

import android.view.ViewTreeObserver;

/* renamed from: com.google.android.setupcompat.internal.p */
/* compiled from: PG */
final class C45268p implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ TemplateLayout f118247a;

    public C45268p(TemplateLayout templateLayout) {
        this.f118247a = templateLayout;
    }

    public final boolean onPreDraw() {
        this.f118247a.getViewTreeObserver().removeOnPreDrawListener(this.f118247a.f118199d);
        TemplateLayout templateLayout = this.f118247a;
        templateLayout.setXFraction(templateLayout.f118198c);
        return true;
    }
}
