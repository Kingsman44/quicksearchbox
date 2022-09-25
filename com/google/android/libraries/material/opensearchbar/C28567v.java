package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.opensearchbar.v */
/* compiled from: PG */
final class C28567v extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28571z f77648a;

    public C28567v(C28571z zVar) {
        this.f77648a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f77648a.f77654b.setVisibility(8);
        OpenSearchView openSearchView = this.f77648a.f77653a;
        if (!openSearchView.mo34109k()) {
            openSearchView.mo34101c();
        }
        this.f77648a.f77653a.mo34110l(2);
    }

    public final void onAnimationStart(Animator animator) {
        this.f77648a.f77653a.mo34110l(1);
    }
}
