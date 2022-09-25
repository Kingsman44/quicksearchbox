package com.google.android.libraries.lens.view.education;

import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ScrollView;

/* compiled from: PG */
public final class LatexRendererScrollView extends ScrollView {

    /* renamed from: a */
    public int f70036a = 0;

    public LatexRendererScrollView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.f70036a;
        if (i3 <= 0 || size <= i3) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, LinearLayoutManager.INVALID_OFFSET));
        }
    }

    public LatexRendererScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LatexRendererScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
