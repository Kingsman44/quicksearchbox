package com.google.android.libraries.lens.view.infopanel.bottomsheet;

import android.view.View;
import androidx.core.p098j.C2043bi;
import androidx.customview.p103b.C2150h;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bottomsheet.g */
/* compiled from: PG */
final class C27060g implements Runnable {

    /* renamed from: a */
    int f73776a;

    /* renamed from: b */
    boolean f73777b;

    /* renamed from: c */
    final /* synthetic */ LensResultPanelBottomsheetBehavior f73778c;

    /* renamed from: d */
    private final View f73779d;

    public C27060g(LensResultPanelBottomsheetBehavior lensResultPanelBottomsheetBehavior, View view, int i) {
        this.f73778c = lensResultPanelBottomsheetBehavior;
        this.f73779d = view;
        this.f73776a = i;
    }

    public final void run() {
        if (!C2043bi.m5569aw(this.f73779d)) {
            C58974d dVar = LensResultPanelBottomsheetBehavior.f73737a;
            return;
        }
        C2150h hVar = this.f73778c.f73754l;
        if (hVar == null || !hVar.mo5415l()) {
            this.f73778c.mo32504z(this.f73776a);
        } else {
            C2043bi.m5520N(this.f73779d, this);
        }
        this.f73777b = false;
    }
}
