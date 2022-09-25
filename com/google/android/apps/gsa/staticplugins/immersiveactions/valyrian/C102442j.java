package com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian;

import android.transition.Transition;

/* renamed from: com.google.android.apps.gsa.staticplugins.immersiveactions.valyrian.j */
/* compiled from: PG */
final class C102442j implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C102443k f285905a;

    public C102442j(C102443k kVar) {
        this.f285905a = kVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        C102443k kVar = this.f285905a;
        int i = kVar.f285909f;
        kVar.f285909f = 0;
        if (i == 2) {
            kVar.mo87999l();
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
