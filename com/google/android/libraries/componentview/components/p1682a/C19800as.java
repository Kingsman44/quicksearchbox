package com.google.android.libraries.componentview.components.p1682a;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: com.google.android.libraries.componentview.components.a.as */
/* compiled from: PG */
final class C19800as implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ View f55327a;

    /* renamed from: b */
    final /* synthetic */ C19801at f55328b;

    public C19800as(C19801at atVar, View view) {
        this.f55328b = atVar;
        this.f55327a = view;
    }

    public final void onGlobalLayout() {
        this.f55328b.f55329a = this.f55327a.getHeight();
        this.f55327a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f55327a.setVisibility(8);
    }
}
