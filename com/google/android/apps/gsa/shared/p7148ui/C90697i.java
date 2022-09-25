package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90686c;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58838bb;

/* renamed from: com.google.android.apps.gsa.shared.ui.i */
/* compiled from: PG */
public class C90697i extends FrameLayout {

    /* renamed from: a */
    private int f253702a;

    public C90697i(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    static final void m148088b(View view, int i) {
        if (i != view.getPaddingLeft() || i != view.getPaddingRight()) {
            view.setPadding(i, view.getPaddingTop(), i, view.getPaddingBottom());
        }
    }

    /* renamed from: a */
    public void mo84832a(int i) {
        m148088b(getChildAt(0), i);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(C90697i.class.getCanonicalName());
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        C58838bb.m90883r(View.MeasureSpec.getMode(i) == 1073741824);
        if (getChildCount() > 0) {
            int b = C90686c.m148056b(getContext(), View.MeasureSpec.getSize(i), this.f253702a);
            boolean e = C90686c.m148059e(getContext(), this.f253702a);
            if (this.f253702a == 2) {
                Resources resources = getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.lotic_card_side_margin);
                if (e) {
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.min_content_margin);
                    if (dimensionPixelSize2 > dimensionPixelSize) {
                        b += dimensionPixelSize2 - dimensionPixelSize;
                    }
                } else {
                    b -= dimensionPixelSize;
                }
            }
            mo84832a(b);
        }
        super.onMeasure(i, i2);
    }

    public C90697i(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C90697i(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f253702a = 2;
    }
}
