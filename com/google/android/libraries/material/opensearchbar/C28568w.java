package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.opensearchbar.w */
/* compiled from: PG */
final class C28568w extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28571z f77649a;

    public C28568w(C28571z zVar) {
        this.f77649a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        OpenSearchView openSearchView = this.f77649a.f77653a;
        if (!openSearchView.mo34109k()) {
            openSearchView.mo34104f();
        }
        this.f77649a.f77653a.mo34110l(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f77649a.f77654b.setVisibility(0);
        this.f77649a.f77653a.mo34110l(3);
    }
}
