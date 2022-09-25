package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p8009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.ui.e */
/* compiled from: PG */
final class C102237e extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C102238f f285277a;

    public C102237e(C102238f fVar) {
        this.f285277a = fVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f285277a.f285280c.f285270f.setOnClickListener(new C102236d(this));
    }
}
