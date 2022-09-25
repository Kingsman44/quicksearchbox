package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.navigation.C44819f;

/* renamed from: com.google.android.material.navigationrail.a */
/* compiled from: PG */
final class C44832a extends C44819f {
    public C44832a(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo47499b() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final int mo47500c() {
        return R.layout.mtrl_navigation_rail_item;
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i2) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i2)));
        }
    }
}
