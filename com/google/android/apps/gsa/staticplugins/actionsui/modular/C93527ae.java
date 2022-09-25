package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.ValueAnimator;
import android.text.format.Time;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.ae */
/* compiled from: PG */
public final class C93527ae implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    final /* synthetic */ AudioArgumentView f261163a;

    public C93527ae(AudioArgumentView audioArgumentView) {
        this.f261163a = audioArgumentView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Time time = new Time();
        time.set(valueAnimator.getCurrentPlayTime());
        this.f261163a.f261003b.setText(time.format("%M:%S"));
    }
}
