package android.support.p033v7.widget;

import android.animation.ValueAnimator;

/* renamed from: android.support.v7.widget.cv */
/* compiled from: PG */
final class C0579cv implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C0583cz f2237a;

    public C0579cv(C0583cz czVar) {
        this.f2237a = czVar;
    }

    public final void run() {
        C0583cz czVar = this.f2237a;
        int i = czVar.f2265q;
        if (i == 1) {
            czVar.f2264p.cancel();
        } else if (i != 2) {
            return;
        }
        czVar.f2265q = 3;
        ValueAnimator valueAnimator = czVar.f2264p;
        valueAnimator.setFloatValues(new float[]{((Float) valueAnimator.getAnimatedValue()).floatValue(), 0.0f});
        czVar.f2264p.setDuration(500);
        czVar.f2264p.start();
    }
}
