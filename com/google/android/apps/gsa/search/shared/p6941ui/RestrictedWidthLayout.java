package com.google.android.apps.gsa.search.shared.p6941ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.search.shared.ui.RestrictedWidthLayout */
/* compiled from: PG */
public class RestrictedWidthLayout extends LinearLayout {
    public RestrictedWidthLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(RestrictedWidthLayout.class.getCanonicalName());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C58838bb.m90883r(View.MeasureSpec.getMode(i) == 1073741824);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int size = (View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin;
        int c = C90686c.m148057c(getContext(), size, true, 1);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size - (c + c), 1073741824), i2);
    }

    public RestrictedWidthLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RestrictedWidthLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setOrientation(1);
    }
}
