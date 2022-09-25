package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.google.android.libraries.material.opensearchbar.x */
/* compiled from: PG */
final class C28569x extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28571z f77650a;

    public C28569x(C28571z zVar) {
        this.f77650a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f77650a.f77654b.setVisibility(8);
        OpenSearchView openSearchView = this.f77650a.f77653a;
        if (!openSearchView.mo34109k()) {
            openSearchView.mo34101c();
        }
        this.f77650a.f77653a.mo34110l(2);
    }

    public final void onAnimationStart(Animator animator) {
        this.f77650a.f77653a.mo34110l(1);
    }
}
