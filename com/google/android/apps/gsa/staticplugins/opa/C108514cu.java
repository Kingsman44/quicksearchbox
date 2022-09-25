package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.cu */
/* compiled from: PG */
final class C108514cu extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109040fj f301923a;

    public C108514cu(C109040fj fjVar) {
        this.f301923a = fjVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f301923a.f303225K.mo95259k(8);
        C109040fj fjVar = this.f301923a;
        fjVar.f303232R.f301323c = true;
        fjVar.mo97497bG(2);
        View view = this.f301923a.f303220F;
        if (view != null) {
            view.setVisibility(0);
        }
        this.f301923a.f303450o.mo95375Q(false);
        this.f301923a.f303343bx = false;
    }

    public final void onAnimationStart(Animator animator) {
    }
}
