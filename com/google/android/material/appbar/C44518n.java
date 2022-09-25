package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;

/* renamed from: com.google.android.material.appbar.n */
/* compiled from: PG */
public final class C44518n extends LinearLayout.LayoutParams {

    /* renamed from: a */
    public int f115750a = 1;

    /* renamed from: b */
    public C44516l f115751b;

    /* renamed from: c */
    Interpolator f115752c;

    public C44518n() {
        super(-1, -2);
    }

    public C44518n(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C44517m mVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C44528x.f115773b);
        this.f115750a = obtainStyledAttributes.getInt(1, 0);
        if (obtainStyledAttributes.getInt(0, 0) != 1) {
            mVar = null;
        } else {
            mVar = new C44517m();
        }
        this.f115751b = mVar;
        if (obtainStyledAttributes.hasValue(2)) {
            this.f115752c = AnimationUtils.loadInterpolator(context, obtainStyledAttributes.getResourceId(2, 0));
        }
        obtainStyledAttributes.recycle();
    }

    public C44518n(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C44518n(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public C44518n(LinearLayout.LayoutParams layoutParams) {
        super(layoutParams);
    }
}
