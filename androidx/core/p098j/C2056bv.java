package androidx.core.p098j;

import android.view.ViewPropertyAnimator;

/* renamed from: androidx.core.j.bv */
/* compiled from: PG */
final class C2056bv {
    /* renamed from: a */
    static ViewPropertyAnimator m5628a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        return viewPropertyAnimator.withEndAction(runnable);
    }

    /* renamed from: b */
    static ViewPropertyAnimator m5629b(ViewPropertyAnimator viewPropertyAnimator) {
        return viewPropertyAnimator.withLayer();
    }

    /* renamed from: c */
    static ViewPropertyAnimator m5630c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
        return viewPropertyAnimator.withStartAction(runnable);
    }
}
