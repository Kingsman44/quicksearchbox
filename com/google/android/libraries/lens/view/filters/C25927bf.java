package com.google.android.libraries.lens.view.filters;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.filters.bf */
/* compiled from: PG */
final class C25927bf extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f70429a;

    public C25927bf(View view) {
        this.f70429a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f70429a.setVisibility(8);
    }
}
