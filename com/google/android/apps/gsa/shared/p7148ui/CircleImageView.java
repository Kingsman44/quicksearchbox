package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.p098j.C2043bi;

/* renamed from: com.google.android.apps.gsa.shared.ui.CircleImageView */
/* compiled from: PG */
public class CircleImageView extends ImageView {
    public CircleImageView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private final void m147882a(AttributeSet attributeSet, int i, int i2) {
        float f;
        int i3 = -12417548;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C90629ae.f253424b, i, i2);
            try {
                i3 = obtainStyledAttributes.getColor(0, -12417548);
                obtainStyledAttributes.getDimensionPixelSize(1, -1);
                f = obtainStyledAttributes.getDimension(2, -1.0f);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            f = 0.0f;
        }
        float f2 = getContext().getResources().getDisplayMetrics().density;
        if (f < 0.0f) {
            f = 8.0f * f2;
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        C2043bi.m5548ab(this, f);
        shapeDrawable.getPaint().setColor(i3);
        setBackground(shapeDrawable);
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
        }
    }

    public CircleImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m147882a(attributeSet, i, 0);
    }

    public CircleImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m147882a(attributeSet, i, i2);
    }
}
