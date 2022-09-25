package com.google.android.apps.gsa.staticplugins.opa.valyrian;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.RecyclerView;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ed */
/* compiled from: PG */
public final class C114068ed extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ RecyclerView f315777a;

    public C114068ed(RecyclerView recyclerView) {
        this.f315777a = recyclerView;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315777a.setVisibility(8);
        this.f315777a.setAlpha(1.0f);
    }
}
