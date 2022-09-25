package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1319c;

import android.transition.Transition;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16752bm;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.c.c */
/* compiled from: PG */
final class C16780c implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ C16752bm f49094a;

    /* renamed from: b */
    final /* synthetic */ C16781d f49095b;

    public C16780c(C16781d dVar, C16752bm bmVar) {
        this.f49095b = dVar;
        this.f49094a = bmVar;
    }

    public final void onTransitionCancel(Transition transition) {
        this.f49095b.f49100e = false;
        transition.removeListener(this);
    }

    public final void onTransitionEnd(Transition transition) {
        this.f49095b.mo23008h(this.f49094a);
        transition.removeListener(this);
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
