package com.google.android.libraries.onegoogle.popovercontainer;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.h */
/* compiled from: PG */
final class C31046h extends ViewOutlineProvider {

    /* renamed from: a */
    final /* synthetic */ ExpandableDialogView f83633a;

    public C31046h(ExpandableDialogView expandableDialogView) {
        this.f83633a = expandableDialogView;
    }

    public final void getOutline(View view, Outline outline) {
        ExpandableDialogView expandableDialogView = this.f83633a;
        Outline outline2 = outline;
        outline2.setRoundRect(Math.round(expandableDialogView.f83575c.left), Math.round(this.f83633a.f83575c.top), Math.round(this.f83633a.f83575c.right), Math.round(this.f83633a.f83575c.bottom), expandableDialogView.f83574b * (1.0f - expandableDialogView.mo36692a()));
    }
}
