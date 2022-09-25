package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: com.google.ads.interactivemedia.v3.internal.abi */
/* compiled from: PG */
public final class abi extends FrameLayout {

    /* renamed from: a */
    private final abh f20193a = new abh(this);

    /* renamed from: b */
    private float f20194b;

    /* renamed from: c */
    private final int f20195c = 0;

    public abi(Context context) {
        super(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo14386a(float f) {
        if (this.f20194b != f) {
            this.f20194b = f;
            requestLayout();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f20194b > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            float f = (float) measuredWidth;
            float f2 = (float) measuredHeight;
            float f3 = f / f2;
            float f4 = (this.f20194b / f3) - 4.0f;
            if (Math.abs(f4) <= 0.01f) {
                this.f20193a.mo14384a(this.f20194b, f3, false);
                return;
            }
            if (f4 > 0.0f) {
                measuredHeight = (int) (f / this.f20194b);
            } else {
                measuredWidth = (int) (f2 * this.f20194b);
            }
            this.f20193a.mo14384a(this.f20194b, f3, true);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
        }
    }
}
