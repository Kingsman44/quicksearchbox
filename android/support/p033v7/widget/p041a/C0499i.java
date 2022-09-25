package android.support.p033v7.widget.p041a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.support.p033v7.widget.C0673gh;

/* renamed from: android.support.v7.widget.a.i */
/* compiled from: PG */
class C0499i implements Animator.AnimatorListener {

    /* renamed from: d */
    final float f1988d;

    /* renamed from: e */
    final float f1989e;

    /* renamed from: f */
    final float f1990f;

    /* renamed from: g */
    final float f1991g;

    /* renamed from: h */
    final C0673gh f1992h;

    /* renamed from: i */
    final int f1993i;

    /* renamed from: j */
    final ValueAnimator f1994j;

    /* renamed from: k */
    boolean f1995k;

    /* renamed from: l */
    float f1996l;

    /* renamed from: m */
    float f1997m;

    /* renamed from: n */
    boolean f1998n = false;

    /* renamed from: o */
    boolean f1999o = false;

    /* renamed from: p */
    public float f2000p;

    public C0499i(C0673gh ghVar, int i, float f, float f2, float f3, float f4) {
        this.f1993i = i;
        this.f1992h = ghVar;
        this.f1988d = f;
        this.f1989e = f2;
        this.f1990f = f3;
        this.f1991g = f4;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        this.f1994j = ofFloat;
        ofFloat.addUpdateListener(new C0498h(this));
        ofFloat.setTarget(ghVar.itemView);
        ofFloat.addListener(this);
        this.f2000p = 0.0f;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f2000p = 1.0f;
    }

    public void onAnimationEnd(Animator animator) {
        if (!this.f1999o) {
            this.f1992h.setIsRecyclable(true);
        }
        this.f1999o = true;
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
