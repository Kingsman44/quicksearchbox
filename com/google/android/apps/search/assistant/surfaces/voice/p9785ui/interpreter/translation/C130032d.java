package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.d */
/* compiled from: PG */
public final class C130032d extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C130033e f356575a;

    public C130032d(C130033e eVar) {
        this.f356575a = eVar;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f356575a.f356580e = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        C130033e eVar = this.f356575a;
        if (!eVar.f356580e) {
            eVar.mo109439b();
            this.f356575a.mo109438a().setAlpha(0.25f);
        }
    }
}
