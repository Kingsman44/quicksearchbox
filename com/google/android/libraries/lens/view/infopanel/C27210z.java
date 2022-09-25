package com.google.android.libraries.lens.view.infopanel;

import android.view.ViewTreeObserver;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;

/* renamed from: com.google.android.libraries.lens.view.infopanel.z */
/* compiled from: PG */
final class C27210z implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ LensResultPanelBottomsheetBehavior f74407a;

    /* renamed from: b */
    final /* synthetic */ InfoPanelView f74408b;

    /* renamed from: c */
    final /* synthetic */ int f74409c;

    public C27210z(InfoPanelView infoPanelView, LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior, int i) {
        this.f74408b = infoPanelView;
        this.f74407a = lensResultPanelBottomsheetBehavior;
        this.f74409c = i;
    }

    public final void onGlobalLayout() {
        int i = InfoPanelView.f73487q;
        this.f74408b.f73489c.f73587b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        InfoPanelView infoPanelView = this.f74408b;
        if (infoPanelView.f73490d) {
            infoPanelView.mo32376u(this.f74407a, this.f74409c);
        }
        InfoPanelView infoPanelView2 = this.f74408b;
        if (infoPanelView2.f73501o) {
            infoPanelView2.mo32363m();
            this.f74408b.f73501o = false;
        }
    }
}
