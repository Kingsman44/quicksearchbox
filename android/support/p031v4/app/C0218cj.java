package android.support.p031v4.app;

import android.transition.Transition;

/* renamed from: android.support.v4.app.cj */
/* compiled from: PG */
final class C0218cj implements Transition.TransitionListener {

    /* renamed from: a */
    final /* synthetic */ Runnable f837a;

    public C0218cj(Runnable runnable) {
        this.f837a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        this.f837a.run();
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionStart(Transition transition) {
    }
}
