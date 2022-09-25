package com.google.android.material.internal;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* renamed from: com.google.android.material.internal.aq */
/* compiled from: PG */
public final class C44718aq implements TypeEvaluator {

    /* renamed from: a */
    private final Rect f116571a;

    public C44718aq(Rect rect) {
        this.f116571a = rect;
    }

    public final /* bridge */ /* synthetic */ Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        this.f116571a.set(rect.left + ((int) (((float) (rect2.left - rect.left)) * f)), rect.top + ((int) (((float) (rect2.top - rect.top)) * f)), rect.right + ((int) (((float) (rect2.right - rect.right)) * f)), rect.bottom + ((int) (((float) (rect2.bottom - rect.bottom)) * f)));
        return this.f116571a;
    }
}
