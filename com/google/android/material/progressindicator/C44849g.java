package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44694d;

/* renamed from: com.google.android.material.progressindicator.g */
/* compiled from: PG */
public abstract class C44849g {

    /* renamed from: a */
    public final int f117015a;

    /* renamed from: b */
    public int f117016b;

    /* renamed from: c */
    public int[] f117017c = new int[0];

    /* renamed from: d */
    public int f117018d;

    /* renamed from: e */
    public int f117019e;

    /* renamed from: f */
    public int f117020f;

    protected C44849g(Context context, AttributeSet attributeSet, int i, int i2) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        TypedArray a = C44733be.m79295a(context, attributeSet, C44843ag.f116995a, i, i2, new int[0]);
        int a2 = C44694d.m79229a(context, a, 8, dimensionPixelSize);
        this.f117015a = a2;
        this.f117016b = Math.min(C44694d.m79229a(context, a, 7, 0), a2 / 2);
        this.f117019e = a.getInt(4, 0);
        this.f117020f = a.getInt(1, 0);
        if (!a.hasValue(2)) {
            this.f117017c = new int[]{C44535e.m78720c(context, R.attr.colorPrimary, -1)};
        } else if (a.peekValue(2).type != 1) {
            this.f117017c = new int[]{a.getColor(2, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(a.getResourceId(2, -1));
            this.f117017c = intArray;
            if (intArray.length == 0) {
                throw new IllegalArgumentException("indicatorColors cannot be empty when indicatorColor is not used.");
            }
        }
        if (a.hasValue(6)) {
            this.f117018d = a.getColor(6, -1);
        } else {
            this.f117018d = this.f117017c[0];
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{16842803});
            float f = obtainStyledAttributes.getFloat(0, 0.2f);
            obtainStyledAttributes.recycle();
            this.f117018d = C44535e.m78718a(this.f117018d, (int) (f * 255.0f));
        }
        a.recycle();
    }

    /* renamed from: a */
    public abstract void mo48266a();

    /* renamed from: b */
    public final boolean mo48291b() {
        return this.f117020f != 0;
    }

    /* renamed from: c */
    public final boolean mo48292c() {
        return this.f117019e != 0;
    }
}
