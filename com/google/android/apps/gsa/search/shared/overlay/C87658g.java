package com.google.android.apps.gsa.search.shared.overlay;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.apps.gsa.searchplate.C88890a;

/* renamed from: com.google.android.apps.gsa.search.shared.overlay.g */
/* compiled from: PG */
final class C87658g extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C88890a f236918a;

    /* renamed from: b */
    final /* synthetic */ View f236919b;

    /* renamed from: c */
    final /* synthetic */ C87660i f236920c;

    public C87658g(C87660i iVar, C88890a aVar, View view) {
        this.f236920c = iVar;
        this.f236918a = aVar;
        this.f236919b = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f236918a.setAlpha(this.f236920c.f236927e);
        C87660i iVar = this.f236920c;
        if (iVar.f236930h && iVar.f236927e == 0) {
            this.f236919b.setVisibility(8);
        }
    }
}
