package com.google.android.libraries.search.video.thirdparty.p3197ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* renamed from: com.google.android.libraries.search.video.thirdparty.ui.AspectRatioFrameLayout */
/* compiled from: PG */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: a */
    public float f108779a;

    /* renamed from: b */
    public int f108780b;

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
        if (r3 > 0.0f) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        if (r3 > 0.0f) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r8 = r6.f108779a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            super.onMeasure(r7, r8)
            float r7 = r6.f108779a
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x000b
            return
        L_0x000b:
            int r7 = r6.getMeasuredWidth()
            int r0 = r6.getMeasuredHeight()
            if (r7 == 0) goto L_0x005f
            if (r0 != 0) goto L_0x0018
            goto L_0x005f
        L_0x0018:
            float r1 = (float) r7
            float r2 = (float) r0
            float r3 = r6.f108779a
            float r4 = r1 / r2
            float r3 = r3 / r4
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r3 = r3 + r4
            float r4 = java.lang.Math.abs(r3)
            r5 = 1008981770(0x3c23d70a, float:0.01)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L_0x002e
            return
        L_0x002e:
            int r4 = r6.f108780b
            if (r4 == 0) goto L_0x004b
            r5 = 1
            if (r4 == r5) goto L_0x0046
            r5 = 2
            if (r4 == r5) goto L_0x0040
            r5 = 4
            if (r4 == r5) goto L_0x003c
            goto L_0x0052
        L_0x003c:
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x004f
        L_0x0040:
            float r7 = r6.f108779a
            float r2 = r2 * r7
            int r7 = (int) r2
            goto L_0x0052
        L_0x0046:
            float r8 = r6.f108779a
        L_0x0048:
            float r1 = r1 / r8
            int r0 = (int) r1
            goto L_0x0052
        L_0x004b:
            int r8 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r8 <= 0) goto L_0x0040
        L_0x004f:
            float r8 = r6.f108779a
            goto L_0x0048
        L_0x0052:
            r8 = 1073741824(0x40000000, float:2.0)
            int r7 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r8)
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r8)
            super.onMeasure(r7, r8)
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.video.thirdparty.p3197ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f108780b = 0;
    }
}
