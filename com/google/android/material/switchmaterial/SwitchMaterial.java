package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.support.p033v7.widget.SwitchCompat;
import android.util.AttributeSet;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.internal.C44733be;
import com.google.android.material.internal.C44741bm;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3508e.C44654a;
import com.google.android.material.theme.p3518a.C44965a;

/* compiled from: PG */
public class SwitchMaterial extends SwitchCompat {

    /* renamed from: i */
    private static final int[][] f117156i = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j */
    private final C44654a f117157j;

    /* renamed from: k */
    private ColorStateList f117158k;

    /* renamed from: l */
    private ColorStateList f117159l;

    /* renamed from: m */
    private boolean f117160m;

    public SwitchMaterial(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f117160m && this.f1898a == null) {
            if (this.f117158k == null) {
                int b = C44535e.m78719b(this, R.attr.colorSurface);
                int b2 = C44535e.m78719b(this, R.attr.colorControlActivated);
                float dimension = getResources().getDimension(R.dimen.mtrl_switch_thumb_elevation);
                if (this.f117157j.f116337a) {
                    dimension += C44741bm.m79309b(this);
                }
                int b3 = this.f117157j.mo47887b(b, dimension);
                int[][] iArr = f117156i;
                int length = iArr.length;
                this.f117158k = new ColorStateList(iArr, new int[]{C44535e.m78721d(b, b2, 1.0f), b3, C44535e.m78721d(b, b2, 0.38f), b3});
            }
            mo2366h(this.f117158k);
        }
        if (this.f117160m && this.f1901d == null) {
            if (this.f117159l == null) {
                int[][] iArr2 = f117156i;
                int length2 = iArr2.length;
                int b4 = C44535e.m78719b(this, R.attr.colorSurface);
                int b5 = C44535e.m78719b(this, R.attr.colorControlActivated);
                int b6 = C44535e.m78719b(this, R.attr.colorOnSurface);
                this.f117159l = new ColorStateList(iArr2, new int[]{C44535e.m78721d(b4, b5, 0.54f), C44535e.m78721d(b4, b6, 0.32f), C44535e.m78721d(b4, b5, 0.12f), C44535e.m78721d(b4, b6, 0.12f)});
            }
            mo2367i(this.f117159l);
        }
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.switchStyle);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet, int i) {
        super(C44965a.m79936a(context, attributeSet, i, 2132151766), attributeSet, i);
        Context context2 = getContext();
        this.f117157j = new C44654a(context2);
        TypedArray a = C44733be.m79295a(context2, attributeSet, C44897a.f117161a, i, 2132151766, new int[0]);
        this.f117160m = a.getBoolean(0, false);
        a.recycle();
    }
}
