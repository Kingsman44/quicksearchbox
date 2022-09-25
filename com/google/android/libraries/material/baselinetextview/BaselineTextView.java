package com.google.android.libraries.material.baselinetextview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
public class BaselineTextView extends TextView {
    public BaselineTextView(Context context) {
        super(context);
    }

    public BaselineTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public BaselineTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, C28507a.f77357a, 0, 0);
        boolean z2 = true;
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        obtainStyledAttributes.recycle();
        int fontMetricsInt = getPaint().getFontMetricsInt((Paint.FontMetricsInt) null);
        if (dimensionPixelSize3 >= 0 && dimensionPixelSize3 != fontMetricsInt) {
            setLineSpacing((float) (dimensionPixelSize3 - fontMetricsInt), 1.0f);
        }
        int i2 = getPaint().getFontMetricsInt().top;
        int i3 = getPaint().getFontMetricsInt().bottom;
        if (!getIncludeFontPadding()) {
            i2 = getPaint().getFontMetricsInt().ascent;
            i3 = getPaint().getFontMetricsInt().descent;
        }
        float f = getContext().getResources().getDisplayMetrics().density / getContext().getResources().getDisplayMetrics().scaledDensity;
        if (f != 1.0f) {
            i2 = Math.round(((float) i2) * f);
            i3 = Math.round(((float) i3) * f);
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        if (dimensionPixelSize > Math.abs(i2)) {
            paddingTop = dimensionPixelSize - (-i2);
            z = true;
        }
        if (dimensionPixelSize2 > Math.abs(i3)) {
            paddingBottom = dimensionPixelSize2 - i3;
        } else {
            z2 = z;
        }
        if (z2) {
            setPadding(getPaddingLeft(), paddingTop, getPaddingRight(), paddingBottom);
        }
    }
}
