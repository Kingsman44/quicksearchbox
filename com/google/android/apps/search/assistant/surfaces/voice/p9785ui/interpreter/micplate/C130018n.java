package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.micplate;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.micplate.n */
/* compiled from: PG */
public final class C130018n extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C130019o f356541a;

    /* renamed from: b */
    final /* synthetic */ View f356542b;

    public C130018n(C130019o oVar, View view) {
        this.f356541a = oVar;
        this.f356542b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        if (!this.f356541a.f356557o) {
            this.f356542b.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animation");
    }
}
