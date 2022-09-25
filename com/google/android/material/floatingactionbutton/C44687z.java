package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import com.google.android.material.p3515l.C44779j;

/* renamed from: com.google.android.material.floatingactionbutton.z */
/* compiled from: PG */
abstract class C44687z extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private boolean f116475a;

    /* renamed from: b */
    final /* synthetic */ C44658aa f116476b;

    /* renamed from: c */
    private float f116477c;

    /* renamed from: d */
    private float f116478d;

    public C44687z(C44658aa aaVar) {
        this.f116476b = aaVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract float mo47987a();

    public final void onAnimationEnd(Animator animator) {
        this.f116476b.mo47933j((float) ((int) this.f116478d));
        this.f116475a = false;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        if (!this.f116475a) {
            C44779j jVar = this.f116476b.f116405m;
            if (jVar == null) {
                f = 0.0f;
            } else {
                f = jVar.f116741C.f116732o;
            }
            this.f116477c = f;
            this.f116478d = mo47987a();
            this.f116475a = true;
        }
        C44658aa aaVar = this.f116476b;
        float f2 = this.f116477c;
        aaVar.mo47933j((float) ((int) (f2 + ((this.f116478d - f2) * valueAnimator.getAnimatedFraction()))));
    }
}
