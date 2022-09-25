package com.google.android.libraries.lens.view.common;

import android.content.res.TypedArray;
import android.graphics.Path;

/* renamed from: com.google.android.libraries.lens.view.common.d */
/* compiled from: PG */
public final class C25742d extends C25743e {

    /* renamed from: a */
    public final RoundedImageView f69993a;

    /* renamed from: b */
    public final Path f69994b;

    /* renamed from: c */
    public float f69995c;

    /* renamed from: d */
    public float f69996d;

    /* renamed from: e */
    public float f69997e;

    /* renamed from: f */
    public float f69998f;

    /* renamed from: g */
    public float f69999g;

    /* renamed from: h */
    public boolean f70000h;

    public C25742d(RoundedImageView roundedImageView, TypedArray typedArray) {
        this.f69993a = roundedImageView;
        if (typedArray != null) {
            int[] iArr = C25732b.f69977a;
            float dimension = typedArray.getDimension(0, 0.0f);
            this.f69995c = typedArray.getDimension(3, dimension);
            this.f69996d = typedArray.getDimension(4, dimension);
            this.f69998f = typedArray.getDimension(1, dimension);
            this.f69997e = typedArray.getDimension(2, dimension);
            this.f69999g = typedArray.getFloat(5, -1.0f);
        } else {
            this.f69995c = 0.0f;
            this.f69996d = 0.0f;
            this.f69998f = 0.0f;
            this.f69997e = 0.0f;
            this.f69999g = -1.0f;
        }
        this.f69994b = new Path();
        this.f70000h = true;
    }

    /* renamed from: a */
    public final void mo30897a(float f, float f2, float f3, float f4) {
        this.f69995c = f;
        this.f69996d = f2;
        this.f69998f = f3;
        this.f69997e = f4;
        this.f70000h = true;
        this.f69993a.invalidate();
    }

    /* renamed from: b */
    public final void mo30898b(float f) {
        this.f69999g = f;
        this.f69993a.requestLayout();
    }
}
