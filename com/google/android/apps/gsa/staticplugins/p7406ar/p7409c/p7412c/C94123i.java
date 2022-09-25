package com.google.android.apps.gsa.staticplugins.p7406ar.p7409c.p7412c;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.c.c.i */
/* compiled from: PG */
final class C94123i extends Animation {

    /* renamed from: a */
    private final View f262953a;

    /* renamed from: b */
    private final float f262954b;

    /* renamed from: c */
    private final float f262955c;

    public C94123i(View view, float f) {
        this.f262953a = view;
        float height = (float) view.getHeight();
        this.f262954b = height;
        this.f262955c = f - height;
        setDuration(200);
    }

    /* access modifiers changed from: protected */
    public final void applyTransformation(float f, Transformation transformation) {
        this.f262953a.getLayoutParams().height = (int) (this.f262954b + (this.f262955c * f));
        this.f262953a.requestLayout();
    }
}
