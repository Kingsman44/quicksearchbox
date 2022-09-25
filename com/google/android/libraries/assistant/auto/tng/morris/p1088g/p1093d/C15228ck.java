package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1093d;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.d.ck */
/* compiled from: PG */
final class C15228ck implements Animation.AnimationListener {

    /* renamed from: a */
    final /* synthetic */ C15231cn f45696a;

    public C15228ck(C15231cn cnVar) {
        this.f45696a = cnVar;
    }

    public final void onAnimationEnd(Animation animation) {
        View view = this.f45696a.f45700c;
        if (view != null) {
            view.setAlpha(0.0f);
        }
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
