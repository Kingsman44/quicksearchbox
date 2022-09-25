package com.google.android.apps.gsa.staticplugins.opa;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.search.shared.p6941ui.C88522b;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ds */
/* compiled from: PG */
final class C108785ds extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C109040fj f302513a;

    public C108785ds(C109040fj fjVar) {
        this.f302513a = fjVar;
    }

    public final void onAnimationStart(Animator animator) {
        View d = ((C88522b) this.f302513a.f303254aN.mo56107c()).mo82142d();
        d.getClass();
        d.setOnClickListener((View.OnClickListener) null);
    }
}
