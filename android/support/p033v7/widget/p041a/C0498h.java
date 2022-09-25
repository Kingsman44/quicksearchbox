package android.support.p033v7.widget.p041a;

import android.animation.ValueAnimator;

/* renamed from: android.support.v7.widget.a.h */
/* compiled from: PG */
final class C0498h implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C0499i f1987a;

    public C0498h(C0499i iVar) {
        this.f1987a = iVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f1987a.f2000p = valueAnimator.getAnimatedFraction();
    }
}
