package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.SpannableStringBuilder;
import android.widget.TextView;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ec */
/* compiled from: PG */
public final class C93633ec implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: a */
    private final TextView f261384a;

    /* renamed from: b */
    private final SpannableStringBuilder f261385b;

    public C93633ec(TextView textView, String str) {
        this.f261384a = textView;
        this.f261385b = new SpannableStringBuilder(str);
    }

    public final void onAnimationCancel(Animator animator) {
        this.f261385b.removeSpan(C93634ed.f261386a);
        this.f261384a.setText(this.f261385b);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261385b.removeSpan(C93634ed.f261386a);
        this.f261384a.setText(this.f261385b);
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f261385b.removeSpan(C93634ed.f261386a);
        this.f261385b.setSpan(C93634ed.f261386a, ((Integer) valueAnimator.getAnimatedValue()).intValue(), this.f261385b.length(), 33);
        this.f261384a.setText(this.f261385b);
    }
}
