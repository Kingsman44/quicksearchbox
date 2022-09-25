package com.google.android.apps.gsa.staticplugins.immersiveactions;

import android.transition.Transition;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.ag */
/* compiled from: PG */
final class C102400ag implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C102401ah f285794a;

    public C102400ag(C102401ah ahVar) {
        this.f285794a = ahVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        C102401ah ahVar = this.f285794a;
        int i = ahVar.f285801h;
        ahVar.f285801h = 0;
        if (i == 2) {
            ahVar.mo87999l();
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
