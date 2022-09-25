package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.transition.Transition;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.cf */
/* compiled from: PG */
final class C93582cf implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C93583cg f261277a;

    public C93582cf(C93583cg cgVar) {
        this.f261277a = cgVar;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        C93583cg cgVar = this.f261277a;
        int i = cgVar.f261279c;
        cgVar.f261279c = 0;
        if (i == 2) {
            cgVar.mo88000m(true);
        } else {
            cgVar.mo87995a();
        }
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
