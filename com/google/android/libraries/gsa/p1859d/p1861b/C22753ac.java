package com.google.android.libraries.gsa.p1859d.p1861b;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.animation.Interpolator;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.gsa.d.b.ac */
/* compiled from: PG */
final class C22753ac extends AnimatorListenerAdapter implements Interpolator {

    /* renamed from: a */
    public int f62599a;

    /* renamed from: b */
    private final C22754ad f62600b;

    /* renamed from: c */
    private ObjectAnimator f62601c;

    public C22753ac(C22754ad adVar) {
        this.f62600b = adVar;
    }

    /* renamed from: a */
    public final void mo27954a() {
        ObjectAnimator objectAnimator = this.f62601c;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.f62601c.cancel();
        }
    }

    /* renamed from: b */
    public final void mo27955b(int i, int i2) {
        mo27954a();
        this.f62599a = i;
        if (i2 > 0) {
            ObjectAnimator duration = ObjectAnimator.ofInt(this.f62600b, C22754ad.f62602b, new int[]{i}).setDuration((long) i2);
            this.f62601c = duration;
            duration.setInterpolator(this);
            this.f62601c.addListener(this);
            this.f62601c.start();
            return;
        }
        onAnimationEnd((Animator) null);
    }

    /* renamed from: c */
    public final boolean mo27956c() {
        return this.f62601c == null;
    }

    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }

    public final void onAnimationEnd(Animator animator) {
        Property property = C22754ad.f62602b;
        C58976aa aaVar = C58975e.f156826a;
        this.f62601c = null;
        this.f62600b.mo27972n(this.f62599a);
        C22754ad adVar = this.f62600b;
        if (adVar.f62606C) {
            adVar.f62606C = false;
            int i = adVar.f62614e;
            if (i == 0) {
                adVar.mo27962d();
            } else if (i == adVar.getMeasuredWidth()) {
                adVar.mo27964f();
            }
        }
    }
}
