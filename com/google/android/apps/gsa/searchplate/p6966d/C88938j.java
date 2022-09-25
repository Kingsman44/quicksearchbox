package com.google.android.apps.gsa.searchplate.p6966d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.apps.gsa.searchplate.d.j */
/* compiled from: PG */
final class C88938j extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final View f240927a;

    /* renamed from: b */
    private final int f240928b = 4;

    /* renamed from: c */
    private boolean f240929c;

    public C88938j(View view) {
        this.f240927a = view;
    }

    public final void onAnimationCancel(Animator animator) {
        this.f240929c = true;
    }

    public final void onAnimationEnd(Animator animator) {
        if (!this.f240929c) {
            this.f240927a.setVisibility(this.f240928b);
        }
    }
}
