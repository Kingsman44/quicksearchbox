package com.google.android.libraries.componentview.p1697d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.libraries.componentview.d.c */
/* compiled from: PG */
public final class C20472c extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f57591a;

    public C20472c(View view) {
        this.f57591a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f57591a.setAlpha(0.0f);
        this.f57591a.setVisibility(0);
    }
}
