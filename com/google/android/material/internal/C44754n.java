package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2104s;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.material.internal.n */
/* compiled from: PG */
public class C44754n extends ViewGroup {

    /* renamed from: d */
    public int f116685d;

    /* renamed from: e */
    public int f116686e;

    /* renamed from: f */
    public boolean f116687f;

    /* renamed from: g */
    public int f116688g;

    public C44754n(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private static int m79359a(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    /* renamed from: b */
    private final void m79360b(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C44717ap.f116567a, 0, 0);
        this.f116685d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.f116686e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (getChildCount() == 0) {
            this.f116688g = 0;
            return;
        }
        this.f116688g = 1;
        boolean z2 = C2043bi.m5577f(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i7 = (i3 - i) - paddingLeft;
        int i8 = paddingRight;
        int i9 = paddingTop;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(R.id.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = C2104s.m5790c(marginLayoutParams);
                    i6 = C2104s.m5789b(marginLayoutParams);
                } else {
                    i6 = 0;
                    i5 = 0;
                }
                int measuredWidth = i8 + i5 + childAt.getMeasuredWidth();
                if (!this.f116687f && measuredWidth > i7) {
                    paddingTop = i9 + this.f116685d;
                    this.f116688g++;
                    i8 = paddingRight;
                }
                childAt.setTag(R.id.row_index_key, Integer.valueOf(this.f116688g - 1));
                int i11 = i8 + i5;
                int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i7 - measuredWidth2, paddingTop, (i7 - i8) - i5, measuredHeight);
                } else {
                    childAt.layout(i11, paddingTop, measuredWidth2, measuredHeight);
                }
                i8 += i5 + i6 + childAt.getMeasuredWidth() + this.f116686e;
                i9 = measuredHeight;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE) {
            i3 = size;
        } else if (mode == 1073741824) {
            i3 = size;
            mode = 1073741824;
        } else {
            i3 = Integer.MAX_VALUE;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i3 - getPaddingRight();
        int i7 = paddingTop;
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 8) {
                int i10 = i;
                int i11 = i2;
            } else {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i5 = marginLayoutParams.leftMargin;
                    i4 = marginLayoutParams.rightMargin;
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                int i12 = paddingLeft;
                if (paddingLeft + i5 + childAt.getMeasuredWidth() <= paddingRight || this.f116687f) {
                    i6 = i12;
                } else {
                    i6 = getPaddingLeft();
                    i7 = this.f116685d + paddingTop;
                }
                int measuredWidth = i6 + i5 + childAt.getMeasuredWidth();
                int measuredHeight = i7 + childAt.getMeasuredHeight();
                if (measuredWidth > i8) {
                    i8 = measuredWidth;
                }
                paddingLeft = i6 + i5 + i4 + childAt.getMeasuredWidth() + this.f116686e;
                if (i9 == getChildCount() - 1) {
                    i8 += i4;
                }
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(m79359a(size, mode, i8 + getPaddingRight()), m79359a(size2, mode2, paddingTop + getPaddingBottom()));
    }

    public C44754n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C44754n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f116687f = false;
        m79360b(context, attributeSet);
    }

    public C44754n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f116687f = false;
        m79360b(context, attributeSet);
    }
}
