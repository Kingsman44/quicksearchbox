package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.be */
/* compiled from: PG */
public final class C114127be extends ViewGroup.LayoutParams {

    /* renamed from: a */
    public boolean f316329a;

    /* renamed from: b */
    public int f316330b;

    /* renamed from: c */
    float f316331c = 0.0f;

    /* renamed from: d */
    boolean f316332d;

    /* renamed from: e */
    int f316333e;

    /* renamed from: f */
    int f316334f;

    public C114127be() {
        super(-1, -1);
    }

    public C114127be(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ValyrianViewPager.f316121a);
        this.f316330b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
    }
}
