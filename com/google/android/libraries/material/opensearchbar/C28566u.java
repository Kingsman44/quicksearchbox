package com.google.android.libraries.material.opensearchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.p3504a.C44496a;

/* renamed from: com.google.android.libraries.material.opensearchbar.u */
/* compiled from: PG */
final class C28566u extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C28571z f77647a;

    public C28566u(C28571z zVar) {
        this.f77647a = zVar;
    }

    public final void onAnimationEnd(Animator animator) {
        OpenSearchView openSearchView = this.f77647a.f77653a;
        if (!openSearchView.mo34109k()) {
            openSearchView.mo34104f();
        }
        this.f77647a.f77653a.mo34110l(4);
    }

    public final void onAnimationStart(Animator animator) {
        this.f77647a.f77654b.setVisibility(0);
        OpenSearchBar openSearchBar = this.f77647a.f77657e;
        C28547b bVar = openSearchBar.f77585C;
        View view = openSearchBar.f77586D;
        if (view instanceof C44496a) {
            ((C44496a) view).mo47372a();
        }
        if (view != null) {
            view.setAlpha(0.0f);
        }
    }
}
