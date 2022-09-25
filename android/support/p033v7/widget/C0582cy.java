package android.support.p033v7.widget;

import android.animation.ValueAnimator;

/* renamed from: android.support.v7.widget.cy */
/* compiled from: PG */
final class C0582cy implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0583cz f2241a;

    public C0582cy(C0583cz czVar) {
        this.f2241a = czVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        this.f2241a.f2250b.setAlpha(floatValue);
        this.f2241a.f2251c.setAlpha(floatValue);
        this.f2241a.f2260l.invalidate();
    }
}
