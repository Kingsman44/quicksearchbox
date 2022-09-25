package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.e */
/* compiled from: PG */
final class C0611e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ ActionBarOverlayLayout f2348a;

    public C0611e(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f2348a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2348a;
        actionBarOverlayLayout.f1751i = null;
        actionBarOverlayLayout.f1748f = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f2348a;
        actionBarOverlayLayout.f1751i = null;
        actionBarOverlayLayout.f1748f = false;
    }
}
