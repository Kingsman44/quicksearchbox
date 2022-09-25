package com.google.android.material.p3511h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.p033v7.widget.C0516an;
import android.util.AttributeSet;
import androidx.core.widget.C2117d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3512i.C44694d;
import com.google.android.material.theme.p3518a.C44965a;

/* renamed from: com.google.android.material.h.a */
/* compiled from: PG */
public final class C44689a extends C0516an {

    /* renamed from: a */
    private static final int[][] f116479a = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: b */
    private ColorStateList f116480b;

    /* renamed from: c */
    private boolean f116481c;

    public C44689a(Context context, AttributeSet attributeSet) {
        super(C44965a.m79936a(context, attributeSet, R.attr.radioButtonStyle, 2132151765), attributeSet);
        Context context2 = getContext();
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44690b.f116482a, R.attr.radioButtonStyle, 2132151765, new int[0]);
        if (a.hasValue(0)) {
            C2117d.m5879c(this, C44694d.m79230b(context2, a, 0));
        }
        this.f116481c = a.getBoolean(1, false);
        a.recycle();
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f116481c && C2117d.m5877a(this) == null) {
            this.f116481c = true;
            if (this.f116480b == null) {
                int b = C44535e.m78719b(this, R.attr.colorControlActivated);
                int b2 = C44535e.m78719b(this, R.attr.colorOnSurface);
                int b3 = C44535e.m78719b(this, R.attr.colorSurface);
                int[][] iArr = f116479a;
                int length = iArr.length;
                this.f116480b = new ColorStateList(iArr, new int[]{C44535e.m78721d(b3, b, 1.0f), C44535e.m78721d(b3, b2, 0.54f), C44535e.m78721d(b3, b2, 0.38f), C44535e.m78721d(b3, b2, 0.38f)});
            }
            C2117d.m5879c(this, this.f116480b);
        }
    }
}
