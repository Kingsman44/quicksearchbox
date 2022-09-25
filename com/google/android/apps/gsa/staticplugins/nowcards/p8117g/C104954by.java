package com.google.android.apps.gsa.staticplugins.nowcards.p8117g;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.g.by */
/* compiled from: PG */
final class C104954by extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C104957ca f292439a;

    public C104954by(C104957ca caVar) {
        this.f292439a = caVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f292439a.f292450h.setVisibility(0);
        this.f292439a.f292450h.sendAccessibilityEvent(8);
    }
}
