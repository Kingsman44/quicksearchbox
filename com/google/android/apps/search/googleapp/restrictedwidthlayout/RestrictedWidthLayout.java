package com.google.android.apps.search.googleapp.restrictedwidthlayout;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* compiled from: PG */
public final class RestrictedWidthLayout extends FrameLayout {

    /* renamed from: a */
    public int f373297a;

    public RestrictedWidthLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min((((View.MeasureSpec.getSize(i) - marginLayoutParams.leftMargin) - marginLayoutParams.rightMargin) - getPaddingLeft()) - getPaddingRight(), this.f373297a), 1073741824) + getPaddingLeft() + getPaddingRight(), i2);
    }

    public RestrictedWidthLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RestrictedWidthLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f373297a = (int) (Resources.getSystem().getDisplayMetrics().density * 420.0f);
    }
}
