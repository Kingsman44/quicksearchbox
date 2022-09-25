package com.google.android.libraries.lens.view.infopanel;

import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.infopanel.bl */
/* compiled from: PG */
final class C27050bl {

    /* renamed from: a */
    public final View f73715a;

    /* renamed from: b */
    public final View f73716b;

    /* renamed from: c */
    public final C27046bh f73717c;

    /* renamed from: d */
    public final C27046bh f73718d;

    /* renamed from: e */
    public final Runnable f73719e;

    /* renamed from: f */
    public boolean f73720f;

    public C27050bl(View view, View view2, int i, int i2, Rect rect, Runnable runnable) {
        int[] iArr = new int[2];
        ((View) view.getParent()).getLocationInWindow(iArr);
        PointF pointF = new PointF((float) (rect.left - iArr[0]), (float) (rect.top - iArr[1]));
        float f = (float) i2;
        C27046bh bhVar = new C27046bh(view, pointF, (float) i, f);
        this.f73717c = bhVar;
        int[] iArr2 = new int[2];
        view.getLocationInWindow(iArr2);
        C27046bh bhVar2 = new C27046bh(view2, new PointF((float) (iArr2[0] - iArr[0]), (float) ((iArr2[1] - iArr[1]) + (i2 / 2))), 0.0f, f);
        this.f73718d = bhVar2;
        bhVar.mo32490a(0.0f);
        bhVar2.mo32490a(0.0f);
        this.f73716b = view2;
        this.f73715a = view;
        this.f73719e = runnable;
    }
}
