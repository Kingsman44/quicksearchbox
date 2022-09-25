package com.google.android.apps.gsa.staticplugins.recently.entry;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;

/* compiled from: PG */
public class EntryFrameLayout extends FrameLayout {

    /* renamed from: a */
    private final float f321868a = getElevation();

    public EntryFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
        accessibilityNodeInfo.setLongClickable(false);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            int a = C116078b.m192458a(View.MeasureSpec.getSize(i), getResources());
            int mode = View.MeasureSpec.getMode(i2);
            if (mode == Integer.MIN_VALUE) {
                a = Math.min(View.MeasureSpec.getSize(i2), a);
            } else if (mode == 1073741824) {
                a = View.MeasureSpec.getSize(i2);
            }
            i2 = View.MeasureSpec.makeMeasureSpec(a, 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public final void setAlpha(float f) {
        float f2;
        super.setAlpha(f);
        if (f < 0.95f) {
            f2 = 0.0f;
        } else {
            f2 = this.f321868a;
        }
        setElevation(f2);
    }
}
