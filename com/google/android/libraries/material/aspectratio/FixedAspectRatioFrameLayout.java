package com.google.android.libraries.material.aspectratio;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* compiled from: PG */
public class FixedAspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    public float f77355a;

    public FixedAspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r1 != 1073741824) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r11, int r12) {
        /*
            r10 = this;
            float r0 = r10.f77355a
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x000b
            super.onMeasure(r11, r12)
            return
        L_0x000b:
            int r0 = android.view.View.MeasureSpec.getMode(r11)
            int r1 = android.view.View.MeasureSpec.getMode(r12)
            r2 = 0
            r3 = 1073741824(0x40000000, float:2.0)
            if (r0 != r3) goto L_0x001b
            if (r1 == r3) goto L_0x0021
            goto L_0x0025
        L_0x001b:
            if (r0 != 0) goto L_0x0025
            if (r1 == 0) goto L_0x0021
            r0 = 0
            goto L_0x0025
        L_0x0021:
            super.onMeasure(r11, r12)
            return
        L_0x0025:
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L_0x0046
            if (r0 == 0) goto L_0x0046
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            float r0 = (float) r11
            float r5 = r10.f77355a
            float r0 = r0 / r5
            int r0 = java.lang.Math.round(r0)
            if (r1 == r4) goto L_0x0041
            if (r1 == r3) goto L_0x0061
            r12 = r0
            goto L_0x0061
        L_0x0041:
            int r12 = java.lang.Math.min(r0, r12)
            goto L_0x0061
        L_0x0046:
            int r12 = android.view.View.MeasureSpec.getSize(r12)
            int r11 = android.view.View.MeasureSpec.getSize(r11)
            float r1 = (float) r12
            float r5 = r10.f77355a
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            if (r0 == r4) goto L_0x005d
            if (r0 == r3) goto L_0x0061
            r11 = r1
            goto L_0x0061
        L_0x005d:
            int r11 = java.lang.Math.min(r1, r11)
        L_0x0061:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r11, r3)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r12, r3)
        L_0x0069:
            int r3 = r10.getChildCount()
            if (r2 >= r3) goto L_0x0086
            android.view.View r5 = r10.getChildAt(r2)
            int r3 = r5.getVisibility()
            r4 = 8
            if (r3 == r4) goto L_0x0083
            r7 = 0
            r9 = 0
            r4 = r10
            r6 = r0
            r8 = r1
            r4.measureChildWithMargins(r5, r6, r7, r8, r9)
        L_0x0083:
            int r2 = r2 + 1
            goto L_0x0069
        L_0x0086:
            r10.setMeasuredDimension(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.material.aspectratio.FixedAspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f77355a = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C28504a.f77356a);
            try {
                this.f77355a = obtainStyledAttributes.getFloat(0, this.f77355a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}
