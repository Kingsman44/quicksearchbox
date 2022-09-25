package com.google.android.libraries.p579ar.sceneviewer.media.capture;

import android.animation.Animator;

/* renamed from: com.google.android.libraries.ar.sceneviewer.media.capture.a */
/* compiled from: PG */
final class C10724a implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ ShutterButtonController f35659a;

    public C10724a(ShutterButtonController shutterButtonController) {
        this.f35659a = shutterButtonController;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f35659a.stopRecording();
    }

    public final void onAnimationEnd(Animator animator) {
        this.f35659a.stopRecording();
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f35659a.stopRecording();
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationStart(Animator animator, boolean z) {
    }

    public final void onAnimationEnd(Animator animator, boolean z) {
        this.f35659a.stopRecording();
    }
}
