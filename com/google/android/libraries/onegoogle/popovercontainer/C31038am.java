package com.google.android.libraries.onegoogle.popovercontainer;

import android.animation.TypeEvaluator;
import android.graphics.RectF;

/* renamed from: com.google.android.libraries.onegoogle.popovercontainer.am */
/* compiled from: PG */
final class C31038am implements TypeEvaluator {

    /* renamed from: a */
    private final RectF f83610a;

    public C31038am(RectF rectF) {
        this.f83610a = rectF;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        RectF rectF = (RectF) obj;
        RectF rectF2 = (RectF) obj2;
        this.f83610a.top = rectF.top + ((rectF2.top - rectF.top) * f);
        this.f83610a.left = rectF.left + ((rectF2.left - rectF.left) * f);
        this.f83610a.right = rectF.right + ((rectF2.right - rectF.right) * f);
        this.f83610a.bottom = rectF.bottom + (f * (rectF2.bottom - rectF.bottom));
        return this.f83610a;
    }
}
