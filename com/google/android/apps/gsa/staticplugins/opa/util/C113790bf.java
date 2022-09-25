package com.google.android.apps.gsa.staticplugins.opa.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bf */
/* compiled from: PG */
final class C113790bf extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ View f315143a;

    /* renamed from: b */
    final /* synthetic */ C113793bi f315144b;

    public C113790bf(C113793bi biVar, View view) {
        this.f315144b = biVar;
        this.f315143a = view;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f315144b.mo100646f();
        RecyclerView recyclerView = (RecyclerView) this.f315143a.findViewById(R.id.suggestion_container);
        if (recyclerView != null) {
            recyclerView.scrollToPosition(0);
        }
    }
}
