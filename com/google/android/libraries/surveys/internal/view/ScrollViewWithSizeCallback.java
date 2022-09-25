package com.google.android.libraries.surveys.internal.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: PG */
public class ScrollViewWithSizeCallback extends ScrollView {

    /* renamed from: a */
    public C43110bl f112645a;

    public ScrollViewWithSizeCallback(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C43110bl blVar = this.f112645a;
        if (blVar != null && i4 != i2 && i2 != 0) {
            blVar.mo46170a(i2);
        }
    }
}
