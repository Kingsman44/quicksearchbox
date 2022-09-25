package p5652p.p5653a.p5654a.p5655a.p5666f.p5667a;

import android.animation.Animator;

/* renamed from: p.a.a.a.f.a.d */
/* compiled from: PG */
final class C72702d implements Animator.AnimatorListener {

    /* renamed from: a */
    final /* synthetic */ boolean f193314a;

    /* renamed from: b */
    final /* synthetic */ C72703e f193315b;

    public C72702d(C72703e eVar, boolean z) {
        this.f193315b = eVar;
        this.f193314a = z;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        C72703e eVar = this.f193315b;
        eVar.f193322j = false;
        eVar.f193316a.requestLayout();
        if (this.f193314a) {
            C72703e eVar2 = this.f193315b;
            eVar2.mo64519m(eVar2.f193316a, eVar2.f193318c);
        }
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
        this.f193315b.f193322j = true;
    }
}
