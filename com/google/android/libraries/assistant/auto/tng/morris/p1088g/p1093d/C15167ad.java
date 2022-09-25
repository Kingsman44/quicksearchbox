package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ad */
/* compiled from: PG */
final class C15167ad implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C15169af f45501a;

    public C15167ad(C15169af afVar) {
        this.f45501a = afVar;
    }

    public final void onAnimationEnd(Animation animation) {
        View view = this.f45501a.f45505c;
        if (view != null) {
            view.setAlpha(0.0f);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
