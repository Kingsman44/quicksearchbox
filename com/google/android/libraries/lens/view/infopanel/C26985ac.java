package com.google.android.libraries.lens.view.infopanel;

import com.google.android.libraries.lens.view.infopanel.bottomsheet.C27058e;
import com.google.android.libraries.lens.view.infopanel.bottomsheet.LensResultPanelBottomsheetBehavior;

/* renamed from: com.google.android.libraries.lens.view.infopanel.ac */
/* compiled from: PG */
public final class C26985ac extends C27058e {

    /* renamed from: a */
    public final LensResultPanelBottomsheetBehavior f73582a;

    /* renamed from: b */
    public final InfoPanelView f73583b;

    /* renamed from: c */
    public boolean f73584c;

    /* renamed from: d */
    public int f73585d = 5;

    public C26985ac(InfoPanelView infoPanelView, LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior) {
        this.f73583b = infoPanelView;
        this.f73582a = lensResultPanelBottomsheetBehavior;
    }

    /* renamed from: b */
    public static boolean m50077b(int i) {
        return i == 4 || i == 6;
    }

    /* renamed from: c */
    public static boolean m50078c(int i) {
        return i == 3;
    }

    /* renamed from: a */
    public final void mo32449a(float f) {
        this.f73583b.f73489c.f73586a.mo17754z().mo32646a(f);
        InfoPanelHeader infoPanelHeader = this.f73583b.f73489c.f73586a;
        if (f == 1.0f) {
            infoPanelHeader.f73787b = 0;
            infoPanelHeader.invalidate();
        } else if (infoPanelHeader.f73787b == 0) {
            infoPanelHeader.f73787b = infoPanelHeader.f73786a;
            infoPanelHeader.invalidate();
        }
    }
}
