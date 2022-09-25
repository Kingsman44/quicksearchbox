package com.google.android.libraries.animation.impl;

import android.animation.ValueAnimator;
import android.view.animation.LinearInterpolator;
import androidx.lifecycle.C2376g;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2384o;
import androidx.lifecycle.C2391v;
import com.google.android.libraries.animation.C147768a;
import com.google.android.libraries.animation.C147784j;
import com.google.android.libraries.animation.C147797w;
import p3186j$.time.Duration;

/* compiled from: PG */
final class AnimationControllerFactoryImpl$ValueAnimatorTicker implements C147797w {

    /* renamed from: a */
    private final C2384o f398730a;

    /* renamed from: b */
    private ValueAnimator f398731b;

    /* renamed from: c */
    private final C2376g f398732c = new C2376g() {
        /* renamed from: gV */
        public final /* synthetic */ void mo3520gV(C2391v vVar) {
        }

        /* renamed from: gW */
        public final void mo3521gW(C2391v vVar) {
            AnimationControllerFactoryImpl$ValueAnimatorTicker.this.mo124451b();
        }

        /* renamed from: gX */
        public final /* synthetic */ void mo3522gX(C2391v vVar) {
        }

        /* renamed from: gY */
        public final /* synthetic */ void mo3523gY(C2391v vVar) {
        }

        /* renamed from: gZ */
        public final /* synthetic */ void mo3524gZ(C2391v vVar) {
        }

        /* renamed from: ha */
        public final /* synthetic */ void mo3525ha(C2391v vVar) {
        }
    };

    public AnimationControllerFactoryImpl$ValueAnimatorTicker(C2384o oVar) {
        this.f398730a = oVar;
    }

    /* renamed from: a */
    public final void mo124450a(float f, float f2, Duration duration, C147768a aVar, C147784j jVar) {
        C2384o oVar = this.f398730a;
        if (oVar == null || !oVar.mo5789a().equals(C2383n.DESTROYED)) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.setDuration(duration.toMillis());
            ofFloat.addUpdateListener(new C147781d(aVar));
            C2384o oVar2 = this.f398730a;
            if (oVar2 != null) {
                oVar2.mo5790b(this.f398732c);
            }
            ofFloat.addListener(new C147782e(this, jVar));
            this.f398731b = ofFloat;
            ofFloat.start();
            return;
        }
        throw new IllegalStateException("Illegal call to 'start', since lifecycle owner is destroyed.");
    }

    /* renamed from: b */
    public final void mo124451b() {
        ValueAnimator valueAnimator = this.f398731b;
        if (valueAnimator != null) {
            valueAnimator.isRunning();
            this.f398731b.cancel();
            this.f398731b = null;
        }
    }

    /* renamed from: c */
    public final void mo124452c() {
        C2384o oVar = this.f398730a;
        if (oVar != null) {
            oVar.mo5791c(this.f398732c);
        }
    }
}
