package androidx.media3.p174ui;

import android.animation.ValueAnimator;

/* renamed from: androidx.media3.ui.d */
/* compiled from: PG */
public final /* synthetic */ class C3640d implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ DefaultTimeBar f11705a;

    public /* synthetic */ C3640d(DefaultTimeBar defaultTimeBar) {
        this.f11705a = defaultTimeBar;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        DefaultTimeBar defaultTimeBar = this.f11705a;
        defaultTimeBar.f11599b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        defaultTimeBar.invalidate(defaultTimeBar.f11598a);
    }
}
