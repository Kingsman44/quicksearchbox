package com.google.android.libraries.componentview.p1697d;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.google.android.libraries.componentview.d.b */
/* compiled from: PG */
final class C20471b extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f57589a;

    /* renamed from: b */
    final /* synthetic */ int f57590b;

    public C20471b(View view, int i) {
        this.f57589a = view;
        this.f57590b = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f57589a.setVisibility(this.f57590b == 3 ? 8 : 4);
    }
}
