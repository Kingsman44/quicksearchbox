package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.translation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.translation.c */
/* compiled from: PG */
public final class C130031c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ImageView f356573a;

    /* renamed from: b */
    final /* synthetic */ C130033e f356574b;

    public C130031c(ImageView imageView, C130033e eVar) {
        this.f356573a = imageView;
        this.f356574b = eVar;
    }

    public final void onAnimationCancel(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f356574b.f356580e = true;
    }

    public final void onAnimationEnd(Animator animator) {
        C69664n.m101061g(animator, "animation");
        C130033e eVar = this.f356574b;
        if (!eVar.f356580e) {
            eVar.mo109439b();
            this.f356573a.setAlpha(0.25f);
        }
    }

    public final void onAnimationStart(Animator animator) {
        C69664n.m101061g(animator, "animation");
        this.f356573a.setVisibility(0);
    }
}
