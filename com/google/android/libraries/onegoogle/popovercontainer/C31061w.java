package com.google.android.libraries.onegoogle.popovercontainer;

import android.view.ViewTreeObserver;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.w */
/* compiled from: PG */
final class C31061w implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    final /* synthetic */ ExpandableDialogView f83655a;

    public C31061w(ExpandableDialogView expandableDialogView) {
        this.f83655a = expandableDialogView;
    }

    public final boolean onPreDraw() {
        int i;
        this.f83655a.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableDialogView expandableDialogView = this.f83655a;
        String str = C31036ak.f83597a;
        if (C2043bi.m5577f(expandableDialogView) == 1) {
            i = expandableDialogView.f83567a.left;
        } else {
            i = expandableDialogView.f83567a.right;
        }
        expandableDialogView.setPivotX((float) i);
        ExpandableDialogView expandableDialogView2 = this.f83655a;
        expandableDialogView2.setPivotY((float) expandableDialogView2.f83567a.top);
        return true;
    }
}
