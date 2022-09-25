package com.google.android.libraries.gsa.monet.tools.p1897b.p1904d;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23131a;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23134d;
import com.google.android.libraries.gsa.monet.tools.p1896a.C23136f;

/* renamed from: com.google.android.libraries.gsa.monet.tools.b.d.c */
/* compiled from: PG */
public final class C23166c implements C23170g {

    /* renamed from: a */
    public final ViewGroup f63535a;

    /* renamed from: b */
    public final Runnable f63536b;

    /* renamed from: c */
    private final C23168e f63537c;

    /* renamed from: d */
    private final C23168e f63538d;

    /* renamed from: e */
    private AnimatorSet f63539e;

    public C23166c(ViewGroup viewGroup, C23168e eVar, C23168e eVar2, Runnable runnable) {
        this.f63535a = viewGroup;
        this.f63537c = eVar;
        this.f63538d = eVar2;
        this.f63536b = runnable;
    }

    /* renamed from: d */
    private final void m43355d() {
        AnimatorSet animatorSet = this.f63539e;
        if (animatorSet != null && animatorSet.isRunning()) {
            this.f63539e.cancel();
        }
        this.f63539e = null;
    }

    /* renamed from: e */
    private final void m43356e(C22939d dVar, C22939d dVar2, Runnable runnable, boolean z) {
        Animator animator;
        Animator animator2;
        View view;
        C23168e eVar;
        m43355d();
        C23168e eVar2 = this.f63537c;
        if (dVar == null && (eVar = this.f63538d) != null) {
            eVar2 = eVar;
        } else if (dVar instanceof C23169f) {
            eVar2 = ((C23169f) dVar).mo28615e(dVar2.mo28292ad());
        }
        if (z) {
            animator = m43357f(eVar2.f63544b, dVar);
            animator2 = m43357f(eVar2.f63545c, dVar2);
        } else {
            C23134d dVar3 = eVar2.f63546d;
            if (dVar3 != null) {
                animator = m43357f(dVar3, dVar);
            } else {
                animator = m43358g(eVar2.f63544b, dVar);
            }
            C23134d dVar4 = eVar2.f63547e;
            if (dVar4 != null) {
                animator2 = m43357f(dVar4, dVar2);
            } else {
                animator2 = m43358g(eVar2.f63545c, dVar2);
            }
        }
        if (dVar == null) {
            view = null;
        } else {
            view = dVar.mo28297il();
        }
        View view2 = view;
        View il = dVar2.mo28297il();
        if (view2 != null) {
            animator.setTarget(view2);
        }
        animator2.setTarget(il);
        if (view2 != null) {
            if (z) {
                C23067b.m43232e(view2.getParent() == this.f63535a);
                C23067b.m43232e(il.getParent() == null);
                this.f63535a.addView(il, this.f63535a.indexOfChild(view2) + 1);
            } else {
                C23067b.m43232e(view2.getParent() == null);
                C23067b.m43232e(il.getParent() == this.f63535a);
                this.f63535a.addView(view2, this.f63535a.indexOfChild(il));
            }
        } else if (il.getParent() == null) {
            this.f63535a.addView(il);
        } else {
            C23067b.m43232e(il.getParent() == this.f63535a);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator, animator2});
        animatorSet.addListener(new C23136f(new C23164a(this, runnable, z, view2, il)));
        animatorSet.start();
        this.f63539e = animatorSet;
    }

    /* renamed from: f */
    private static final Animator m43357f(C23134d dVar, C22939d dVar2) {
        if (dVar2 != null) {
            return dVar.mo28582a(dVar2.mo28297il());
        }
        return new AnimatorSet();
    }

    /* renamed from: g */
    private static final Animator m43358g(C23134d dVar, C22939d dVar2) {
        TimeInterpolator timeInterpolator;
        if (dVar2 == null) {
            return new AnimatorSet();
        }
        Animator clone = dVar.mo28582a(dVar2.mo28297il()).clone();
        if (clone.getInterpolator() != null) {
            timeInterpolator = clone.getInterpolator();
        } else {
            timeInterpolator = new AccelerateDecelerateInterpolator();
        }
        clone.setInterpolator(new C23131a(timeInterpolator));
        return clone;
    }

    /* renamed from: a */
    public final void mo28612a(C22939d dVar, C22939d dVar2, Runnable runnable) {
        if (dVar == null && this.f63536b != null) {
            runnable = new C23165b(this, runnable);
        }
        m43356e(dVar, dVar2, runnable, false);
    }

    /* renamed from: b */
    public final void mo28613b(C22939d dVar, C22939d dVar2, Runnable runnable) {
        m43356e(dVar, dVar2, runnable, true);
    }

    /* renamed from: c */
    public final void mo28614c(C22939d dVar) {
        m43355d();
        this.f63535a.addView(dVar.mo28297il());
    }
}
