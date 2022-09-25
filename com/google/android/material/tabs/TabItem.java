package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0735ip;
import android.util.AttributeSet;
import android.view.View;

/* compiled from: PG */
public class TabItem extends View {

    /* renamed from: a */
    public final CharSequence f117162a;

    /* renamed from: b */
    public final Drawable f117163b;

    /* renamed from: c */
    public final int f117164c;

    public TabItem(Context context) {
        this(context, (AttributeSet) null);
    }

    public TabItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0735ip e = C0735ip.m2472e(context, attributeSet, C44900c.f117209a);
        this.f117162a = e.f2596b.getText(2);
        this.f117163b = e.mo3246b(0);
        this.f117164c = e.f2596b.getResourceId(1, 0);
        e.f2596b.recycle();
    }
}
