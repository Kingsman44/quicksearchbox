package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.el */
/* compiled from: PG */
final class C93642el extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C93643em f261400a;

    public C93642el(C93643em emVar) {
        this.f261400a = emVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C93643em emVar = this.f261400a;
        int i = 0;
        emVar.f261406f = false;
        emVar.f261405e.setAlpha(1.0f);
        C93643em emVar2 = this.f261400a;
        View view = emVar2.f261405e;
        if (true != emVar2.mo88112v()) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261400a.f261405e.setVisibility(0);
        this.f261400a.f261406f = true;
    }
}
