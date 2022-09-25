package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.transition.Transition;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.i */
/* compiled from: PG */
final class C16810i implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C16812k f49224a;

    public C16810i(C16812k kVar) {
        this.f49224a = kVar;
    }

    public final void onTransitionCancel(Transition transition) {
        this.f49224a.mo23031a();
        transition.removeListener(this);
    }

    public final void onTransitionEnd(Transition transition) {
        this.f49224a.mo23031a();
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
