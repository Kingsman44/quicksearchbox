package com.google.android.apps.search.googleapp.search.srp.p10442ui;

import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.ui.c */
/* compiled from: PG */
public final class C137893c extends C137894d {

    /* renamed from: a */
    public final Path f375189a = new Path();

    /* renamed from: b */
    public final float f375190b;

    /* renamed from: c */
    public final RectF f375191c;

    public C137893c(RoundedFrameLayoutView roundedFrameLayoutView, TypedArray typedArray) {
        roundedFrameLayoutView.setWillNotDraw(false);
        float f = 0.0f;
        if (typedArray != null) {
            int[] iArr = C137891a.f375187a;
            f = typedArray.getDimension(0, 0.0f);
        }
        this.f375190b = f;
        this.f375191c = new RectF();
    }
}
