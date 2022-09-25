package com.google.android.libraries.lens.view.p2133i;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.lens.view.i.n */
/* compiled from: PG */
final class C26929n implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f73369a;

    /* renamed from: b */
    final /* synthetic */ C26932q f73370b;

    public C26929n(C26932q qVar, View view) {
        this.f73370b = qVar;
        this.f73369a = view;
    }

    public final void onGlobalLayout() {
        this.f73370b.f73399n.f73373b.setMinimumHeight((int) (((float) this.f73369a.getHeight()) * 0.2f));
        this.f73370b.mo32318c(3);
        this.f73369a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f73370b.f73398m = null;
    }
}
