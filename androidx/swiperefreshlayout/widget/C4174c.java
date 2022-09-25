package androidx.swiperefreshlayout.widget;

import android.animation.Animator;

/* renamed from: androidx.swiperefreshlayout.widget.c */
/* compiled from: PG */
final class C4174c implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ C4175d f13537a;

    /* renamed from: b */
    final /* synthetic */ C4176e f13538b;

    public C4174c(C4176e eVar, C4175d dVar) {
        this.f13538b = eVar;
        this.f13537a = dVar;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
    }

    public final void onAnimationRepeat(Animator animator) {
        this.f13538b.mo8832a(1.0f, this.f13537a, true);
        this.f13537a.mo8831g();
        C4175d dVar = this.f13537a;
        dVar.mo8827c(dVar.mo8825a());
        C4176e eVar = this.f13538b;
        if (eVar.f13565c) {
            eVar.f13565c = false;
            animator.cancel();
            animator.setDuration(1332);
            animator.start();
            this.f13537a.mo8829e(false);
            return;
        }
        eVar.f13564b += 1.0f;
    }

    public final void onAnimationStart(Animator animator) {
        this.f13538b.f13564b = 0.0f;
    }
}
