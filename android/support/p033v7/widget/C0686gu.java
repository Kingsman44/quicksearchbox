package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.gu */
/* compiled from: PG */
public final class C0686gu extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0687gv f2510a;

    /* renamed from: b */
    private boolean f2511b = false;

    protected C0686gu(C0687gv gvVar) {
        this.f2510a = gvVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2511b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f2511b) {
            this.f2510a.setVisibility(0);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f2510a.setVisibility(0);
        this.f2511b = false;
    }
}
