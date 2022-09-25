package androidx.p197u;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: androidx.u.ab */
/* compiled from: PG */
final class C4191ab extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C4195af f13582a;

    public C4191ab(C4195af afVar) {
        this.f13582a = afVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f13582a.mo8890q();
        animator.removeListener(this);
    }
}
