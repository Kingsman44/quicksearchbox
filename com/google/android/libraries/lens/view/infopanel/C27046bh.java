package com.google.android.libraries.lens.view.infopanel;

import android.graphics.PointF;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bh */
/* compiled from: PG */
final class C27046bh {

    /* renamed from: a */
    private final View f73710a;

    /* renamed from: b */
    private final float f73711b;

    /* renamed from: c */
    private final PointF f73712c;

    public C27046bh(View view, PointF pointF, float f, float f2) {
        this.f73710a = view;
        int[] iArr = new int[2];
        ((View) view.getParent()).getLocationInWindow(iArr);
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        float f3 = f / 2.0f;
        PointF pointF2 = new PointF(pointF.x + f3, pointF.y + f3);
        float f4 = f2 / 2.0f;
        PointF pointF3 = new PointF(((float) (iArr2[0] - iArr[0])) + f4, ((float) (iArr2[1] - iArr[1])) + f4);
        this.f73712c = new PointF(pointF2.x - pointF3.x, pointF2.y - pointF3.y);
        this.f73711b = f / f2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo32490a(float f) {
        float f2 = 1.0f - f;
        float f3 = (this.f73711b * f2) + f;
        this.f73710a.setScaleX(f3);
        this.f73710a.setScaleY(f3);
        float f4 = f * 0.0f;
        this.f73710a.setTranslationX((this.f73712c.x * f2) + f4);
        this.f73710a.setTranslationY((this.f73712c.y * f2) + f4);
    }
}
