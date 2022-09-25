package com.google.android.libraries.p2460r.p2469c.p2471b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.r.c.b.a */
/* compiled from: PG */
public final class C32097a extends ImageView {

    /* renamed from: a */
    public float f86179a = 0.0f;

    public C32097a(Context context) {
        super(context);
    }

    /* renamed from: a */
    private final int m59798a(int i, float f) {
        return ((int) (((float) ((i - getPaddingRight()) - getPaddingLeft())) * f)) + getPaddingTop() + getPaddingBottom();
    }

    /* renamed from: b */
    private final int m59799b(int i, float f) {
        return ((int) (((float) ((i - getPaddingTop()) - getPaddingBottom())) * f)) + getPaddingRight() + getPaddingLeft();
    }

    public final void onMeasure(int i, int i2) {
        float f;
        Drawable drawable = getDrawable();
        if (drawable == null || drawable.getIntrinsicHeight() <= 0 || drawable.getIntrinsicWidth() <= 0) {
            f = this.f86179a;
            if (f <= 0.0f) {
                super.onMeasure(i, i2);
                return;
            }
        } else {
            f = ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight());
        }
        float f2 = 1.0f / f;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            if (mode2 != 0) {
                size = m59799b(size2, f);
                setMeasuredDimension(size, size2);
            }
            mode = 0;
        }
        if (mode2 == 0 && mode != 0) {
            size2 = m59798a(size, f2);
            setMeasuredDimension(size, size2);
        } else if (mode2 == 0 && mode == 0) {
            size = Integer.MAX_VALUE;
            size2 = Integer.MAX_VALUE;
            setMeasuredDimension(size, size2);
        } else if (mode == Integer.MIN_VALUE && mode2 == 1073741824) {
            size = Math.min(m59799b(size2, f), size);
            setMeasuredDimension(size, size2);
        } else if (mode2 == Integer.MIN_VALUE && mode == 1073741824) {
            size2 = Math.min(m59798a(size, f2), size2);
            setMeasuredDimension(size, size2);
        } else {
            if (mode == Integer.MIN_VALUE && mode2 == Integer.MIN_VALUE) {
                int b = m59799b(size2, f);
                int a = m59798a(size, f2);
                if (b < size) {
                    size = b;
                } else if (a < size2) {
                    size2 = a;
                }
            }
            setMeasuredDimension(size, size2);
        }
    }
}
