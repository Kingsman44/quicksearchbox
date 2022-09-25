package com.google.android.material.p3504a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* renamed from: com.google.android.material.a.h */
/* compiled from: PG */
public final class C44503h {

    /* renamed from: a */
    public int f115661a = 0;

    /* renamed from: b */
    public int f115662b = 1;

    /* renamed from: c */
    private final long f115663c;

    /* renamed from: d */
    private final long f115664d;

    /* renamed from: e */
    private final TimeInterpolator f115665e;

    public C44503h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f115663c = j;
        this.f115664d = j2;
        this.f115665e = timeInterpolator;
    }

    /* renamed from: a */
    public final TimeInterpolator mo47385a() {
        TimeInterpolator timeInterpolator = this.f115665e;
        return timeInterpolator != null ? timeInterpolator : C44497b.f115651b;
    }

    /* renamed from: b */
    public final void mo47386b(Animator animator) {
        animator.setStartDelay(this.f115663c);
        animator.setDuration(this.f115664d);
        animator.setInterpolator(mo47385a());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f115661a);
            valueAnimator.setRepeatMode(this.f115662b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44503h)) {
            return false;
        }
        C44503h hVar = (C44503h) obj;
        if (this.f115663c == hVar.f115663c && this.f115664d == hVar.f115664d && this.f115661a == hVar.f115661a && this.f115662b == hVar.f115662b) {
            return mo47385a().getClass().equals(hVar.mo47385a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f115663c;
        long j2 = this.f115664d;
        return (((((((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + mo47385a().getClass().hashCode()) * 31) + this.f115661a) * 31) + this.f115662b;
    }

    public final String toString() {
        return "\n" + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f115663c + " duration: " + this.f115664d + " interpolator: " + mo47385a().getClass() + " repeatCount: " + this.f115661a + " repeatMode: " + this.f115662b + "}\n";
    }
}
