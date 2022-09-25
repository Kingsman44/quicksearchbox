package com.google.android.apps.gsa.opaonboarding.p6463ui.checkableflip;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* renamed from: com.google.android.apps.gsa.opaonboarding.ui.checkableflip.c */
/* compiled from: PG */
public final class C84004c extends C84007f implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: g */
    private final C84005d f228836g = ((C84005d) this.f228847a);

    /* renamed from: h */
    private final ValueAnimator f228837h;

    /* renamed from: i */
    private final ValueAnimator f228838i;

    /* renamed from: j */
    private final float f228839j;

    public C84004c(Drawable drawable, Drawable drawable2, int i, float f, int i2) {
        super(drawable, new C84005d(i, drawable2), i2, i2 / 2);
        this.f228839j = f;
        int i3 = this.f228848b;
        long j = (long) (i3 / 2);
        long j2 = (((long) i3) / 2) + ((long) this.f228849c);
        ValueAnimator duration = ValueAnimator.ofFloat(new float[]{0.2f, f}).setDuration(j2);
        this.f228837h = duration;
        duration.setStartDelay(j);
        duration.addUpdateListener(this);
        ValueAnimator duration2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f}).setDuration(j2);
        this.f228838i = duration2;
        duration2.setStartDelay(j);
        duration2.addUpdateListener(this);
    }

    /* renamed from: a */
    public final void mo77452a() {
        this.f228852f = !this.f228852f;
        if (this.f228850d.isStarted()) {
            this.f228850d.reverse();
        } else if (!this.f228852f) {
            this.f228850d.start();
        } else {
            this.f228850d.reverse();
        }
        if (this.f228837h.isStarted()) {
            this.f228837h.reverse();
            this.f228838i.reverse();
        } else if (!this.f228852f) {
            this.f228837h.start();
            this.f228838i.start();
        } else {
            this.f228837h.reverse();
            this.f228838i.reverse();
        }
    }

    /* renamed from: b */
    public final void mo77453b(boolean z) {
        super.mo77453b(z);
        ValueAnimator valueAnimator = this.f228837h;
        if (valueAnimator != null && this.f228838i != null) {
            valueAnimator.cancel();
            this.f228838i.cancel();
            C84005d dVar = this.f228836g;
            dVar.getClass();
            dVar.mo77456b(z ? 0.2f : this.f228839j);
            C84005d dVar2 = this.f228836g;
            dVar2.getClass();
            dVar2.mo77455a(true != z ? 1.0f : 0.0f);
        }
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (valueAnimator == this.f228837h) {
            this.f228836g.mo77456b(floatValue);
        } else if (valueAnimator == this.f228838i) {
            this.f228836g.mo77455a(floatValue);
        }
    }
}
