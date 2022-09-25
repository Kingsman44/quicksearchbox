package com.google.android.setupdesign.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupdesign.C45318g;

/* compiled from: PG */
public class FillContentLayout extends FrameLayout {

    /* renamed from: a */
    private int f118407a;

    /* renamed from: b */
    private int f118408b;

    public FillContentLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m80782a(int i, int i2, int i3) {
        int max = Math.max(0, i - i2);
        if (i3 >= 0) {
            return View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        }
        if (i3 == -1) {
            return View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        if (i3 == -2) {
            return View.MeasureSpec.makeMeasureSpec(max, LinearLayoutManager.INVALID_OFFSET);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2));
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            childAt.measure(m80782a(Math.min(this.f118407a, measuredWidth), getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.width), m80782a(Math.min(this.f118408b, measuredHeight), getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height));
        }
    }

    public FillContentLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.sudFillContentLayoutStyle);
    }

    public FillContentLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C45318g.f118387f, i, 0);
            this.f118408b = obtainStyledAttributes.getDimensionPixelSize(1, -1);
            this.f118407a = obtainStyledAttributes.getDimensionPixelSize(0, -1);
            obtainStyledAttributes.recycle();
        }
    }
}
