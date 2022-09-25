package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: com.google.android.material.internal.w */
/* compiled from: PG */
public final class C44763w implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public static final /* synthetic */ int f116699a = 0;

    /* renamed from: b */
    private final C44762v f116700b;

    /* renamed from: c */
    private final View[] f116701c;

    public C44763w(C44762v vVar, View... viewArr) {
        this.f116700b = vVar;
        this.f116701c = viewArr;
    }

    /* renamed from: a */
    public static C44763w m79368a(View... viewArr) {
        return new C44763w(C44761u.f116698a, viewArr);
    }

    /* renamed from: b */
    public static C44763w m79369b(View... viewArr) {
        return new C44763w(C44758r.f116695a, viewArr);
    }

    /* renamed from: c */
    public static C44763w m79370c(View... viewArr) {
        return new C44763w(C44760t.f116697a, viewArr);
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View a : this.f116701c) {
            this.f116700b.mo48103a(valueAnimator, a);
        }
    }
}
