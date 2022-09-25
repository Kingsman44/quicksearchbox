package com.google.android.libraries.lens.view.infopanel;

import android.view.ViewTreeObserver;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.lens.view.infopanel.aa */
/* compiled from: PG */
final class C26983aa implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ LensResultPanelBottomsheetBehavior f73578a;

    /* renamed from: b */
    final /* synthetic */ InfoPanelView f73579b;

    public C26983aa(InfoPanelView infoPanelView, LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior) {
        this.f73579b = infoPanelView;
        this.f73578a = lensResultPanelBottomsheetBehavior;
    }

    public final void onGlobalLayout() {
        if (this.f73579b.getParent() == null) {
            this.f73579b.f73489c.f73587b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        }
        if (this.f73579b.mo32352a(this.f73579b.mo32353b()) > this.f73579b.mo32354d()) {
            this.f73578a.f73750h = true;
            this.f73579b.mo32371p();
            InfoPanelView infoPanelView = this.f73579b;
            infoPanelView.f73499m = C58836b.f156633a;
            infoPanelView.f73489c.f73587b.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
