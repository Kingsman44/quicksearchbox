package android.support.p033v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: android.support.v7.widget.cx */
/* compiled from: PG */
final class C0581cx extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C0583cz f2239a;

    /* renamed from: b */
    private boolean f2240b = false;

    public C0581cx(C0583cz czVar) {
        this.f2239a = czVar;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2240b = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f2240b) {
            this.f2240b = false;
        } else if (((Float) this.f2239a.f2264p.getAnimatedValue()).floatValue() == 0.0f) {
            C0583cz czVar = this.f2239a;
            czVar.f2265q = 0;
            czVar.mo2716a(0);
        } else {
            C0583cz czVar2 = this.f2239a;
            czVar2.f2265q = 2;
            czVar2.f2260l.invalidate();
        }
    }
}
