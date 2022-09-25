package com.google.android.material.bottomsheet;

import android.animation.ValueAnimator;
import com.google.android.material.p3515l.C44779j;

/* renamed from: com.google.android.material.bottomsheet.b */
/* compiled from: PG */
final class C44551b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ BottomSheetBehavior f115933a;

    public C44551b(BottomSheetBehavior bottomSheetBehavior) {
        this.f115933a = bottomSheetBehavior;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C44779j jVar = this.f115933a.f115899j;
        if (jVar != null) {
            jVar.mo48125W(floatValue);
        }
    }
}
