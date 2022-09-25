package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.material.p3515l.C44779j;

/* renamed from: com.google.android.material.appbar.b */
/* compiled from: PG */
final class C44506b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C44779j f115733a;

    /* renamed from: b */
    final /* synthetic */ AppBarLayout f115734b;

    public C44506b(AppBarLayout appBarLayout, C44779j jVar) {
        this.f115734b = appBarLayout;
        this.f115733a = jVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f115733a.mo48123U(floatValue);
        Drawable drawable = this.f115734b.f115673h;
        if (drawable instanceof C44779j) {
            ((C44779j) drawable).mo48123U(floatValue);
        }
        for (C44519o a : this.f115734b.f115672g) {
            int i = this.f115733a.f116746H;
            a.mo47459a();
        }
    }
}
