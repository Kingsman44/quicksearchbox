package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.bp */
/* compiled from: PG */
final class C93565bp extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C93566bq f261245a;

    public C93565bp(C93566bq bqVar) {
        this.f261245a = bqVar;
    }

    public final void onAnimationEnd(Animator animator) {
        C93566bq bqVar = this.f261245a;
        int i = 0;
        bqVar.f261255v = false;
        bqVar.f261252g.setAlpha(1.0f);
        C93566bq bqVar2 = this.f261245a;
        View view = bqVar2.f261252g;
        if (true != bqVar2.mo87738h()) {
            i = 4;
        }
        view.setVisibility(i);
    }

    public final void onAnimationStart(Animator animator) {
        this.f261245a.f261252g.setVisibility(0);
        this.f261245a.f261255v = true;
    }
}
