package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;

/* renamed from: com.google.android.material.progressindicator.af */
/* compiled from: PG */
public final class C44842af extends C44849g {

    /* renamed from: g */
    public final int f116992g;

    /* renamed from: h */
    public final int f116993h;

    /* renamed from: i */
    boolean f116994i;

    public C44842af(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.linearProgressIndicatorStyle, 2132151771);
        boolean z = false;
        TypedArray a = C44733be.m79295a(context, attributeSet, C44843ag.f116997c, R.attr.linearProgressIndicatorStyle, 2132151771, new int[0]);
        this.f116992g = a.getInt(0, 1);
        int i = a.getInt(1, 0);
        this.f116993h = i;
        a.recycle();
        mo48266a();
        this.f116994i = i == 1 ? true : z;
    }

    /* renamed from: a */
    public final void mo48266a() {
        if (this.f116992g != 0) {
            return;
        }
        if (this.f117016b > 0) {
            throw new IllegalArgumentException("Rounded corners are not supported in contiguous indeterminate animation.");
        } else if (this.f117017c.length < 3) {
            throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
        }
    }
}
