package com.google.android.apps.gsa.shared.p7148ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* renamed from: com.google.android.apps.gsa.shared.ui.FadingScrollView */
/* compiled from: PG */
public class FadingScrollView extends ScrollView {

    /* renamed from: a */
    private final int f253357a;

    public FadingScrollView(Context context) {
        this(context, (AttributeSet) null, 0, 0);
    }

    public final int getSolidColor() {
        return this.f253357a;
    }

    public FadingScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public FadingScrollView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public FadingScrollView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C90629ae.f253427e, i, i2);
        this.f253357a = obtainStyledAttributes.getColor(0, 0);
        obtainStyledAttributes.recycle();
    }
}
