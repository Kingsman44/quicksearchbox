package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* compiled from: PG */
public class ShrinkingItem extends FrameLayout {

    /* renamed from: a */
    private float f393839a = 1.0f;

    public ShrinkingItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredHeight = getMeasuredHeight();
        float f = this.f393839a;
        if (f != 1.0f) {
            measuredHeight = Math.round(f * ((float) measuredHeight));
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), measuredHeight);
    }

    public ShrinkingItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
