package com.google.android.libraries.componentview.components.elements.views;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.libraries.componentview.components.elements.views.f */
/* compiled from: PG */
public final class C20465f extends ViewGroup {
    public C20465f(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (getChildCount() != 0 && z) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = ((i3 - i) - paddingLeft) - getPaddingRight();
            int i5 = paddingLeft + paddingRight;
            int paddingTop = getPaddingTop();
            int paddingBottom = (i4 - i2) - getPaddingBottom();
            boolean z2 = C2043bi.m5577f(this) == 1;
            int i6 = paddingRight / 2;
            C20463d[] dVarArr = {new C20464e(paddingRight, z2), new C20462c(new int[]{i6, i6}, z2), new C20462c(new int[]{paddingRight}, z2)};
            for (int i7 = 0; i7 < getChildCount(); i7++) {
                View childAt = getChildAt(i7);
                for (int i8 = 0; i8 < 3; i8++) {
                    dVarArr[i8].mo25407a(childAt);
                }
                childAt.setVisibility(8);
            }
            for (int i9 = 0; i9 < 3; i9++) {
                C20463d dVar = dVarArr[i9];
                if (dVar.mo25409c()) {
                    dVar.mo25408b(paddingLeft, paddingTop, i5, paddingBottom);
                    return;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        if (View.MeasureSpec.getMode(i) != 0) {
            i3 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), LinearLayoutManager.INVALID_OFFSET);
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            measureChildWithMargins(childAt, i3, 0, i2, 0);
            i4 = Math.max(i4, childAt.getMeasuredHeight());
            i5 = combineMeasuredStates(i5, childAt.getMeasuredState());
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), resolveSizeAndState(i4, i2, i5 << 16));
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }
}
