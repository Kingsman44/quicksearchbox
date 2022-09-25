package com.google.android.libraries.lens.view.infopanel.bottomsheet;

import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bottomsheet.b */
/* compiled from: PG */
final class C27055b implements Runnable {

    /* renamed from: a */
    final /* synthetic */ View f73772a;

    /* renamed from: b */
    final /* synthetic */ int f73773b;

    /* renamed from: c */
    final /* synthetic */ LensResultPanelBottomsheetBehavior f73774c;

    public C27055b(LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior, View view, int i) {
        this.f73774c = lensResultPanelBottomsheetBehavior;
        this.f73772a = view;
        this.f73773b = i;
    }

    public final void run() {
        this.f73774c.mo32496A(this.f73772a, this.f73773b);
        this.f73774c.f73756n = null;
    }
}
