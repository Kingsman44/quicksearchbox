package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3512i.C44694d;

/* renamed from: com.google.android.material.progressindicator.n */
/* compiled from: PG */
public final class C44856n extends C44849g {

    /* renamed from: g */
    public int f117040g;

    /* renamed from: h */
    public int f117041h;

    /* renamed from: i */
    public int f117042i;

    public C44856n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle, 2132151759);
    }

    /* renamed from: a */
    public final void mo48266a() {
    }

    public C44856n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        TypedArray a = C44733be.m79295a(context, attributeSet, C44843ag.f116996b, i, i2, new int[0]);
        int a2 = C44694d.m79229a(context, a, 2, dimensionPixelSize);
        int i3 = this.f117015a;
        this.f117040g = Math.max(a2, i3 + i3);
        this.f117041h = C44694d.m79229a(context, a, 1, dimensionPixelSize2);
        this.f117042i = a.getInt(0, 0);
        a.recycle();
    }
}
