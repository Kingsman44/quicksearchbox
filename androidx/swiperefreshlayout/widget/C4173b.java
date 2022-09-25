package androidx.swiperefreshlayout.widget;

import android.animation.ValueAnimator;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: PG */
final class C4173b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ C4175d f13535a;

    /* renamed from: b */
    final /* synthetic */ C4176e f13536b;

    public C4173b(C4176e eVar, C4175d dVar) {
        this.f13536b = eVar;
        this.f13535a = dVar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        C4176e.m11995f(floatValue, this.f13535a);
        this.f13536b.mo8832a(floatValue, this.f13535a, false);
        this.f13536b.invalidateSelf();
    }
}
