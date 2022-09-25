package com.google.android.apps.gsa.staticplugins.actionsui.modular;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.gsa.search.shared.actions.modular.arguments.Argument;

/* renamed from: com.google.android.apps.gsa.staticplugins.actionsui.modular.r */
/* compiled from: PG */
final class C93661r extends AnimatorListenerAdapter {

    /* renamed from: a */
    final /* synthetic */ C93566bq f261433a;

    /* renamed from: b */
    final /* synthetic */ CharSequence f261434b;

    /* renamed from: c */
    final /* synthetic */ Argument f261435c;

    /* renamed from: d */
    final /* synthetic */ Argument f261436d;

    /* renamed from: e */
    final /* synthetic */ CharSequence f261437e;

    public C93661r(C93566bq bqVar, CharSequence charSequence, Argument argument, Argument argument2, CharSequence charSequence2) {
        this.f261433a = bqVar;
        this.f261434b = charSequence;
        this.f261435c = argument;
        this.f261436d = argument2;
        this.f261437e = charSequence2;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f261433a.mo88129p(this.f261436d);
        C93566bq bqVar = this.f261433a;
        bqVar.f261446l = this.f261437e;
        bqVar.mo87732f();
    }

    public final void onAnimationStart(Animator animator) {
        C93566bq bqVar = this.f261433a;
        bqVar.f261446l = this.f261434b;
        bqVar.mo88129p(this.f261435c);
        this.f261433a.mo87732f();
    }
}
