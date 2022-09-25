package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: com.google.android.material.appbar.s */
/* compiled from: PG */
public final class C44523s extends FrameLayout.LayoutParams {

    /* renamed from: a */
    int f115755a = 0;

    /* renamed from: b */
    float f115756b = 0.5f;

    public C44523s() {
        super(-1, -1);
    }

    public C44523s(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44528x.f115775d);
        this.f115755a = obtainStyledAttributes.getInt(0, 0);
        this.f115756b = obtainStyledAttributes.getFloat(1, 0.5f);
        obtainStyledAttributes.recycle();
    }

    public C44523s(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
