package com.google.android.libraries.lens.view.livingsurfaces;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.libraries.lens.view.livingsurfaces.w */
/* compiled from: PG */
final class C27269w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f74579a;

    public C27269w(View view) {
        this.f74579a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f74579a.setVisibility(8);
    }
}
