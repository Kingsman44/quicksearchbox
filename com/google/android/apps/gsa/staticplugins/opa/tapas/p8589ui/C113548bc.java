package com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113374do;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.ui.bc */
/* compiled from: PG */
final class C113548bc implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ TapasOverlayFrameLayout f314352a;

    /* renamed from: b */
    final /* synthetic */ View f314353b;

    /* renamed from: c */
    final /* synthetic */ View f314354c;

    /* renamed from: d */
    final /* synthetic */ C113374do f314355d;

    /* renamed from: e */
    final /* synthetic */ C113558bm f314356e;

    public C113548bc(C113558bm bmVar, TapasOverlayFrameLayout tapasOverlayFrameLayout, View view, View view2, C113374do doVar) {
        this.f314356e = bmVar;
        this.f314352a = tapasOverlayFrameLayout;
        this.f314353b = view;
        this.f314354c = view2;
        this.f314355d = doVar;
    }

    public final void onGlobalLayout() {
        this.f314352a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f314356e.mo100278C(this.f314353b, this.f314354c, this.f314355d);
    }
}
