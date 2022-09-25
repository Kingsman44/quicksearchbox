package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.af */
/* compiled from: PG */
public final class C93528af extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ AudioArgumentView f261164a;

    public C93528af(AudioArgumentView audioArgumentView) {
        this.f261164a = audioArgumentView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261164a.mo87856b();
        AudioArgumentView audioArgumentView = this.f261164a;
        audioArgumentView.f261011v = 4;
        audioArgumentView.mo87732f();
    }
}
